package javafsd;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit Typecasting
		byte n = 8;
		int i = n;
		byte b = 20;
		double m = b;
		System.out.println("Converted to int: " +i);
		System.out.println("Converted to double: " +m);
		//explicit Typecasting
		double d = 15.6;
		int a = (int)d;
		// data loss when convert larger to smaller datatype(convert forcefully)
		System.out.println("Converted to int: " +a);
		float f = 5.5f;
		byte s = (byte)f;
		System.out.println("Converted to byte: " +s);
		

	}

}
