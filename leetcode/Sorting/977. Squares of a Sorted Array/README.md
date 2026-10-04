Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

<br>
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]


---

## 접근법

1. 반복문을 통해O(n) 인수로 받은 배열들을 요소들을 제곱 연산을 수행한다.
2. 긱 요소들이 제곱된 배열을 다시 정렬한다 (오름차순)
