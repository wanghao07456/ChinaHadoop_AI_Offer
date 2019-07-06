### 小象学院AI校招班
这里为小象学院AI校招班专用刷题GitHub，旨在给每一位学员提供优质的服务  
[AI校招收割王](https://www.chinahadoop.cn/course/1431/landing/page)
#### 字符串 I
##### day1
**有效回文串** 题解：  
首先，回文串的概念为对一个字符串而言，从前往后读和从后往前读是一样的。明确一点，空字符串也是回文串。
接下来，根据题目要求，由于字符串中存在一些特殊符号，比如逗号，在确认是否是回文串的过程中，这些特殊符号需要去除，
否则无法确认是否是回文串。
最后，我们需要两个指针，一前一后，同时往字符串的中间进行移动，每移动一位进行比较，如果相同就继续往下
比较，如果不同那么就跳出。  

**亲密字符串** 题解:  
对于两个小写字符串A和B，交换A中的两个字母之后(这两个字母可相邻也可不相邻)，然后A与B相等。首先需要判断
两个字符串的长度是否相等，如果不相等，怎么交换都无法使得两个字符串相等。  
- 字符串A和B相等。如果相等，需要交换的是两个相同的元素。那么需要看是否有重复的字符
- 字符串A和B不相等。那么需要找到不同的位置。比如 A = ’ab‘, B = 'ba'，这两个字符串的第一个第二个位置都不相同，并且
对应的值**交叉相等**，那么交换A的第一和第二个位置的值，就可以和B相等。三个位置都不相同可以吗？不可以，三个位置不相同怎么交换
都不可以的。因此需要正好两个位置不相同，可以维护一个列表存入不相同的数  

#### day2  
**最长公共前缀** 题解：  
"ABC","ACEF"，那么最长公共前缀即为"A"。首先进行边界判断，给定的strs如果为空或者长度为0，则返回""  
初始化一个前缀，可以选择strs[0]。然后对剩下的字符串进行遍历，对每个字符串的字符进行和前缀字符串的字符进行比较(可以用变量j来遍历)，最后返回一个前缀在
```(0,j)```的子前缀即可
