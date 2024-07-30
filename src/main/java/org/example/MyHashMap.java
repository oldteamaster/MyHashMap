package org.example;

import java.util.Objects;

public class MyHashMap {
Node[] buckets;
int size;
    public static class Node{
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
       }

       MyHashMap(){
        buckets = new Node[16];
    }
    //додає пару ключ + значення
    public void put(Object key, Object value) {
        Node newNode = new Node(key, value);
        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = newNode;
            size++;
        } else {
            Node current = buckets[index];
            while (current.next != null){
                if (current.key.equals(key)){
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if(current.key.equals(key)){
                current.value = value;
                return;
            }else {
                current.next = newNode;
                size++;
            }
        }
    }
        //видаляє пару за ключем
        public void remove (Object key){
        int index = getIndex(key);
        Node current = buckets[index];
        Node previos = null;
        while(current != null){
            if(current.key.equals(key)){
            if(previos == null){
                buckets[index] = current.next;
            }else{
                previos.next = current.next;
            }
            size--;
            }
            previos = current;
            current = current.next;
        }

        }
        //очищає колекцію
        public void clear () {
            for (int i = 0; i < 16; i++) {
                buckets[i] = null;
            }
            size = 0;
        }
        //повертає розмір колекції
        public int size () {
            return size;
        }
        //повертає значення (Object value) за ключем
        public Object get (Object key){
        Node current = buckets[getIndex(key)];
        Object result = null;
        while(current != null){
            if(!current.key.equals(key)){
                current = current.next;
            }else{
                result = current.value;
                break;
            }

        }
            return result;
        }
//повертає index buckets
        public int getIndex (Object key){
        int h = Objects.hashCode(key) < 0 ? -Objects.hashCode(key) : Objects.hashCode(key);
        return h % 15;
        }
    }

