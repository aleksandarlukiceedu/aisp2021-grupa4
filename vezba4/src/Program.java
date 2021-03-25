import list.LinkedList;

public class Program {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
