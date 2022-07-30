package javafsd;

public class MyClass 
{
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[7] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array is collection of object!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}