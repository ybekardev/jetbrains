package org.jetBrains.javacore.practice;

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
