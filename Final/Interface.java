package Final;

import java.util.*;

public class Interface {
public static void main(String[] args) {
    Catalog nout1 = new Catalog("HP","4","1024","L","2333");
    Catalog nout2 = new Catalog("MIS","8","2024","L","2883");
    Catalog nout3 = new Catalog("Asus","16","4096","W","2983");
    Set<Catalog> nout = new HashSet<>(List.of(nout1,nout2,nout3));
    Map<String, String> sel = selectCriteria();
      sort(sel, nout);
}

public static String scanner() {
    Scanner scanner = new Scanner(System.in);
    String scan = scanner.nextLine();
    return scan;
 }

private static Map<String, String> selectCriteria() {
    Map<String, String> resultCriterias = new HashMap<>();
    while (true) {
        System.out.println("Выбрать критерий? Если да введите 'y', если нет введите 'n'");
        String question = scanner();
        if (question.equals("n")) {
           break;
        } else {

           System.out.println(
                 "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цена");
           String key = scanner();
           System.out.println("Введите значения для выбранного критерия: ");
           String value = scanner();

           resultCriterias.put(key, value);
        }
     }
     System.out.println(resultCriterias);
     return resultCriterias;

  }

  public static void sort(Map<String, String> criterias, Set<Catalog> notebooks) {

     Set<Catalog> temp = new HashSet<>(notebooks);
     for (Catalog Catalog : notebooks) {

        for (Object pair : criterias.keySet()) {

           if (pair.equals("1") && !Catalog.getName().equals(criterias.get(pair))) {
              temp.remove(Catalog);
           }
           for (Object pair1 : criterias.keySet()) {

              if (pair1.equals("2") && !Catalog.getRam().equals(criterias.get(pair1))) {
                 temp.remove(Catalog);

              }
              for (Object pair2 : criterias.keySet()) {

                 if (pair2.equals("3") && !Catalog.getHardDisk().equals(criterias.get(pair2))) {
                    temp.remove(Catalog);

                 }
                 for (Object pair3 : criterias.keySet()) {

                    if (pair3.equals("4") && !Catalog.getOperatingSystem().equals(criterias.get(pair3))) {
                       temp.remove(Catalog);

                    }
                    for (Object pair4 : criterias.keySet()) {

                       if (pair4.equals("5") && !Catalog.getCoins().equals(criterias.get(pair4))) {
                          temp.remove(Catalog);

                       }
                    }
                 }
              }
           }
        }

     }
     if (temp.isEmpty()) {
        System.out.println("По введенным критериям ничего не найдено!");
     } else {
        System.out.println("Вот что мы можем предложить: \n" + temp.toString());
     }

  }
}
    



