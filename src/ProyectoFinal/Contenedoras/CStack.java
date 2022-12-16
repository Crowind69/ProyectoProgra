package ProyectoFinal.Contenedoras;

import ProyectoFinal.Modelo.Graderia;

import java.util.Stack;

public class CStack {

    private static Stack<Graderia> myStack;
    
    public CStack(){

        myStack = new Stack<Graderia>();
    }
    
    CStack(Stack<Graderia> myStack){

    }

	public void setMyStack(Stack<Graderia> myStack) {

        this.myStack = myStack;
	}
	
	public Stack<Graderia> getStack() {

        return myStack;
	}
}
