package list;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private int listSize;

    public void addFirst(T element){
        ListNode<T> newNode = new ListNode<T>(element, head);
        head = newNode;

        if(tail == null){
            tail = head;
        }

        listSize++;
    }

    public void addLast(T element){
        ListNode<T> newNode = new ListNode<T>(element);

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

    public void add(int index, T element){

    }

    public T getFirst(){
       if(head == null){
           throw new RuntimeException("List is empty!");
       }

       return head.getElement();
    }

    public T getLast() {
        if(tail == null){
            throw new RuntimeException("List is empty!");
        }

        return tail.getElement();
    }

    public T get(int index){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index out of range!");
        }
        int i = 0;
        ListNode<T> currentNode = head;


        while (currentNode != null){
            if(index == i){
                return currentNode.getElement();
            }
            currentNode = currentNode.getNext();
            i++;
        }

        return null;
    }

    public int indexOf(T element){
        return -1;
    }

    public void removeFirst(){
        if(head != null){
            if(head == tail){
                head = null;
                tail = null;
            }
            else{
                head = head.getNext();
            }
            listSize--;
        }
        else{
            throw new RuntimeException("List is empty!");
        }
    }

    public void removeLast(){
        if(head == null){
            throw new RuntimeException("List is empty!");
        }

        ListNode<T> previousNode = null;
        ListNode<T> currentNode = head;

        while(currentNode.getNext() != null){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if(previousNode == null){
            head = null;
            tail = null;
        }
        else{
            previousNode.setNext(null);
            tail = previousNode;
        }

        listSize--;
    }

    public void remove(int index){

    }

    public void remove(T element){

    }

    public void set(int index, T element){

    }

    public void clear(){
        head = tail = null;
    }

    public int size(){
        return listSize;
    }

    ListNode<T> getHead(){
        return head;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }
}
