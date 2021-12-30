package com.example.leetcode.editor.cn;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 👍 1341 👎 0

import java.util.Arrays;

public class 移动零 {
    public static void main(String[] args) {
        Solution solution = new 移动零().new Solution();
        int[] a = new int[]{0, 1, 0, 3, 12};

        solution.moveZeroes(a);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int i = 0, j = 0;
            //j指针进行遍历
            for (j = 0; j < nums.length; j++) {
                //如果j不等于0，那就赋值给i，同时ij都右移
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    i++;
                }
            }

            //移动之后，j右边都是不为0
            for (; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}