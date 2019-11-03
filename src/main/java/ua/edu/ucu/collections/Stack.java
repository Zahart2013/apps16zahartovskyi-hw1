package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList lst;

    public Stack(){
        this.lst = new ImmutableLinkedList();
    }

    public Object peek(){
        return lst.getFirst();
    }

    public Object pop(){
        Object res = lst.getFirst();
        lst = lst.removeFirst();
        return res;
    }

    public void push(Object e){
        lst = lst.addFirst(e);
    }
    
}
