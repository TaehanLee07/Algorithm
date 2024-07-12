

# [Amusement Park Adventure [다국어]](https://www.acmicpc.net/problem/29986)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 (추가 시간 없음) | 1024 MB | 471 | 401 | 378 | 86.105% |

## 문제

Meet Carlitos, a spirited adventure enthusiast with an insatiable love for amusement parks. Despite his vibrant passion, Carlitos faces a unique challenge – his height. As he eagerly plans his weekend escapade, he realizes that his vertical limitations might hinder his amusement park experience. It’s not just about choosing a park; it’s about finding one where he can enjoy the thrill of the rides.

Picture the kaleidoscope of colors, the jubilant laughter, and the heart-pounding rush of the rides. Carlitos has always been drawn to the energy of amusement parks. With the weekend approaching, he pores over park brochures, studying the height requirements of each ride. His goal is to maximize his enjoyment, and that’s where you come in.

Your task is to help Carlitos determine the number of rides he can enjoy at a specific park. By considering his height and the minimum height requirements of each ride, guide him in making the most of his amusement park adventure.

## 입력

The first line contains two integers, N and H (1 ≤ N ≤ 6 and 90 ≤ H ≤ 200), representing the number of rides in a park and Carlitos’ height in centimeters, respectively.

The second line contains the minimum heights A1, . . . , AN (90 ≤ Ai ≤ 200) of each ride in the park.

## 출력

Output a single line with an integer indicating the number of rides Carlitos can go on, that is, the number of rides for which Carlitos’ height is at least as large as the minimum height required.

## 예제 입력 1

```
1 100
100

```

## 예제 출력 1

```
1

```

## 예제 입력 2

```
6 120
200 90 100 123 120 169

```

## 예제 출력 2

```
3
```
