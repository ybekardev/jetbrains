package org.jetBrains.oop.javacore;

public class ImmutableArray<T> {

    private T[] items;

    public ImmutableArray(T[] items){
        this.items = items;
    }

    public T get(int index){
        return items[index];
    }

    public int length(){
        return items.length;
    }



}
