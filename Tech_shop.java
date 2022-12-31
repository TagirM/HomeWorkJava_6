import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
// Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
// фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class Tech_shop {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("ASUS", 17.0, 8, 750, "Windows");
        Notebook note2 = new Notebook("Aser", 15.6, 12, 500, "Linux");
        Notebook note3 = new Notebook("DEXP", 16.5, 8, 750, "Windows");
        Notebook note4 = new Notebook("ASUS", 14.3, 4, 250, "Windows");
        Notebook note5 = new Notebook("Aser", 14.3, 4, 250, "Windows");
        Notebook note6 = new Notebook("DEXP", 17.0, 8, 750, "Linux");
        Notebook note7 = new Notebook("ASUS", 15.6, 8, 500, "Windows");        
        
        HashSet<Notebook> all_notes = new HashSet<Notebook>();
        all_notes.add(note1);
        all_notes.add(note2);
        all_notes.add(note3);
        all_notes.add(note4);
        all_notes.add(note5);
        all_notes.add(note6);
        all_notes.add(note7);        

        Scanner find = new Scanner(System.in);
        System.out.println("Введите требуемые параметры ноутбука поочередно:");
        System.out.println("1 - прозводитель:");
        String prod = find.nextLine();
        System.out.println("2 - размер экрана:");
        double screen = find.nextDouble();
        System.out.println("3 - ОЗУ:");
        int ozu = find.nextInt();
        System.out.println("4 - ЖД:");
        int hd = find.nextInt();
        find.close();

        HashMap<Integer, Object> map = new HashMap<>();
        map.put(1, prod);
        map.put(2, screen);
        map.put(3, ozu);
        map.put(4, hd);
        
        for (Notebook book : all_notes) {
            if (book.getProducer().equals(map.get(1)) && book.getScreen_size().equals(map.get(2))
                    && book.ozu().equals(map.get(3)) && book.hdd().equals(map.get(4))) {
                System.out.println(book.toString());
            }
        }
    }
}
