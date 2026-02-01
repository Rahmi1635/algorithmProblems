package org.example;

import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

    private static final int SIZE=1000;
    private List<Integer>[] buckets;


    public MyHashSet()
    {
        buckets=new List[SIZE];
        for(int i=0;i<SIZE;i++)
        {
            buckets[i]=new LinkedList<>();
        }
    }

    private int hash(int key)
    {
        return key % SIZE;
    }

    public void add(int key)
    {
        int index=hash(key);
        List<Integer>bucket=buckets[index];
        if(!contains(key))
        {
            bucket.add(key);
        }
    }
    public void remove(int key)
    {
        int index=hash(key);
        List<Integer> bucket=buckets[index];
        if((contains(key)))
        {
            bucket.remove((Integer)key);
        }

    }

    public boolean contains(int key)
    {
        int index=hash(key);
        List<Integer> bucket=buckets[index];
        return bucket.contains(key);
    }

}
