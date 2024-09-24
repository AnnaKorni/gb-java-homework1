package v2.Seminar1.lesson1.homework1;
//
//Напишите метод printEvenNums, который выведет на экран все четные числа
//в промежутке от 1 до 100, каждое на новой строке.


import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int n = 100;
        printEvenNums(n);

    }

    public static void printEvenNums( int n){
        for (int i = 0; i <= n; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
