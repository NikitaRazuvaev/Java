package Lession4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;


public class Task {
        
    public static class Queue{
        public LinkedList<String> store;
        

        public Queue(){
            store = new LinkedList<>();
        }

        public void enqueue(String item){
            store.addLast(item);
        }
    
        public String dequeue(){
            return store.pollFirst();
        }
    
        public String first(){
            return store.getFirst();
        }
    }
        
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Queue q  = new Task.Queue();
        for(int i=0; i<4; i++) {
          System.out.println("Введите элемент списка: ");
          String st1 = inp.nextLine();
          q.enqueue(st1);
        }
        System.out.println("Введен следующий список: ");
        System.out.println(q.store);
        System.out.println("Выведен следующий список в перевернутом виде: ");
        Collections.reverse(q.store);
        System.out.println(q.store);
       ///помещает элемент в конец очереди
       q.enqueue("The element in the end of queue");
       System.out.println("после добавления элемента: ");
       System.out.println(q.store);

       ///возвращает первый элемент из очереди и удаляет его
       System.out.println("Берем из очереди элемент: " + q.dequeue());
       System.out.println(q.store);
   
       ///возвращает первый элемент из очереди, не удаляя.
       System.out.println("первый элемент (не забирая из очереди): " + q.first());
       System.out.println(q.store);
    } 
        
}

