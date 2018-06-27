# Technical Interview Practice Questions And Solutions
## Backtracking
1 Check Water Flows - Backtracking Solution<br>
Given a matrix array that contains only 0,1 to represent a set of pipes. 1 represent water can flow through 0 represent pipe is blocked.
Water can flow in all four directions, North, South, East, West but not diagonal. Determine if a water can flow from top row to bottom row.
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
[Solution](src/main/java/backtracking/FlowCheckerWithBackTracking.java)<br>
when recursively exploring all four directions if one the four directions returns true then the caller should return true.
If all return false, then the caller should return false.<br>

2 Print All Subsets<br>
Give a set like {"a", "b", "c"} print all possible subsets the number is 2^n so in this case 8 if we exclude empty set it is 7

[Solution](src/main/java/backtracking/PrintAllSubSetsOfASet.java)<br>
- the main idea is to generate the Power Set. The Power Set is a set that contains all subset of a given set.
- for each element in the list take the first element and union it with remined of the set<br>
[Stackoverflow reference](https://stackoverflow.com/questions/4640034/calculating-all-of-the-subsets-of-a-set-of-numbers)<br>

3 Subset Sum
This is an extension of the all subsets problem. Given a set of integers and a target sum. Check if the target can be achieved by adding a subset of the numbers.
[Solution](src/main/java/backtracking/SubsetSum.java)<br>

4 Construct work from input string array<br>
Give an input array of strings determine if a word can be constructed from the input array.
Example: Given {'int', 'bar','er','view'} and 'interview' return true or given {'b','o','k'} and 'book' return true<br>
[Solution](src/main/java/backtracking/ConstructWordFromInputs.java)<br>
We build the power set of the given input strings, two tings we do is we only check if the word starts with the given input
and when we backtrack if one of the backtrack paths returns true then we retrun true.
## Dynamics Programming
### Tree
1 Binary Search Tree implementation<br>
The main operations a binary tree needs to have are
 - insert: 
 - contains: should be done in O(log n) time.
 - print in order: print/visit smallest to largest element left->middle->right
 - print Post order: left ->right -> middle 
 - print Pre order: middle -> left -> right 
[Solution](src/main/java/trees/Node.java)<br>

2 Given a sorted array convert it into a balanced binary tree
[Solution](src/main/java/trees/SortedArrayToTree.java)<br>

3 Given a binary tree find its height<br>
Solution<br>
We can do BFS search here and keept track of each level but there is a more simple and elegant solution that works at O(n) time<br>
[Solution](src/main/java/trees/TreeDepth.java)<br>

4 Given a binary tree check if it is a binary search tree or not<br>
Solution<br>
There are two approaches. Recursive - notice that the left sub tree should have a maximum element value that is at max the current node value.
Similary the right sub tree should have a minimum element value that is at minimum the current node value.
We use these upper and lower limit bounds to recursively check all the elements
Approch 2 is to simply do in-order traversal and store the result in an array then check the array if all elements in the array are ordered
[Solution](src/main/java/trees/CheckIfBinaryTreeIsSearchTreeApproachOne.java)<br>
5 Max heap Implementation<br>
Key properties to remember
 - the head element is always at index 0
 - the left of the ith element is found at 2*i
 - the right of the ith element is found at left element +1
 - the parent of the ith element is found at i/2
 - when we enqueue a new element we add it at the last index of the array and we heapify the data upward
 - when we dequeue an element we replace the element at index 0 with the element that is at the end of the array and we heapify downward.
 - the heapify method(heapify up or heapfy down ) is the core of this data strcuture. what it does is simply compare the current element to its children(if heapify down) or to its parent (heapify up) and swap them if the value does not match.
 - the simple rule for heapify Max is the parent should be greater than or equal to its children
 [Solution](src/main/java/trees/BinaryHeap.java)<br>

6 Top View of a Tree
Given a binary tree print the top view 
example 

    1
    \
     2
      \
       5
      /  \
     3    6
      \
      4
      
output: 1 2 5 6  
Solution<br>
   - Measure the horizontal distance of each node from the root 
   - Do a BFS 
   - print out the result in ascending order of their horizontal distance 
 [Solution](src/main/java/trees/TopView.java)<br>    
## Graph
## Divide & Concure

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
<br>
11. Shortest Path from police station to town<br>
Suppose there are n towns connected by m bidirectional roads. There are s towns among them with a police station. 
We want to find out the distance of each town from the nearest police station. If the town itself has one the distance is 0.
Assume that all roads has only a unit distance<br>

```
Example
Input : 
Number of Vertices = 6
Number of Edges = 9
Towns with Police Station : 1, 5
Graph:
{
1: {2,6}
2: {6,3}
3: {6,4}
4: {}
5: {4,3}
6: {5}
}


Output :
1 0
2 1
3 1
4 1
5 0
6 1
```

Solution:
The information can be represented as a graph. Then we can run Dijkstra Algorithm from the vertices that represent the police station.
Dijkstra requies O(|V|+|E|)log(|V|) time because it uses a priority queue which requires log(|V|) time for lookup.<br>
[Solution](src/main/java/ShortestPathFromPoliceStation.java) <br>

12 Subset Sum <br>
Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
```
Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output:  True  //There is a subset (4, 5) with sum 9.
```

Solution
[Solution](src/main/java/SubSetSum.java) <br>

12 Perfect Subset Sum<br>
Given an array of integers and a sum, the task is to print all subsets of given array with sum equal to given sum.
```
Examples:
Input : arr[] = {2, 3, 5, 6, 8, 10}
        sum = 10
Output : 5 2 3
         2 8
         10

Input : arr[] = {1, 2, 3, 4, 5}
        sum = 10
Output : 4 3 2 1 
         5 3 2 
         5 4 1 
```
Solution
Build the Dynamic Programming Tree first then back trace it
[Solution](src/main/java/PerfectSum.java) <br>     

13 Valid Path<br>
There is a rectangle with left bottom as  (0, 0) and right up as (x, y). There are N circles such that their centers are inside the rectangle. 
Radius of each circle is R. Now we need to find out if it is possible that we can move from (0, 0) to (x, y) without touching any circle.
Note : We can move from any cell to any of its 8 adjecent neighbours and we cannot move outside the boundary of the rectangle at any point of time.
   
   Constraints
    0 <= x , y , R <= 100  
    1 <= N <= 1000 
  
   Center of each circle would lie within the grid
   
   Input
   Input contains x, y , N , R  and two array of size N containing centers of circles.
   The ith index of first array contains x co-ordinate of the ith circle and ith index of second array contains the y co-ordinate of the ith circle.
   
   Output 
   YES or NO depending on weather it is possible to reach cell  (x,y) or not starting from (0,0).
<br>
Solution
- Convert the rectangle into a graph
- Exclude all vertices that are covered by the circle areas
- Run BFS to see if we can access the end point starting from origin
[Solution](src/main/java/GraphValidPath.java) <br> 

##Union find<br>
1 Baby Names<br>
Each year, the government releases a list of the 10000 most common baby names and their frequencies (the number of babies with that name). The only problem with this is that some names have multiple spellings. For example, "John" and "Jon" are essentially the same name but would be listed separately in the list. Given two lists, one of names/frequencies and the other of pairs of equivalent names, write an algorithm to print a new list of the true frequency of each name. Note that if John and Jon are synonyms, and Jon and Johnny are synonyms, then John and Johnny are synonyms. (It is both transitive and symmetric.) In the final list, any name can be used as the "real " name.
EXAMPLE
Input:
Names: John (15), Jon (12), Chris (13), Kris (4), Christopher (19)
Synonyms: (Jon, John), (John, Johnny), (Chris, Kris), (Chris, Christopher)
Output: John (27), Kris (36)

[Solution](src/main/java/unionfind/BabyNames.java) <br>

