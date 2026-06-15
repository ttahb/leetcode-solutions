// Problem: Contains Duplicate - https://leetcode.com/problems/contains-duplicate/

// 🔴 Brute Force Approach:
// Check every pair
// Time complexity - O(n^2) 
// Space Complexity - O(1)

/*
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
*/

// ✅ Optimized Approach (HashSet):
// Time complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
