package v2.Seminar1.lesson1.homework1;

//Задание 1. Нахождение факториала числа
//        Напишите метод factorial, который принимает число n и возвращает его
//        факториал. Если число n < 0, метод должен вернуть -1

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }



    public static int factorial(int n) {
        int res = 1;
        if (n<0) {
            res = -1;
        }
        else
        for (int i = 1; i <= n; i++) {

            res = res * i;
        }
        return res;
    }
}
