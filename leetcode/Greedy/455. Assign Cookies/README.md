Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

**Example 1:**

```text
Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
```

**Example 2:**

```text
Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.

```



### 접근법


1. child를 값을 가지는 배열 g 와 쿠키 값을 가진 배열 s를 정렬한다. (오름차순, 내림차순 상관없음)
2. 문제 입력 조건에 s배열은 빈 배열 입력이 가능하므로 빈 배열이면 return 0 반환한다.
3. 반복문을 돌려 g(자식의 탐욕 값) <= s (쿠키의 크기)  자식의 탐욕 값이 쿠키의 크기보다 작거나 같으면 count를 증가시킨다.
4. count가 증가햇다면 해당 쿠키는 이미 먹은 쿠키이므로 다시는 그 요소 index에 방문할 필요가 없다.
5. 쿠키 배열을 가리키는 index를 적절히 조절하여 더 이상 방문할 요소가없다면 반복문을 탈출한다.

#### 방법2 투포인터 사용

로직은 동일하다. g배열과 s 배열에 각 각 index pointer를 선언한다.
