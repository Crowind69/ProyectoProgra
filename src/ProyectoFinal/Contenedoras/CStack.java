package ProyectoFinal.Contenedoras;

import ProyectoFinal.cl.Graderia;

import java.util.Stack;

public class CStack {

    private Stack<Graderia> myStack;
    private Stack<Graderia> graderiaReservas;
    public CStack(){

        myStack = new Stack<Graderia>();
        graderiaReservas = new Stack<Graderia>();
    }
    CStack(Stack<Graderia> myStack, Stack<Graderia> graderiaReservas){

    }

    public void setMyStack(Stack<Graderia> myStack) {

        this.myStack = myStack;
    }

    public void setGraderiaReservas(Stack<Graderia> graderiaReservas) {
        this.graderiaReservas = graderiaReservas;
    }

    public Stack<Graderia> getStack() {

        return myStack;
    }

    public Stack<Graderia> getGraderiaReservas() {
        return graderiaReservas;
    }
}
