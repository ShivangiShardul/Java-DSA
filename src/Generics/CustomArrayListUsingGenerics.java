package Generics;

import java.util.Arrays;

public class CustomArrayListUsingGenerics<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayListUsingGenerics(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T value){
        if(isFull()){
            resize();
        }
        data[size++] = value;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        return (T) data[--size];
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayListUsingGenerics<Integer> list = new CustomArrayListUsingGenerics<>();

        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

        CustomArrayListUsingGenerics<Float> list1 = new CustomArrayListUsingGenerics<>();

        for (int i = 0; i < 15; i++) {
            list1.add((float) (2 * i));
        }

        System.out.println(list1);

        CustomArrayListUsingGenerics<String> list2 = new CustomArrayListUsingGenerics<>();

        for (int i = 0; i < 15; i++) {
            list2.add(String.valueOf(2 * i));
        }

        System.out.println(list2);
    }
}
