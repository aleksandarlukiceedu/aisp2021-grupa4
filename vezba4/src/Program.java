import list.LinkedList;

public class Program {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("1");
        list.addLast("2");
        list.addFirst("3");
        list.addLast("4");

        String  x = list.getFirst() + list.getLast();
        System.out.println(x);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.removeFirst();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.removeLast();
        System.out.println("foreach");
        for (String s: list) {
            System.out.println(s);
        }
    }
}
