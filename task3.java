package v2.Seminar1.lesson1.homework1;

//Напишите метод sumDigits, который принимает целое число n и возвращает
//сумму его цифр.


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int digit = scanner.nextInt();
        sumDigits(digit);
    }

    public static void sumDigits( int digit){
        int sum = 0;
        while(digit != 0){
            sum += (digit % 10);
            digit/=10;
        }
        System.out.println(sum + " ");

    }
}
