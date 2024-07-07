

# [Sarah's Toys [다국어]](https://www.acmicpc.net/problem/5102)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 128 MB | 628 | 416 | 378 | 67.380% |

## 문제

Sarah, aged 5, has lots and lots of stuffed toys. They are supposed to be kept in her bedroom, but do not always make it back each night.

When she gets into bed at night, she puts the stuffed toys that are in her room on the spare bed. She likes to give each stuffed toy a friend for the night and puts them into pairs. Sometimes there isn’t an even number, so she might have to make one group of 3.

Your task is to write a program that will report on the arrangement of Sarah's toys on a particular night.

## 입력

Input will be a number of lines, with each line representing a night in Sarah’s house. Each line will have 2 whole numbers, separated by a space. The first number is how many stuffed toys she owns at the time. The second number is the number of toys left round the house that don’t make it back to Sarah’s bedroom that night.

The last line will be 0 0. Do not process this line.

## 출력

Output will consist of 2 numbers separated by a space for each night. The first represents how many pairs there are and the second will be either a 0 or a 1. A 0 means there were no groups of 3 and a 1 represents that there was one group of 3.

## 예제 입력 1

```
7 3
6 3
5 4
0 0

```

## 예제 출력 1

```
2 0
0 1
0 0
```
