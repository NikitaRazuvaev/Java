package UnitOne.Homework;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введеите 1 число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d ", giveMeNumber(i));   
        iScanner.close();     
    }
    public static int giveMeNumber(int a) {
        return (a*(a+1))/2;
    }
}
