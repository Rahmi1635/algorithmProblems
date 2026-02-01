package org.example;



public class Main {
    public static void main(String[] args) {

        MyHashMap map=new MyHashMap();

        map.put(1,5);
        map.put(2,10);
        map.put(3,15);// 3 key inserted in map

        System.out.println(map.get(3));

        map.remove(3);

        System.out.println(map.get(3)); // -1 return because 3 key was deleted
    }
}