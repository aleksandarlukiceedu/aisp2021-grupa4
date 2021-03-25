package list;

public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int listSize;

    public void addFirst(Object element){
        ListNode newNode = new ListNode(element, head);
        head = newNode;

        if(tail == null){
            tail = head;
        }

        listSize++;
    }

    public void addLast(Object element){
        ListNode newNode = new ListNode(element);

        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }

        listSize++;
    }

    public void add(int index, Object element){

    }

    public Object getFirst(){
        return null;
    }

    public Object getLast() {
        return null;
    }

    public Object get(int index){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index out of range!");
        }
        int i = 0;
        ListNode currentNode = head;


        while (currentNode != null){
            if(index == i){
                return currentNode.getElement();
            }
            currentNode = currentNode.getNext();
            i++;
        }

        return null;
    }

    public int indexOf(Object element){
        return -1;
    }

    public void removeFirst(){

    }

    public void removeLast(){

    }

    public void remove(int index){

    }

    public void remove(Object element){

    }

    public void set(int index, Object element){

    }

    public void clear(){

    }

    public int size(){
        return listSize;
    }
}
