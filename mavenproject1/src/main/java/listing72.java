/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Leonel
 */

//interfas 

interface IStack{
    void push(Object item);
    Object pop();
}
//clase implementa la interfase 
class StackImpl implements IStack{
    protected Object[] stackArray;
    protected int tos; 
    
    public StackImpl(int capacity)
    {
        stackArray = new Object[capacity];
        tos =-1;
    }
    public void push(Object item)
    {
        stackArray[++tos] = item;
    }
    public Object pop()
    {
        Object objRef = stackArray[tos];
        stackArray[tos] = null;
        tos--;
        return objRef; 
    }
    public Object peek(){return stackArray[tos];};
}

interface ISafeStack extends IStack
{
    boolean isEmpty();
    boolean isFull();
}

class SafeStackImpl extends StackImpl implements ISafeStack{
    public SafeStackImpl (int capacity) { super(capacity);}
    public boolean isEmpty() {return tos < 0;}
    public boolean isFull() {return tos>= stackArray.length;
    }
} 




public class listing72 {
    public static void main(String[] args) {
        SafeStackImpl safeStackRef = new SafeStackImpl(10);
        StackImpl stackRef = safeStackRef;
        ISafeStack isafeStackRef = safeStackRef; 
        IStack istackRef = safeStackRef;
        Object objRef = safeStackRef;
        safeStackRef.push("Dolar");
        stackRef.push("Peso");
        stackRef.push(1);
        System.out.println(stackRef.peek().getClass());
        
        System.out.println(isafeStackRef.pop());
        System.out.println(istackRef.pop());
        
        System.out.println(objRef.getClass());
        
    }
}
