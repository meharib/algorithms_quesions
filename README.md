# Technical Interview Practice Questions<br/>

- [Backtracking](#backtracking)
    - [Check Water Flow](#1-check-water-flow)
    - [Print All Subsets](#2-print-all-subsets)
    - [Subset Sum](#3-subset-sum)
    - [Construct word from input string array](#4-construct-word-from-input-string-array)
- [Dynamic Programming](#dynamic-programming)
    - [Longest Non-Repeating Substring](#1-longest-non-repeating-substring)
    - [Median of two sorted Arrays](#2-median-of-two-sorted-arrays)
    - [Longest Palindromic Substring](#3-longest-palindromic-substring)
    - [Subset Sum](#4-subset-sum)
    - [Perfect Subset Sum](#5-perfect-subset-sum)
- [Tree](#tree)
    - [Binary Search Tree Implementation](#1-binary-search-tree-implementation)
    - [Sorted Array To Binary Tree](#2-sorted-array-to-binary-tree)
    - [Height of a Tree](#3-height-of-a-tree)
    - [Check If Binary Tree is A Search Tree](#4-check-if-it-binary-tree-is-search-tree)
    - [Max Heap Implementation](#5-max-heap-implementation)
    - [Top View of a tree](#6-top-view-of-a-tree)
    - [Trie tree implementation](#7-trie-tree-implementation)
    - [Trie tree prefix](#8-trie-tree-prefix)
    - [Largest Smaller BST Key](#9-largest-smaller-bst-key)
- [Graph](#graph) 
    - [Check Water Flows](#1-check-water-flows---graph-solution)
    - [Shortest Path](#2-shortest-path-from-police-station-to-town)
    - [Valid Path](#3-valid-path)
    - [BFS Implementation](#4-bfs-implementation)
    - [Level Order Tranversal](#5-level-order-traversal)
    - [DFS Implementation](#6-dfs-implementation)
    - [Island Count](#7-island-count)
    - [Sales Path](#8-sales-path)
    

- [Union Find](#union-find)
    - [Baby Names](#1-baby-names)
- [Sorting](#sorting)
    - [Implement Quick Sort](#1-implement-quick-sort)
    - [Interval Sorting](#2-interval-sorting)
    - [Pancake Sorting](#3-pancake-sorting)
    - [Bubble Sorting](#4-bubble-sorting)
- [Searching](#searching)
    - [Given a sorted matrix and a number verify if the number exists](###1-given-a-sorted-matrix-and-a-number-verify-if-the-number-exists)
    - [Find Duplicates](#2-find-duplicates)
- [Miscellaneous](#miscellaneous)
    - [Shortest Unique Substring](#1-shortest-unique-substring)
    - [Two Sums](#2-two-sums)
    - [Add Two Numbers](#3-add-two-numbers)
    - [Zigzag pattern](#4-zigzag-pattern)
    - [Reverse Integer](#5-reverse-integer)
    - [Shortest Palindrome](#6-shortest-palindrome)
    - [String to Number - atoi](#7-string-to-number---atoi)
    - [Array Quadrants](#8-array-quadrants)

## Backtracking

### 1 Check Water Flow<br>
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

### 2 Print All Subsets<br>
Give a set like {"a", "b", "c"} print all possible subsets the number is 2^n so in this case 8 if we exclude empty set it is 7

[Solution](src/main/java/backtracking/PrintAllSubSetsOfASet.java)<br>
- the main idea is to generate the Power Set. The Power Set is a set that contains all subset of a given set.
- for each element in the list take the first element and union it with remined of the set<br>
[Stackoverflow reference](https://stackoverflow.com/questions/4640034/calculating-all-of-the-subsets-of-a-set-of-numbers)<br>

### 3 Subset Sum</b>
This is an extension of the all subsets problem. Given a set of integers and a target sum. Check if the target can be achieved by adding a subset of the numbers.
[Solution](src/main/java/backtracking/SubsetSum.java)<br>

### 4 Construct word from input string array<br>
Give an input array of strings determine if a word can be constructed from the input array.
Example: Given {'int', 'bar','er','view'} and 'interview' return true or given {'b','o','k'} and 'book' return true<br>
[Solution](src/main/java/backtracking/ConstructWordFromInputs.java)<br>
We build the power set of the given input strings, two tings we do is we only check if the word starts with the given input
and when we backtrack if one of the backtrack paths returns true then we retrun true.

## Dynamic Programming<br>
### 1 Longest Non Repeating Substring<br>

Given a string, find the length of the longest substring without repeating characters.
```
Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```
<br>
[Solution](src/main/java/LongestNonRepeatingSubstring.java)<br>

### 2 Median of two sorted Arrays<br>
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
### 3 Longest Palindromic Substring<br>
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
### 4 Subset Sum <br>
Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
```
Examples: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output:  True  //There is a subset (4, 5) with sum 9.
```

Solution
    - we can use dynamic programming to solve this in O(n*m) time
    - i will be a counter for the set x
    - j will be a counter for the range 1 to target number
    - base case T[0,j] = false;
    - T[i,j] = true if x[i]==j || T[i, j-x[i]] false otherwise
[Solution](src/main/java/SubSetSum.java) <br>

### 5 Perfect Subset Sum<br>
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
## Tree
### 1 Binary Search Tree implementation<br>
The main operations a binary tree needs to have are
 - insert: 
 - contains: should be done in O(log n) time.
 - print in order: print/visit smallest to largest element left->middle->right
 - print Post order: left ->right -> middle 
 - print Pre order: middle -> left -> right 
[Solution](src/main/java/trees/Node.java)<br>

### 2 Sorted Array To Binary Tree</b>
[Solution](src/main/java/trees/SortedArrayToTree.java)<br>

### 3 Height of A Tree</b><br>
Solution<br>
We can do BFS search here and keep track of each level but there is a more simple and elegant recursive solution that works at O(n) time.<br>
[Solution](src/main/java/trees/TreeDepth.java)<br>

### 4 Check if it binary tree is search tree<br>
Solution<br>
There are two approaches. Recursive - notice that the left sub tree should have a maximum element value that is at max the current node value.
Similary the right sub tree should have a minimum element value that is at minimum the current node value.
We use these upper and lower limit bounds to recursively check all the elements
Approch 2 is to simply do in-order traversal and store the result in an array then check the array if all elements in the array are ordered
[Solution](src/main/java/trees/CheckIfBinaryTreeIsSearchTreeApproachOne.java)<br>

### 5 Max heap Implementation<br>
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

### 6 Top View of a Tree</b>
Given a binary tree print the top view
 ```
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
 ```     
output: 1 2 5 6  
Solution<br>
   - Measure the horizontal distance of each node from the root 
   - Do a BFS 
   - print out the result in ascending order of their horizontal distance 
 [Solution](src/main/java/trees/TopView.java)<br>    

### 7 Trie Tree implementation</b>
 [Solution](src/main/java/trees/TrieNode.java)<br> 

### 8 Trie Tree Prefix</b>
Given  strings. Each string contains only lowercase letters. The set of  strings is said to be GOOD SET if no string is prefix of another string else, 
it is BAD SET. (If two strings are identical, they are considered prefixes of each other.)

return null if it is a  GOOD SET that satisfies the problem requirement. 
Else, return the first string for which the condition fails if it is a BAD SET.
```
Example
input: {aab, defgab, abcde, aabcde, cedaaa, bbbbbbbbbb, jabjjjad}
output: aabcde


input: {aab,aac,aacghgh,aabghgh}
output: aacghgh
Explanation 
aab is prefix of aabcde. So set is BAD SET and it fails at string aabcde.
```

Solution<br>
Use Trie Tree to keep track of the prefix, there are two conditions to check.
- if there exists a word(with the isEnd flag turned on) that matches the current word that is getting inserted, return the current word
- If the current word that is getting inserted can be a prefix to a previously inserted word, return the current word

[Solution](src/main/java/trees/TrieTreePrefixSet.java)<br> 

### 9 Largest Smaller BST Key
Given a root of a Binary Search Tree (BST) and a number num, 
implement an efficient function findLargestSmallerKey that finds the largest key in the tree 
that is smaller than num. If such a number doesn’t exist, return -1. 
Assume that all keys in the tree are nonnegative.

Solution
    - we can use a recursive solution or a while loop
    - start with the root node, if the node value is greater than the number look for the left side
    - if the node value is smaller than the number and the right side of the node is not null and smaller than the number make a recursive call
    - the base case is if the node is small and the next node is greater than the number or null
    [Solution](src/main/java/trees/LargestSmallerBSTKey.java)<br> 
## Graph
### 1 Check Water Flows - Graph Solution<br>
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
[Solution](src/main/java/graph/FlowCheckerWithGraph.java)<br>
Solution Approach 
    - the problem can be converted to into a graph connectivity.
    - each cell with a value of 1 is considered as a vertex.
    - neigboring cells in all four directions are considered as adjcent vertices. 
    - whenever we visited a vertex we change its value to -1 to flag it as visited
    - we iterate only over the top row and do a dfs when we get a cell value of 1
    - if the dfs exploration reach the bottom row we stop otherwise we continue until we exhaust all options
<br>

### 2 Shortest Path from police station to town<br>
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
[Solution](src/main/java/graph/ShortestPathFromPoliceStation.java) <br>

### 3 Valid Path<br>
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
[Solution](src/main/java/graph/GraphValidPath.java) <br> 

### 4 BFS implementation
Solution
    - uses queue
    - keep track of the visited nodes in a separate set
    [Solution](src/main/java/graph/BFSImplementation.java) <br> 
### 5 Level Order Traversal
Given a binary tree, return the level order traversal of its nodes’ values. (ie, from left to right, level by level).
```
Example :
Given binary tree

    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]
```

Solution
    - we can use BFS to traverse the tree
    - Since it is a tree there is no need to keep track of the visited nodes
    - We use a separate storage queue to keep track of level
[Solution](src/main/java/graph/LevelOrderTraversal.java) <br> 

### 6 DFS Implementation 
Solution:
  option 1: using stacks
  option 2: using recursive call to explore
  [Solution](src/main/java/graph/DFSImplementation.java) <br> 
### 7 Island Count
Solution:
    - with a double loop iterating over all elements, 
    - if we get a 1 flag it as visited by changing its value to -1 and flag all neighboring cells
    - we have to options to flag neighbouring cells
        - option 1: use dfs/bfs with a stack or a queue to visit all the neighbours in four directions
        - option 2: use recursive call to explore the neighbours
    [Solution](src/main/java/graph/IslandCount.java) <br> 
### 8 Sales Path
The car manufacturer Honda holds their distribution system in the form of a tree (not necessarily binary). 
The root is the company itself, and every node in the tree represents a car distributor that receives cars 
from the parent node and ships them to its children nodes. The leaf nodes are car dealerships that sell cars 
direct to consumers. In addition, every node holds an integer that is the cost of shipping a car to it.
Honda wishes to find the minimal Sales Path cost in its distribution tree. Given a node rootNode, write a function 
getCheapestCost that calculates the minimal Sales Path cost in the tree.
The node class is defined is below
```
  static class Node {  
    int cost;
    Node[] children;
    Node parent;

    Node(int cost) {
      this.cost = cost;
      children = null;
      parent = null;
    }
  }
  
  Example
       0
    /  |  \
   5   3    6
  /   / \  / \
 4   2  0 1  5
    /   /
   1   10
  /
 1 

The shortest path is  0->3->0->10 with a total of 13
```

Solution
- for each node that is connected to the root node run a dfs
- use a recursive explore method for the dfs. Using a Stack data structure is possible but the recursive call is simpler
- notice the pattern used to manage the returns from different recursive calls
[Solution](src/main/java/graph/ShortestSalesPath.java) <br> 

## Union find<br>
### 1 Baby Names<br>
Each year, the government releases a list of the 10000 most common baby names and their frequencies (the number of babies with that name). The only problem with this is that some names have multiple spellings. For example, "John" and "Jon" are essentially the same name but would be listed separately in the list. Given two lists, one of names/frequencies and the other of pairs of equivalent names, write an algorithm to print a new list of the true frequency of each name. Note that if John and Jon are synonyms, and Jon and Johnny are synonyms, then John and Johnny are synonyms. (It is both transitive and symmetric.) In the final list, any name can be used as the "real " name.
EXAMPLE
Input:
Names: John (15), Jon (12), Chris (13), Kris (4), Christopher (19)
Synonyms: (Jon, John), (John, Johnny), (Chris, Kris), (Chris, Christopher)
Output: John (27), Kris (36)

[Solution](src/main/java/unionfind/BabyNames.java) <br>


## Sorting<br>
### 1 Implement Quick Sort
[Solution](src/main/java/sorting/QuickSort.java) <br>

### 2 Interval Sorting<br>
Given a collection of intervals, merge all overlapping intervals.
```
Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considerred overlapping.
```

Solution<br>
First sort the intervals by their start, then starting from the first interval try to merge them
[Solution](src/main/java/sorting/IntervalSorting.java) <br>

### 3 Pancake Sorting
Write a function flip(arr, k) that reverses the order of the first k elements in the array arr.
Write a function pancakeSort(arr) that sorts and returns the input array. 
You are allowed to use only the function flip you wrote in the first step in order to make changes in the array.

Solution
- scan through the array elements and find the largest element
- flip the array to put the largest element at the front of the element
- fip the array again to put it at the right position in the array
- repeat this step until all elements are sorted
[Solution](src/main/java/sorting/PancakeSort.java)<br>

### 4 Bubble Sorting
Bubble sort implementation
- swap neighbouring elements if they are not inorder
- repeat this until all elements are ordered
[Solution](src/main/java/sorting/BubbleSort.java)

## Searching<br>
### 1 Given a sorted matrix and a number verify if the number exists
Solution<br>
- Treat the matrix like a single array and do binary search to find the element.
- given the position of the element it is possible to decode it into i,j position on the matrix
<br>
[Solution](src/main/java/searching/SearchSortedMatrix.java) <br>

### 2 Find duplicates
Given two sorted arrays arr1 and arr2 of integers, 
implement a function findDuplicates that returns an array of numbers that are both in arr1 and arr2. 
Note that the output array should be sorted in an ascending order.
Solution:
- option 1: 
    - pick the smallest array in size
    - iterate over each element of the small array and do a binary search on the larger array
    - running time is o(n log(m))
-option 2:
    - use two counters i and j for both arrays starting from 0
    - if the element at the index i and j are the same increament both i and j
    - if the element at i is less than j increment i only
    - if the element at j is less increment only j
    - running time is o(n + m)
[Solution](src/main/java/searching/FindDuplicates.java) <br>    
## Miscellaneous<br>
### 1 Shortest Unique Substring
Given an array of unique characters arr and a string str, Implement a function getShortestUniqueSubstring that finds the smallest substring of str containing all the characters in arr. Return "" (empty string) if such a substring doesn’t exist.
Come up with an asymptotically optimal solution and analyze the time and space complexities.<br>
  
```
  Example:
  input:  arr = ['x','y','z'], str = "xyyzyzyx"
  output: "zyx"
 
```
Solution
  - use map to keep track of characters that are already found. 
  - it is possible that a single character can exists multiple times in the input array
  - the order in which the character are found in the substring does not matter
[Solution](src/main/java/miscellaneous/SmallestSubStringOfChars.java) <br>

### 2 Two Sums 

Given an array of integers, return the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
```Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [2, 7].    
```
[Solution](src/main/java/TwoSums.java)<br>
Option 1:
    - use a Hash to store the difference of the current element and the sum
    - when adding to the HashMap we check if the element already exits, if it does that means we have found a sum.
    - time complexity o(n) and space complexity is O(n)
Option 2:
    - sort the array
    - use a sliding window counter from the start and the end of the array
    - if the sum of the numbers at the two indexes are greater increase the left index otherwise decrease the right index
    - time complexity sorting O(nlogn) find the sum O(n) space constant
    - this option is effective if the array is already sorted
### 3 Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
```
Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
```
<br>
[Solution](src/main/java/AddTwoNumbers.java)<br>
### 4 Zigzag pattern <br>
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

### 5 Reverse Integer<br>
[Solution](src/main/java/ReverseInteger.java)<br>
Given a 32-bit signed integer, reverse digits of an integer. If the reversed integer is above 32 bit return 0.<br>

```
Example 1:

Input: 123
Output: 321
```

### 6 Shortest Palindrome<br>
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

### 7 String to Number - atoi<br>
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
### 8 Array Quadrants<br>
Given an unsorted array of integers arr and a number s, write a function findArrayQuadruplet 
that finds four numbers (quadruplet) in arr that sum up to s. Your function should return an 
array of these numbers in an ascending order. If such a quadruplet doesn’t exist, return an 
empty array.

Solution<br>
- with a brute force approach we can get O(n^4)
- we can improve this to O(n^3) by finding the first two with brute force the the last two in O(n) time.
- we start by sorting the array, this takes a maximum O(nlogn) time
- in a sorted array we can find the sum of two numbers that adds up to a target in O(n):
- to do this we can use two counters i, j at the beginning and end of the array
- then increment or decrement the array based on the result of the current sum.
[Solution](src/main/java/miscellaneous/ArrayQuadrants.java)<br>
