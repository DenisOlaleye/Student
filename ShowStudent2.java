//Denis Olaleye
//22.09.22
/*Create a constructor for the Student class you created. The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and
credit hours to 3 (resulting in a grade point average of 4.0). Write a program that demonstrates that the constructor works by instantiating an object and
displaying the initial values. Save the application as ShowStudent2.java.*/

public class ShowStudent2 
{
	public static void main(String[] args) 
	{
		//istantiating Student class object
		Student stud = new Student();
		
		//displaying default values setted wit constructor
		System.out.println("Student Denis Olaleye, ID number: " +stud.getId());
		System.out.println("Earned " +stud.getPointsEarned()+ " points, for " +stud.getCreditHours()+ " credit hours.");
		
		//displaying computed GPA
		stud.computeGradePointAvrg(stud.getPointsEarned(), stud.getCreditHours());

	}

}
