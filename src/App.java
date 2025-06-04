import controllers.QueueG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;
public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);

        System.out.println("Tam = " + stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tam = " + stack.size());
        stack.printStack();

        StackG<Integer> pilaG = new StackG<>();
        pilaG.push(10);
        pilaG.push(8);
        pilaG.push(-1);
        pilaG.push(5);
        System.out.println("Tam = " + pilaG.size());
        pilaG.printStack();
        pilaG.pop();
        System.out.println("Tam = " + pilaG.size());
        pilaG.printStack();

        System.out.println("");
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");

        QueueG<Persona> colaPersonas = new QueueG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.add(p4);
        System.out.println("Tam = " + colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Persona atendida -> " + colaPersonas.remove());
        System.out.println("Tam = " + colaPersonas.size());
        colaPersonas.printCola();
        Persona pB = colaPersonas.findByName("Juan");
        
    }
}