package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList{
    public ImmutableList add(Object e) {

    }//додає елемент у кінець колекції

    public ImmutableList add(int index, Object e) {

    }//додає елемент до колекції за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList addAll(Object[] c) {

    }//додає масив елементів у кінець колекції

    public ImmutableList addAll(int index, Object[] c) {

    }// додає масив елементів починаючи з зазначеного індекса, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public Object get(int index) {

    }//повертає елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList remove(int index) {

    }//видаляє елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList set(int index, Object e) {

    }//змінює значення елементу за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public int indexOf(Object e){

    }//шукає індекс елемента (повертає індекс першого який знайшов, або -1 у випадку відсутності)

    public int size(){

    }//розмір колекції

    public ImmutableList clear(){

    }//очищує вміст колекції

    public boolean isEmpty(){

    }//якщо у колеції нема елементів то повертає true

    public Object[] toArray(){

    }//перетворює колекцію до масиву обєктів

    @Override
    public String toString(){

    }//повертає рядок, де через кому відображаютсься елементи колекції

    private class Node{
        private Object value;
        private Node next;

        private Node(Object value){
            this.value = value;
            this.next = null;
        }
    }

}
