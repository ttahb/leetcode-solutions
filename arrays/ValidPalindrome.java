// Problem: Valid Palindrome - https://leetcode.com/problems/valid-palindrome/

// 🔴 Brute Force Approach:
// Reverse the string and compare 
// Time complexity - O(n) 
// Space Complexity - O(n)


// ✅ Optimized Approach (Use Two Pointers - Takes constant memory, checks in place ):
// Time complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
