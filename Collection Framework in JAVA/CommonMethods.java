import java.util.*;

public class CommonMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // [10, 20, 30]

        // remove by index
        list.remove(0); // removes 10
        System.out.println(list); // [20, 30]

        // addAll()
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list.addAll(list2);
        System.out.println(list); // [20, 30, 101, 102]

        // removeAll()
        list.removeAll(list2);
        System.out.println(list); // [20, 30]

        // size()
        System.out.println(list.size()); // 2

        // clear()
        list2.clear();
        System.out.println(list2.size()); // 0

        // contains()
        System.out.println(list.contains(20)); // true
        System.out.println(list.contains(100)); // false

    }
}