package javafsd;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("jahnavi"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Fought"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}