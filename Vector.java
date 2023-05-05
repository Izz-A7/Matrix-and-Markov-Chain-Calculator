
public class Vector extends Matrix {

	// Creating the constructor.
	public Vector(int c) {
		// Calling the Matrix constructor and sending 1 in as the value of r.
		super(1, c);
		
	}
	
	// Creating another constructor.
	public Vector(int c, double[] linArr) {
		// calling the Matrix constructor and sending 1 in as the value of r.
		super(1, c, linArr);
	}
	
	// Creating method to get element from the vector.
	public double getElement(int c) {
		// Calling the getElement method from the Matrix class and returning the result with the row value of 0.
		return super.getElement(0, c);
	}
}

