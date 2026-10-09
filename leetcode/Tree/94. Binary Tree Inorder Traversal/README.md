Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]

Explanation:
<img width="254" height="335" alt="image" src="https://github.com/user-attachments/assets/fa15e618-4e5a-49c1-9808-834370d9d745" />

<br>

Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]

Explanation:
<img width="524" height="428" alt="image" src="https://github.com/user-attachments/assets/32bcfc41-1701-492f-b5bc-180bfa2d7283" />



Example 3:

Input: root = []

Output: []

<br>

Example 4:

Input: root = [1]

Output: [1]




---

## 접근법

1. 단순하게 Tree inorder를 구현하면 된다.
