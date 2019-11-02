package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList{
    private Node head;

    public ImmutableLinkedList() {
        this.head = new Node();
    }

    public ImmutableList add(Object e) {
        Node current_node = this.head;
        ImmutableLinkedList result = new ImmutableLinkedList();
        result.head.value = current_node.value;
        Node new_node = result.head;
        while(current_node.next != null){
            current_node = current_node.next;
            new_node.next = new Node(current_node.value);
            new_node = new_node.next;
        }
        new_node.next = new Node(e);
        return result;
    }//додає елемент у кінець колекції

    public ImmutableList add(int index, Object e) {
        Node current_node = this.head;
        ImmutableLinkedList result = new ImmutableLinkedList();
        result.head.value = current_node.value;
        Node new_node = result.head;
        for (int i = 0; i < index; i++) {

        }
        return result;
    }//додає елемент до колекції за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції


    public ImmutableList addAll(Object[] c) {
        return null;
    }//додає масив елементів у кінець колекції

    public ImmutableList addAll(int index, Object[] c) {
        return null;
    }// додає масив елементів починаючи з зазначеного індекса, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public Object get(int index) {
        return null;
    }//повертає елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList remove(int index) {
        return null;
    }//видаляє елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList set(int index, Object e) {
        return null;
    }//змінює значення елементу за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public int indexOf(Object e){
        return 0;
    }//шукає індекс елемента (повертає індекс першого який знайшов, або -1 у випадку відсутності)

    public int size(){
        return 0;
    }//розмір колекції

    public ImmutableList clear(){
        return null;
    }//очищує вміст колекції

    public boolean isEmpty(){
        return false;
    }//якщо у колеції нема елементів то повертає true

    public Object[] toArray(){
        return null;
    }//перетворює колекцію до масиву обєктів

    @Override
    public String toString(){
        return null;
    }//повертає рядок, де через кому відображаютсься елементи колекції

    private class Node{
        private Object value;
        private Node next;

        private Node(Object value){
            this.value = value;
            this.next = null;
        }

        private Node(){
            this.value = null;
            this.next = null;
        }
    }

}
