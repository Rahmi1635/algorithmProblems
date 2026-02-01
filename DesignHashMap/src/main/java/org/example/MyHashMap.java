package org.example;


import java.util.LinkedList;
import java.util.List;


public class MyHashMap {

    private static final int SIZE=1000;
    private List<Entry>[] buckets;

    public MyHashMap()
    {
        buckets=new List[SIZE];
        for(int i=0;i<SIZE;i++)
        {
            buckets[i]=new LinkedList<>();

        }
    }

    public int hash(int key)
    {
        return key % SIZE;
    }

    public void put(int key,int value)
    {
        int index=hash(key);
        List<Entry> bucket=buckets[index];

        for(Entry entry:bucket)
        {
            if(entry.key==key)
            {
                entry.value=value;
                return;
            }
        }

        bucket.add(new Entry(key,value));

    }

    public int get(int key)
    {
        int index=hash(key);
        List<Entry> bucket=buckets[index];
        for(Entry entry:bucket)
        {
            if(entry.key==key)
            {
                return entry.value;
            }
        }
        return -1;
    }
    public void remove(int key)
    {
        int index=hash(key);
        List<Entry> bucket=buckets[index];
        bucket.removeIf(entry->entry.key==key);
    }
}
