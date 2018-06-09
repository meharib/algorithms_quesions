# Technical Interview Practice Questions And Solutions
1. Two Sums: [Solution](src/main/java/TwoSums.java)

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
```Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].    
```

2. Add Two Numbers: [Solution](src/main/java/AddTwoNumbers.java)

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
```
Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```

3. Longest Non-Repeating Substring: [Solution](src/main/java/LongestNonRepeatingSubstring.java)

Given a string, find the length of the longest substring without repeating characters.
```
Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

4. Median of two sorted Arrays<br>
[Solution](src/main/java/SortedArraysMedian.java)<br>
[Code Credit](https://github.com/mission-peace/interview/blob/master/src/com/interview/binarysearch/MedianOfTwoSortedArrayOfDifferentLength.java)<br>
[Youtube explanation](https://www.youtube.com/watch?v=LPFhl65R7ww)<br>

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
```
Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
```

5. Longest Palindromic Substring <br>
[Solution](src/main/java/LongestPalindromicSubstring.java)<br>
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.<br>

```
Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
```

6.Zigzag pattern <br>
[Solution](src/main/java/ZigZagConversion.java)<br>
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
```
P       A       H      N
A   P   L   S   I   I  G
Y       I       R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"

```

7. Reverse Integer<br>
[Solution](src/main/java/ReverseInteger.java)<br>
Given a 32-bit signed integer, reverse digits of an integer. If the reversed integer is above 32 bit return 0.<br>

```
Example 1:

Input: 123
Output: 321
```

8. Shortest Palindrome<br>
[Solution](src/main/java/ShortestPalindrome.java)<br>
Given a string s, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation<br>

```
Example 1:

Input: "aacecaaa"
Output: "aaacecaaa"
Example 2:

Input: "abcd"
Output: "dcbabcd"
```

9. String to Number - atoi<br>
[Solution](src/main/java/StringToNumber.java)<br>
Implement atoi which converts a string to an integer.<br>
- discard all whitespace characters until the first non-whitespace charater
- string can contain additional characters after the number part
- string can contain an optional + or - sign
- return Max Int if the number overflows 32 bit int
<br>

```
Example 1:

Input: "42"
Output: 42
Example 2:

Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.
Example 3:

Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
Example 4:

Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.
Example 5:

Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.

```

10 Check Water Flows - Graph Solution<br>
Given a matrix array that contains only 0,1 to represent a set of pipes. 1 represent water can flow through 0 represent pipe is blocked.
Water can flow in all four directions, North, South, East, West but not diagonal. Deterimine if a water can flow from top row to bottom row.
```
Example 1 
input {{1,0,0,1},
       {0,0,1,1},
       {1,0,1,0}}
output: true

Example 2 
input {{1,0,0,1},
       {0,1,0,1},
       {1,0,1,0}}
output: false
```
[Solution](src/main/java/FlowCheckerWithGraph.java)<br>
Solution Approach 
- the problem can be converted to into a graph connectivity.
- we constract a graph such that
-  Each element in the matrix can be represented by a vertex
- from each vertex we add edges(maximum 4) if there are the neighbouring vertices have value 1
- we add a start vertex at the top and end vertex at the bottom and connect the top and the bottom rows 
- note that since this is undirected graph we add the edges both ways for the bottom and the two rows 
-Then we run either breadth first search or, depth first search to check if there is a connectivity between the start and the end vertex


