import DataStructures.LinkedList;

public class Main {
    public static void main(String... args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.printList();
        System.out.println("================================");
        list.add(3, 1);
        list.printList();
        System.out.println("================================");
        System.out.println(list.getData(1));
        System.out.println("================================");
        list.setData(5, -2);
        list.printList();
        System.out.println("================================");
    }
}
