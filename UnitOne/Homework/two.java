package UnitOne.Homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int inp = scanner.nextInt();
    List<Integer>primes = new ArrayList<>();
    for(int i=2; i<inp; i++){
        boolean isNumber = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            primes.add(i);
        }
    } 
    String s = primes.toString().replace("[", "").replace("]", "");
    System.out.println("Число простых чисел равно: " + primes.size() + ", и они: " + s);
    }
     
}
