package org.jetBrains.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray<E>{

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(0,1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        dynamicArray.add(13);
        dynamicArray.add(14);
        dynamicArray.add(15);

        dynamicArray.tryIncrease();
        System.out.println(dynamicArray.get(0));
        System.out.println(dynamicArray.get(1));
        System.out.println(dynamicArray.get(2));
        System.out.println("Before removal: " + dynamicArray.get(2));
        dynamicArray.remove( 2);
        System.out.println("After removal: " + dynamicArray.get(2));

        for(int i = 0; i < dynamicArray.size; i++){
            System.out.print(dynamicArray.get(i) + " ");
        }

    }

    private Object[] arr;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private final double SCALING_FACTOR = 1.5;

    public DynamicArray(){
        this.arr = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public DynamicArray(int initialCapacity){
        this.arr = new Object[initialCapacity > 0 ? initialCapacity : DEFAULT_CAPACITY];
        this.size = 0;
    }

    private void tryIncrease(){
        if(arr.length == size){
            arr = Arrays.copyOf(arr, (int) (arr.length * SCALING_FACTOR));
        }
    }

    public void add(E value) {
        tryIncrease();
        arr[size++] = value;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        tryIncrease();
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        E oldValue = (E) arr[index];
        int moveCount = size - index - 1;
        if (moveCount > 0)
            System.arraycopy(arr, index + 1, arr, index, moveCount);
            arr[--size] = null;
            return oldValue;
    }

    public E get(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return (E) arr[index];
    }

}
