

# [쿨한 물건 구매](https://www.acmicpc.net/problem/1214)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 0.5 초 | 128 MB | 5492 | 1172 | 920 | 21.962% |

## 문제

구사과는 지폐를 오직 두 종류만 가지고 있다. 바로 P원 지폐와 Q원 지폐이다. 이 두 종류의 지폐를 구사과는 무한대만큼 가지고 있다.

오늘 구사과가 구매하려고 하는 물건의 가격은 D원이다. 구사과가 이 물건을 구매하기 위해서 지불해야 하는 금액의 최솟값은 얼마일까?

물건을 구매하기 위해서는 물건의 가격보다 크거나 같은 금액을 지불해야 한다.

## 입력

첫째 줄에 D, P, Q가 주어진다. 모두 109보다 작거나 같은 자연수이다.

## 출력

첫째 줄에 물건을 구매하기 위해 구사과가 지불해야 하는 금액의 최솟값을 출력한다.

## 예제 입력 1

```
17 7 13

```

## 예제 출력 1

```
20

```

20 = 7 × 1 + 13 × 1

## 예제 입력 2

```
21 7 13

```

## 예제 출력 2

```
21

```

21 = 7 × 3 + 13 × 0

## 예제 입력 3

```
17 7 9

```

## 예제 출력 3

```
18

```

18 = 7 × 0 + 9 × 2

## 예제 입력 4

```
37 9 17

```

## 예제 출력 4

```
43

```

43 = 9 × 1 + 17 × 2

## 예제 입력 5

```
287341 2345 7253

```

## 예제 출력 5

```
287398

```

287398 = 2345 × 104 + 7253 × 6
