Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

<br>
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

### 접근법

 ##### Java
 
1. Java로 문제를 해결할 때는 시간복잡도를 줄이기 위해 투 포인터를 활용한다.
2. 포인터 두 개를 배열 첫 index와 끝 index를 참조할 수 있게 한다.

##### Kotlin

1. kotlin  CharArray.reverse() 함수 이용
2. 물론 kotlin으로도 투 포인터를 활용하여 시간복잡도를 줄일 수 있다.
