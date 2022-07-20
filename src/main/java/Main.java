import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

    /*
    Napisz program w javie, który na wejściu przyjmuje liczbę całkowitą (wpisaną w konsoli) a na wyjściu zwraca listę wszystkich jej dzielników.

     */

public class Main {
    public static void main(String[] args) {

        System.out.println("Write any number that is an integer ");
        Scanner scanner = new Scanner(in);
        int number = scanner.nextInt();


        int i = 1;
        if (number == 0) {
            System.out.println("Put all number's what You know but not 0");
        } else {

            for (i = 1; i <= number; i++) {
                if (number % i == 0)
                    System.out.println(i);

            }
        }
    }
}