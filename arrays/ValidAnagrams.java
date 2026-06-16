// Problem: Valid-Anagram [https://leetcode.com/problems/valid-anagram]
//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

// 🔴 Brute Force Approach:
// Check every pair
// Time complexity - 
// Space Complexity - 


//Count occurrences in s
// Count occurrences in t
// Compare
// That becomes inefficient because you're repeatedly scanning strings.
// ✅ Optimized Approach (int array):
// Time complexity: O(n)
// Space Complexity: O(1) - Fixed size array of 26
//Constraints:
// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }
}

//Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
// TIME complexity - O(n) 
// SPACE - O(n)
/*
public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
        return false;
    }

    Map<Character, Integer> map = new HashMap<>();

    for (char ch : s.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (char ch : t.toCharArray()) {
        map.put(ch, map.getOrDefault(ch, 0) - 1);
    }

    for (int count : map.values()) {
        if (count != 0) {
            return false;
        }
    }

    return true;
}
*/
