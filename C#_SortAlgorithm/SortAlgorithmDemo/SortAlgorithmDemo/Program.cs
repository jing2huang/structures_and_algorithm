using System;

namespace SortAlgorithmDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] nums = {30, 10, 82, 25, 91, 72, 10, 11, 4, 13, 82 , 72, 82, 30};

            //BubbleSort(nums);
            //SelectSort(nums);
            //InsertSort(nums);
            //QuickSort(nums);

            //int[] temArr = new int[nums.Length];
            //MergeSort(nums, temArr, 0, nums.Length - 1);

            //ShellSort(nums);

            Console.Write("希尔排序：");
            for (int i = 0; i < nums.Length; i++)
            {
                Console.Write(nums[i] + " ");
            }
            Console.ReadKey();
        }

        /// <summary>
        /// 希尔排序
        /// </summary>
        /// <param name="nums"></param>
        static void ShellSort(int[] nums)
        {
            for (int gap = nums.Length / 2; gap > 0; gap /= 2)
            {
                for (int i = gap; i < nums.Length; i++)
                {
                    int index = i;
                    while ((index - gap) >= 0 && nums[index] < nums[index - gap])
                    {
                        SwapNum(nums, index, index - gap);
                        index -= gap;
                    }
                }
            }
        }

        #region Merge Sort
        /// <summary>
        /// 归并排序
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="preIndex"></param>
        /// <param name="lastIndex"></param>
        static void MergeSort(int[] nums, int[] temArr, int preIndex, int lastIndex)
        {
            if (preIndex < lastIndex)
            {
                int cenIndex = (preIndex + lastIndex) / 2;
                MergeSort(nums, temArr, preIndex, cenIndex);
                MergeSort(nums, temArr, cenIndex + 1, lastIndex);
                DoMergeSort(nums, temArr, preIndex, lastIndex, cenIndex);
            }
        }

        static void DoMergeSort(int[] nums, int[] temArr, int preIndex, int lastIndex, int cenIndex)
        {
            int leftIndex = preIndex;
            int rightIndex = cenIndex + 1;
            int index = preIndex;
            int numElem = lastIndex - preIndex + 1;

            while (leftIndex <= cenIndex && rightIndex <= lastIndex)
            {
                if (nums[leftIndex] > nums[rightIndex])
                {
                    temArr[index++] = nums[rightIndex++];
                } else {
                    temArr[index++] = nums[leftIndex++];
                }           
            }
            
            while (leftIndex <= cenIndex)
            {
                temArr[index++] = nums[leftIndex++];
            }

            while (rightIndex <= lastIndex)
            {
                temArr[index++] = nums[rightIndex++];
            }

            for (int i = preIndex; i <= lastIndex; i++)
            {
                nums[i] = temArr[i];
            }
        }
        #endregion

        #region Quick sort
        /// <summary>
        /// 快速排序
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        static void QuickSort(int[] nums)
        {
            QuickSort(nums, 0, nums.Length - 1);
        }

        static void QuickSort(int[] nums, int startIndex, int endIndex)
         {
            if (startIndex >= endIndex)
                return;

            int temp = nums[startIndex];
            int preIndex = startIndex + 1;
            int lastIndex = endIndex;
            while(preIndex < lastIndex)
            {
                //[1]while (nums[lastIndex] > temp && preIndex < lastIndex)
                while (nums[lastIndex] >= temp && preIndex < lastIndex)
                    lastIndex--;
                //[1]while (nums[preIndex] < temp && preIndex < lastIndex)
                while (nums[preIndex] <= temp && preIndex < lastIndex)
                    preIndex++;
                if (preIndex >= lastIndex)
                    break;

                SwapNum(nums, preIndex, lastIndex);

                //[1]解决一个元素重复出现问题: 若一个数组中同一个元素出现3次以上,preIndex和lastIndex不改变造成的死循环问题
                //preIndex++;
                //lastIndex--;
            }

            if (nums[lastIndex] < nums[startIndex])
                SwapNum(nums, startIndex, lastIndex);

            QuickSort(nums, startIndex, lastIndex - 1);
            QuickSort(nums, lastIndex, endIndex);
        }
        #endregion

        /// <summary>
        /// 插入排序
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        static void InsertSort(int[] nums)
        {
            for (int i = 0; i < nums.Length; i++)
            {
                for (int j = i; j > 0; j--)
                {
                    if (nums[j] < nums[j - 1])
                    {
                        SwapNum(nums, j - 1, j);
                    } else
                    {
                        break;
                    }
                }
            }
        }

        /// <summary>
        ///  选择排序
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        static void SelectSort(int[] nums)
        {
            for (int i = 0; i < nums.Length; i++)
            {
                int maxIndex = 0;
                int max = nums[0];
                for (int j = 1; j < nums.Length - i; j++)
                {
                    if (max < nums[j])
                    {
                        max = nums[j];
                        maxIndex = j;
                    }
                }
                SwapNum(nums, maxIndex, nums.Length - i - 1);
            }
        }

        /// <summary>
        /// 冒泡排序
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        static void BubbleSort(int[] nums)
        {
            for (int i = 0; i < nums.Length; i++)
            {
                int temp = 0;
                for (int j = 0; j < nums.Length - i - 1; j++)
                {
                    if (nums[j] > nums[j + 1])
                    {
                        SwapNum(nums, j, j + 1);
                    }
                }
            }
        }

        /// <summary>
        /// Swap the location for two elements.
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="preIndex"></param>
        /// <param name="lastIndex"></param>
        static void SwapNum(int[] nums, int preIndex, int lastIndex)
        {
            if (preIndex != lastIndex)
            {
                int temp = nums[preIndex];
                nums[preIndex] = nums[lastIndex];
                nums[lastIndex] = temp;
            }
        }

    }
}
