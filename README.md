# Matrix-and-Markov-Chain-Calculator
This project is a Java program that provides a basic implementation of matrix and Markov chain operations. It includes classes for matrices and vectors, as well as a MarkovChain class for modeling Markov chains.

## Skills Learned
- Object-oriented programming in Java
- Working with classes and objects in Java
- Implementing matrix and vector operations in Java
- Understanding Markov chains and their properties

## Usage
To use this program, you can download the source code and run it in an IDE or compile it from the command line. You can then create matrices and vectors using the Matrix and Vector classes and perform operations such multiplication, and transposition. You can also create Markov chains using the MarkovChain class and compute their probability matrices.

## Constants
This program does not have any constants.

## Functions
- '**Matrix(int r, int c)**': This function creates a matrix with r rows and c columns.
- '**Matrix(int r, int c, double[] linArr)**': This function creates a matrix with r rows and c columns and initializes its elements using the values in linArr.
- '**getNumRows()**': This function returns the number of rows in the matrix.
- '**getNumCols()**': This function returns the number of columns in the matrix.
- '**getData()**': This function returns the matrix data.
- '**getElement(int r, int c)**': This function returns the element at row r and column c of the matrix.
- '**setElement(int r, int c, double value)**': This function sets the element at row r and column c of the matrix to value.
- '**transpose()**': This function transposes the matrix by swapping its rows and columns.
- '**multiply(double scalar)**': This function multiplies the matrix by a scalar value.
- '**multiply(Matrix other)**': This function multiplies the matrix by another matrix.
- '**toString()**': This function returns a string representation of the matrix.
- '**Vector(int c)**': This function creates a vector with c columns.
- '**Vector(int c, double[] linArr)**': This function creates a vector with c columns and initializes its elements using the values in linArr.
- '**getElement(int c)**': This function returns the element at column c of the vector.
- '**MarkovChain(Vector sVector, Matrix tMatrix)**': This function creates a Markov chain with the given state vector and transition matrix.
- '**isValid()**': This function checks if the Markov chain is valid.
- '**computeProbabilityMatrix(int numSteps)**': This function computes the probability matrix of the Markov chain after numSteps steps.

## Limitations
- It only provides a basic implementation of matrix and Markov chain operations.
- It does not handle input errors gracefully.
- It does not have a user interface.

## Possible Improvements
- Adding error handling for user input.
- Implementing additional matrix and vector operations.
- Adding a user interface for easier interaction.

## Conclusion
In conclusion, this project provided an opportunity to learn and practice object-oriented programming in Java and matrix and Markov chain operations. While the implementation is basic, it provides a foundation for further development and improvement.
