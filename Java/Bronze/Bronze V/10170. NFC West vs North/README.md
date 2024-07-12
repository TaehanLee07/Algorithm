

# [NFC West vs North [다국어]](https://www.acmicpc.net/problem/10170)

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 256 MB | 17692 | 12875 | 12064 | 74.603% |

## 문제

동혁이를 위해 NFC 서부와 북부 디비전 순위를 출력하는 프로그램을 작성하시오.

## 입력

없음

## 출력

예제와 같이 NFC 서부와 북부 디비전 순위를 출력한다.

## 예제 입력 1

```

```

## 예제 출력 1

```
NFC West       W   L  T
-----------------------
Seattle        13  3  0
San Francisco  12  4  0
Arizona        10  6  0
St. Louis      7   9  0

NFC North      W   L  T
-----------------------
Green Bay      8   7  1
Chicago        8   8  0
Detroit        7   9  0
Minnesota      5  10  1
```

## 풀이

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("NFC West       W   L  T\n" +
                "-----------------------\n" +
                "Seattle        13  3  0\n" +
                "San Francisco  12  4  0\n" +
                "Arizona        10  6  0\n" +
                "St. Louis      7   9  0\n" +
                "\n" +
                "NFC North      W   L  T\n" +
                "-----------------------\n" +
                "Green Bay      8   7  1\n" +
                "Chicago        8   8  0\n" +
                "Detroit        7   9  0\n" +
                "Minnesota      5  10  1");
    }
}
```
