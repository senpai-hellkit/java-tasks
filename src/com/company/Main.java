package com.company;

import java.util.Comparator;

class HubList<E> implements HubListImpl<E> {
    int size = 0;
    E[] list = (E[]) new Object[size];

    @Override
    public void add(E element) {
        this.size++;
        E[] newList = (E[]) new Object[this.size];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        newList[this.size-1] = element;
        this.list = newList;
    }

    @Override
    public E removeAt(int index) {
        E[] newList = (E[]) new Object[this.size-1];
        E item = null;
        int count = 0;
        if (index > this.size-1) {
            return null;
        }
        for (int i = 0; i < this.size; i++) {
            if (index == i) {
                item = list[i];
            }
            if (index != i) {
                newList[count] = list[i];
                count++;
            }
            if (i == this.size-1) {
                this.list = newList;
                this.size--;
                return item;
            }
        }
        return item;
    }

    @Override
    public void sort(Comparator<? super E> c) {
        for (int i = 0; i < this.size - 1; i++) {
            for (int j = this.size - 1; j > i; j--) {
                if (c.compare(this.list[i], this.list[j]) > 0) {
                    E temp = this.list[j - 1];
                    this.list[j - 1] = this.list[j];
                    this.list[j] = temp;
                }
            }
        }
    }

    @Override
    public int find(E element) {
        for (int i = 0; i < this.size; i++) {
            if(this.list[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    void showData() {
        for (E e : this.list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}

class HubComparator implements Comparator<Object> {
    @Override
    public int compare(Object a, Object b) {
        if (a instanceof Integer) {
            return Integer.compare((int) a, (int) b);
        } else {
            return -1;
        }
    }
}

interface HubListImpl<E> {
    void add(E element);
    E removeAt(int index);
    void sort(Comparator<? super E> c);
    int find(E element);
}

public class Main {
    public static void main(String[] args) {
        HubList<Integer> youList = new HubList<Integer>();
        youList.add(4);
        youList.add(578);
        youList.add(3);
        youList.showData(); // [4, 578, 3]
        System.out.println(youList.find(4)); // 0
        System.out.println(youList.find(1)); // -1
        youList.sort(new HubComparator()); // ...
        youList.showData(); // [3, 4, 578]
        System.out.println(youList.removeAt(2)); // 578
        youList.showData(); // [3, 4]
    }
}