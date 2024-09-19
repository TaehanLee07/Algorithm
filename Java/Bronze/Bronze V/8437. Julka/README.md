[]

# [Julka [다국어]

| 시간 제한 | 메모리 제한 | 제출 | 정답 | 맞힌 사람 | 정답 비율 |
| --- | --- | --- | --- | --- | --- |
| 1 초 | 128 MB | 13178 | 5016 | 4747 | 40.972% |

## 문제

Julka zaskoczyła wczoraj w przedszkolu swoją wychowawczynię rozwiązując następującą zagadkę:

> Klaudia i Natalia mają razem 10 jabłek, ale Klaudia ma o 2 jabłka więcej niż Natalia. Ile jabłek ma każda z dziewczynek?
> 

Julka odpowiedziała bez namysłu: Klaudia ma sześć jabłek, natomiast Natalia ma cztery jabłka.

Wychowywaczyni postanowiła sprawdzić, czy odpowiedź Julki nie była przypadkowa i powtarzała zagadkę, za każdym razem zwiększając liczby jabłek w zadaniu. Julka zawsze odpowiadała prawidłowo. Zaskoczona wychowawczyni chciała kontynuować ,,badanie'' Julki, ale przy bardzo dużych liczbach sama nie potrafiła szybko rozwiązać zagadki. Pomóż pani przedszkolance i napisz program, który będzie podpowiadał jej rozwiązania.

Napisz program, który:

- wczyta (ze standardowego wejścia) liczbę jabłek, które mają razem obie dziewczynki oraz o ile więcej jabłek ma Klaudia,
- obliczy, ile jabłek ma Klaudia i ile jabłek ma Natalia,
- wypisze wynik (na standardowe wyjście).

## 입력

Wejście składa się z dwóch wierszy. Pierwszy wiersz zawiera liczbę wszystkich jabłek posiadanych przez dziewczynki, natomiast drugi - liczbę mówiącą, o ile więcej jabłek ma Klaudia. Obie liczby są całkowite i dodatnie. Wiadomo, że dziewczynki mają razem nie więcej niż 10100 (jedynka i sto zer) jabłek. Jak widać, jabłka mogą być bardzo malutkie.

## 출력

Twój program powinien wypisać (na standardowe wyjście) w dwóch kolejnych wierszach dwie liczby całkowite, po jednej w wierszu. Pierwszy wiersz powinien zawierać liczbę jabłek Klaudii, natomiast drugi - liczbę jabłek Natalii. Wiadomo, że dziewczynki zawsze mają całe jabłka.

## 예제 입력 1 복사

```
10
2

```

## 예제 출력 1 복사

```
6
4
```

## 풀이

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(bf.readLine());
        BigInteger diff = new BigInteger(bf.readLine());
        BigInteger two = new BigInteger("2");
        
        BigInteger klaudia = (total.subtract(diff)).divide(two).add(diff);
        BigInteger natalia = (total.subtract(diff)).divide(two); 
        
        System.out.println(klaudia);
        System.out.println(natalia);
 
    }
 
}
```
