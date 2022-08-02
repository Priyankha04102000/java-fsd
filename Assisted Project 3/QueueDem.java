
package Array;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDem {
	public static void main(String[] args) {
		Queue<String> locationsQueue = new LinkedList<String>();
		locationsQueue.add("Jharkand");
		locationsQueue.add("TamilNadu");
		locationsQueue.add("KanyaKumari");
		locationsQueue.add("Manipur");
		locationsQueue.add("Burma");
		locationsQueue.add("Chennai");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}
}