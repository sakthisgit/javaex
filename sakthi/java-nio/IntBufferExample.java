// Java program to demonstrate 
// allocate() method 

import java.nio.*; 
import java.util.*; 

public class IntBufferExample { 
	public static void main(String[] args) 
	{ 

		// Declaring the capacity of the IntBuffer 
		int Capacity = 10; 

		// Creating the IntBuffer 

		// creating object of intbuffer 
		// and allocating size capacity 
		IntBuffer ib = IntBuffer.allocate(Capacity); 

		// putting the value in intbuffer 
		ib.put(11); 
        ib.put(2, 19); 
        ib.put(5,10);

		System.out.println("IntBuffer: "
						+ Arrays.toString(ib.array())); 
	} 
} 
