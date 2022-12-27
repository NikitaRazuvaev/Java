package Lession5;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class  Task1 {

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    static String surname;

    public static void nameInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a name: ");
        surname = reader.nextLine();
        reader.close();
        
    }
    public static void main(String[] args) {
        nameInput();
        addInPhoneBook(surname);
        findInPhoneBook(surname);
    }


    public static void addInPhoneBook(String surname) {
        phoneBook.put("Иванов", List.of("+951(8750)356-88-39", "+2(989)561-51-05"));
        phoneBook.put("Петров", List.of("+9(26)020-75-63", "+57(808)878-44-09"));
        phoneBook.put("Сидоров",List.of("+05(9796)087-74-41", "+983(8157)414-41-05"));
        phoneBook.put("Киселева",List.of("+05(9796)087-74-41", "+983(8157)414-41-05"));
        phoneBook.put("Гончарова",List.of("+05(9796)087-74-41", "+983(8157)414-41-05"));
        phoneBook.put("Казаков",List.of("+9(26)020-75-63", "+57(808)878-44-09"));
        phoneBook.put("Злобин",List.of("+9(26)020-75-63", "+57(808)878-44-09"));
        phoneBook.put("Котова",List.of("+9(26)020-75-63", "+57(808)878-44-09"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }

}
