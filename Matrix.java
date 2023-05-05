
public class Matrix {
	// Creating instance variables for the rows, columns, and an array to store the data.
	private int numRows;
	private int numCols;
	private double[][] data;
	
	// Creating constructor to initialize instance variables and initialize data to have rows and columns.
	public Matrix(int r, int c) {
		this.numRows = r;
		this.numCols = c;
		this.data = new double[r][c];
	}
	
	// Creating constructor to initialize the matrix given an array of data.
	public Matrix(int r, int c, double[] linArr) {
		// Calling the previous constructor to initialize variables.
		this(r, c);
		int index = 0;
		// Iterating through the rows and columns of the matrix to initialize each element.
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = linArr[index];
				index++;
			}
		}
	}
	
	
	// Getter method to obtain number of rows.
	public int getNumRows() {
		return numRows;
	}
	
	// Getter method to obtain number of columns.
	public int getNumCols() {
		return numCols;
	}
	
	// Getter method to obtain matrix data.
	public double[][] getData() {
		return data;
	}
	
	// Getter method to obtain an element from the matrix.
	public double getElement(int r, int c) {
		return data[r][c];
	}
	
	// Setter method to set an element from the matrix.
	public void setElement(int r, int c, double value) {
		data[r][c] = value;
	}
	
	
	// Transpose method to switch rows and columns.
	public void transpose() {
		double[][] transposed = new double [numCols][numRows];
			// Iterating through the rows and columns of the matrix to swap the rows and columns at the end.
			for (int i = 0; i < numRows; i++) {
				for (int j = 0; j < numCols; j++) {
					transposed[j][i] = data[i][j];
				}
			}
		// Updating the data with the transposed data.
		data = transposed;
		// Swapping the number of rows and columns.
		int temp = numRows;
		numRows = numCols;
		numCols = temp;
	}
	
	
	// Method to multiply a matrix by a scalar value.
	public Matrix multiply(double scalar) {
		// Initializing the new result matrix.
		Matrix result = new Matrix(numRows,numCols);
		// Iterating through the rows and columns to multiply each element by the scalar.
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				result.data[i][j] = data[i][j] * scalar;
			}
		}
		// Returning the resulting matrix.
		return result;
	}

	
	// Method to multiply two matrices.
	public Matrix multiply(Matrix other) {
		// Checking if the number of columns is equal to the number of rows.
		if (numCols != other.numRows) { 
			// If the above statement is true it will return null.
			return null;
		}
		
		// initializing the new result matrix.
		Matrix result = new Matrix(numRows, other.getNumCols());
		
		// Iterating through the rows and columns of the result matrix.
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < other.getNumCols(); j++) {
				// Initializing the value of each element of the result matrix to 0.
				result.data[i][j] = 0;
				// Iterating through the columns of the matrix to multiply the two matrices.
				for (int k = 0; k < numCols; k++) {
					// Multiplying the matrices and then adding them into the result.
					result.data[i][j] += data[i][k] * other.data[k][j]; 
				}
			}
		}
		// Returning the result.
		return result;

	}
	
	
	// Creating a string for the matrix.
	public String toString() {
		// If the matrix has == 0 in either the rows or columns then it will return "Empty Matrix".
		if (numRows == 0 || numCols == 0) {
			return "Empty matrix";
		}
		
		// Initializing the result string.
		String result = "";
		// Iterating through the rows and columns of the matrix.
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				// Adding the rows and columns into the result while also formatting it to have 8 spaces and decimal spaces for each number.
				result += String.format("%8.3f", data[i][j]);
			}
			// Creating a new line for each row.
			result += "\n";
		}
		
		// Returning the result.
		return result;
	}
	
}
