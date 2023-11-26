import DataStructures.LinkedList;
import DataStructures.Stack;

public class Main {
    public static void main(String... args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println("============== | LINKED LIST | ==================");
        list.printList();
        list.add(3, 1);
        System.out.println("============== | ADD TO LINKED LIST | ==================");
        list.printList();
        System.out.println("============== | GET LINKED LIST DATA | ==================");
        System.out.println(list.getData(1));
        list.setData(5, -2);
        System.out.println("============== | CHANGING LINKED LIST DATA | ==================");
        list.printList();
        list.remove();
        System.out.println("============== | REMOVING LINKED LIST DATA | ==================");
        list.printList();

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        System.out.println("============== | STACK | ==================");
        stack.display();
        System.out.println("============== | STACK SIZE | ==================");
        System.out.println(stack.size());
        Integer popedValue = stack.pop();
        System.out.println("============== | STACK POP | ==================");
        stack.display();
        System.out.println("============== | STACK POPED VALUE | ==================");
        System.out.println(popedValue);
        System.out.println("============== | STACK PEEK | ==================");
        System.out.println(stack.peek());
    }
}
