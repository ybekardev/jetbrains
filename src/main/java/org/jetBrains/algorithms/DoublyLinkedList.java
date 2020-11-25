package org.jetBrains.algorithms;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addFirst(10);
        dll.addFirst(34);
        dll.addLast(56);
        dll.addLast(364);
        dll.add(1, dll.getHead().getNext());
        dll.add(2, dll.getHead());
        System.out.println(dll.toString());
        dll.remove(dll.getHead().getNext().getNext());
        System.out.println(dll.toString());
        dll.remove(dll.getHead());
        System.out.println(dll.toString());
        dll.remove(dll.getTail());
        System.out.println(dll.toString());
    }

    static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> prev;

        Node(E element, Node<E> next, Node<E> prev){
            this.value = element;
            this.next = next;
            this.prev = prev;
        }

        Node<E> getNext(){
            return next;
        }

        Node<E> getPrev(){
            return prev;
        }
    }


    private Node<E> head;
    private Node<E> tail;
    private int size;
    public DoublyLinkedList(){
        size = 0;
    }

    public Node<E> getHead(){
        return head;
    }

    public Node<E> getTail(){
        return tail;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        Node<E> temp = head;
        StringBuilder result = new StringBuilder();
        while(temp != null){
            result.append(temp.value).append(" ");
            temp = temp.next;
        }
        return result.toString();
    }

    void addFirst(E elem){
        Node<E> temp = new Node<>(elem, head, null);
        if(head != null){
            head.prev = temp;
        }
        head = temp;
        if(tail == null){
            tail = temp;
        }
        size++;
    }

    void addLast(E elem){
        Node<E> temp = new Node<>(elem, null, tail);
        if(tail != null){
            tail.next = temp;
        }
        tail = temp;
        if(head == null){
            head = temp;
        }
        size++;
    }

    void add(E elem, Node<E> curr){
        if(curr == null){
            throw new NoSuchElementException();
        }
        Node<E> temp = new Node<>(elem, curr, null);
        if(curr.prev != null){
            curr.prev = temp;
            temp.prev = curr.prev;
            curr.prev = temp;
        }else {
            curr.prev = temp;
            temp.next = curr;
            head = temp;
        }
        size++;
    }

    public void removeFirst(){
        if(size == 0){
            throw new NoSuchElementException();
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast(){
        if(size == 0){
            throw new NoSuchElementException();
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void remove(Node<E> curr){
        if(curr == null)
            throw new NoSuchElementException();
        if(curr.prev == null){
            removeFirst();
            return;
        }
        if(curr.next == null){
            removeLast();
            return;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
    }

}
