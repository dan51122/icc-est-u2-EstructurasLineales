package controllers;
import java.util.EmptyStackException;
import models.NodeGeneric;

public class StackG <T> {
    private NodeGeneric<T> top;
    private int size;

    public StackG (){
        this.top =null;
        this.size = 0;
    }

    public void push (T numeros){
        NodeGeneric<T> newNode = new NodeGeneric<>(numeros);
        newNode.setNext(top);
        top = newNode;
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();

        return value;
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        NodeGeneric<T> aux = top;
        System.out.print(" | ");
        while (aux != null){
            T value = aux.getValue();
            aux = aux.getNext();

            System.out.print(value + " | ");
        }
        System.out.println("");
    }
    public int size(){
        NodeGeneric<T> aux = top;
        size =0;
        while (aux != null){
            aux = aux.getNext();
            size+=1;
        }
        return size;
    }

}
