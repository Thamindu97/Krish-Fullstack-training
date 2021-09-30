import java.math.BigDecimal;

public class BigDecimalCode{

    	public static void main(String args[]){

		// Initializing string array of 10 students marks
       	 	Double[] marksArray = {70.5, 80.0, 54.35, 84.75, 91.0, 67.5, 86.0, 91.75, 88.5, 71.5};

        	// Number of students ( Size of the array )
        	int noOfStudents = marksArray.length; 	

		//  Average Marks
        	BigDecimal marks;
        	BigDecimal totalMarks = new BigDecimal("0");
		BigDecimal avgMarks = new BigDecimal("0");

        	// Calculating Average Marks
		for(int i = 0; i < noOfStudents; i++)
        	{
			marks = new BigDecimal(Double.toString(marksArray[i]));
            		totalMarks = totalMarks.add(marks); 
		} 
  
        	avgMarks = totalMarks.divide(new BigDecimal(noOfStudents));

		System.out.println("Average Marks: " + avgMarks.toString());
        


	}
}