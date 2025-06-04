package controllers;

import java.util.EmptyStackException;
import models.NodeGeneric;


;

public class QueueG <T>{
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public QueueG (){
        this.primero = null;
        this.ultimo = null;
    }
    public void add(T value){
        NodeGeneric<T> newNodeGeneric = new NodeGeneric<>(value);
        if (isEmpty()){
            primero = newNodeGeneric;
            ultimo = newNodeGeneric;
        } else {
            ultimo.setNext(newNodeGeneric);
            ultimo = newNodeGeneric;
        }
        size++;
    }

    public T remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T aux =  primero.getValue();
        primero = primero.getNext();
        size--;
        return aux;
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();
    }

    public boolean isEmpty(){
        return primero == null;
    }
    public int size(){
        return size;
    }

    public void printCola(){
        NodeGeneric<T> aux = primero;
        System.out.print(" | ");
        while (aux != null){
            T nombre = aux.getValue();
            aux = aux.getNext();

            System.out.print(nombre + " | ");
        }
        System.out.println("");
    }
}
