package javafsd;

public class innerClass2 {
	private String message="Beautiful Mountain";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(message);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerClass2  ob=new innerClass2 ();  
		ob.display();  
		}


}