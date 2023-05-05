
public class MarkovChain {
	// Creating instance variables stateVector and transitionMatrix.
	private Vector stateVector;
	private Matrix transitionMatrix;
	
	
	// Creating constructor to initialize the instance variables.
	public MarkovChain(Vector sVector, Matrix tMatrix) {
		this.stateVector = sVector;
		this.transitionMatrix = tMatrix;
	}
	
	
	// Method to check if the MarkovChain is valid.
	public boolean isValid() {
		// Checking if the transition matrix rows are equal to the columns 
		// Checking if the transition matrix rows (could have used columns but they're the same) are equal to the state vector columns.
		if (transitionMatrix.getNumCols() != transitionMatrix.getNumRows() || transitionMatrix.getNumRows() != stateVector.getNumCols()) {
			// Returning false if either one isn't equal.
			return false;
		}
		
		// Initializing sVectorSum.
		double sVectorSum = 0;
		// Summing up the state vector columns and then adding them to the previously created variable.
		for (int i = 0; i < stateVector.getNumCols(); i++) {
			sVectorSum += stateVector.getElement(i);
		}
		
		// Checking if the sum is in between 0.99 and 1.01.
		if (sVectorSum < 0.99 || sVectorSum > 1.01) {
			return false;
		}

		
		// Summing up the transition matrix rows and columns and then adding them into tMatrixSum.
		for (int i = 0; i < transitionMatrix.getNumRows(); i++) {
			double tMatrixSum = 0;
			for (int j = 0; j < transitionMatrix.getNumCols(); j++) {
				tMatrixSum += transitionMatrix.getElement(i, j); 
			}
		
			// Checking if the sum is in between 0.99 and 1.01.
			if (tMatrixSum < 0.99 || tMatrixSum > 1.01) {
				return false;
			}
		}
		// Returning true if everything passes the criteria.
		return true;
	}
		
	
	// Method to compute the probability of the matrix.
	public Matrix computeProbabilityMatrix(int numSteps) {
		
		// Calling the previously made isValid method.
		if (!isValid()) {
			return null;
		}
		
		
		// Creating m to hold the transitionMatrix.
		Matrix m = transitionMatrix;
		// Iterating through the number of steps - 1 to multiply the transition matrix by itself.
		for (int i = 0; i < numSteps - 1; i++) {
			m = m.multiply(transitionMatrix);
		}
		
		
		// Returning the result by multiplying the stateVector by m.
		return stateVector.multiply(m);
		
	}
	
}
