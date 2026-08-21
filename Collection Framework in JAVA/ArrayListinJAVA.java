import java.util.*;
public class ArrayListinJAVA {
    public static void main(String [] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(30);
        list.add(40);
        list.add(12);
        list.add(6);

        // Sorting (Ascending)
        Collections.sort(list);
        System.out.println(list); // [6, 12, 30, 40]

        // Clone (Shallow Copy)
        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println(newList); // [6, 12, 30, 40]

        // ensureCapacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100); // Reserves space for 100 elements

        // isEmpty
        System.out.println(list.isEmpty()); // false

        // indexOf
        System.out.println(list.indexOf(40)); // 3
    }
}