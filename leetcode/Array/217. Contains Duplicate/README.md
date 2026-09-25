Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109


---

## 접근법

문제는 배열안에 중북 값을 가지는 요소를 찾는 문제이다.

방법은 총 3가지가 있다. 

#### 1. 단순 중첩 반복문을 통해 배열 완전 탐색 O(n^2)
#### 2. sort 후 선형 검색  O(n log n)
#### 3. HashTable 사용 O(n)

접근속도는 당연히 3번째 HashTable을 사용하는게 좋지만, 2번으로 접근하여 문제를 풍어봤다.

