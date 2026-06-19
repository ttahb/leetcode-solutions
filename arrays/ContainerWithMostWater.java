// Problem: Container-With-Most-Water [https://leetcode.com/problems/container-with-most-water/]
// 🔴 Brute Force Approach:
// Check every pair
// Time complexity - O(n^2)
// Space Complexity - O(1)
/*
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = (j - i);
                int minHeight = Math.min(height[i], height[j]);
                int area = width * minHeight;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
*/
// ✅ Optimized Approach (Using two pointers moving inward based on height comparison to maximize area.):
// Time complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
