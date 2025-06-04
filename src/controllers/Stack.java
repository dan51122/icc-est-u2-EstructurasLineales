package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {
    private Node top;       //Nodo encima de la pila

    public Stack(){
        this.top = null;
    }

    public void push (int numeros){
        Node newNode = new Node(numeros);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();

        return value;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node aux = top;
        System.out.print(" | ");
        while (aux != null){
            int value = aux.getValue();
            aux = aux.getNext();

            System.out.print(value + " | ");
        }
        System.out.println("");
    }
    public int size(){
        Node aux = top;
        int tamanio =0;
        while (aux != null){
            aux = aux.getNext();
            tamanio+=1;
        }
        return tamanio;
    }
}