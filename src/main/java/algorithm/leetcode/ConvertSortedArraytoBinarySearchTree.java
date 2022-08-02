package algorithm.leetcode;


import main.java.algorithm.leetcode.common.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        new ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(nums);
    }

    TreeNode result;
    TreeNode left;
    TreeNode right;

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length == 0 || nums == null) return null;
        else {
            int midPos = nums.length/2;
            int pointer = 0;
        }

        return null;
    }

}

//    Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
//        A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

//Constraints:
//    1 <= nums.length <= 104
//    -104 <= nums[i] <= 104
//    nums is sorted in a strictly increasing order.