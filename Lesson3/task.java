package Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


// Создать рандомный список целых чисел +
//Показать лист +
// Задание 1 Сортировка слиянием ?
// Задание 2 удалить из него четные числа ?
// Задание 3 Найти минимальное, максимальное и среднее из этого списка +++

public class task {
    public static void main(String[] args) {
        System.out.println("Изначальный список: ");
        Random random = new Random();
        ArrayList<Integer> arrlist = new ArrayList<>();
        
        
        double average1 = 0;
        for (int i = 0; i < 15; i++) {
            int iempInt  = random.nextInt(30);
            arrlist.add(iempInt);
            average1 += arrlist.get(i);
        }
        average1/=15;
        for (int el : arrlist) {
            System.out.print(el + " ");
        }

        ArrayList<Integer> sortedList = mergeSort(arrlist);
        System.out.println(" ");
        System.out.println("Минимальное занчение: "+ Collections.min(arrlist));
        System.out.println("Максимальное значение: "+Collections.max(arrlist));
        System.out.println("Средние арифметическое: ("+average1+")");
        System.out.println("Сортировка слиянием: ("+sortedList+")");
        System.out.println("Удалить из него четные числа: ("+removEvensArrayList(sortedList)+")");
         
        
    }
    
    //Cортировка
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> arrlist) {
        
        if (arrlist == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrlist.size() < 2) {
            return arrlist; // возврат в рекурсию в строки ниже см комменты.
        }

        // копируем левую часть от начала до середины
        ArrayList<Integer> arrayB = new ArrayList<>( arrlist.subList(0, arrlist.size()/2));

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        ArrayList<Integer> arrayC  = new ArrayList<>(arrlist.subList(arrlist.size()/2, arrlist.size())) ;
 
        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = mergeSort(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = mergeSort(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArrayList(arrayB, arrayC);
    }

    public static ArrayList<Integer> mergeArrayList(ArrayList<Integer> arrayА, ArrayList<Integer> arrayB) {
        int sizec =  arrayА.size() + arrayB.size();
        ArrayList<Integer> arrayC = new ArrayList<Integer>(sizec);
        int positionA = 0, positionB = 0;
        
        for (int i = 0; i < sizec; i++) {
            if (positionA >= arrayА.size()){
                arrayC.add(arrayB.get(positionB));
                positionB++;
            } else if (positionB >= arrayB.size()) {
                        arrayC.add(arrayА.get(positionA));
                        positionA++;
            } else if (arrayА.get(positionA) < arrayB.get(positionB)) {
                        arrayC.add(arrayА.get(positionA));
                        positionA++;
            } else {
                        arrayC.add(arrayB.get(positionB));
                        positionB++;
            }
        }
        return arrayC;
    }

    public static ArrayList<Integer> removEvensArrayList(ArrayList<Integer> input){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : input) {
            if(integer % 2 != 0){
              result.add(integer);      
            }
        }

        return result;
    }    
}
