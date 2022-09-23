//Denis Olaleye
//22.09.22

/*
 * Write a class named ShowStudent that instantiates a Student object from the class you created and assign values to its fields. Compute the Student grade
point average, and then display all the values associated with the Student. Save the application as ShowStudent.java. */

public class ShowStudent 
{
	public static void main (String [] args)
	{
		//instantiating Student object
		Student student = new Student();
		
		//setting values to the class fields using set methods
		student.setId(1);
		student.setCreditHours(50);
		student.setPointsEarned(200);
		
		//displaying values associated with the student
		System.out.println("Student's ID is " +student.getId());
		System.out.println(student.getCreditHours()+ " credit hours earned");
		System.out.println(student.getPointsEarned()+ " points earned");
		System.out.println("Grade point average is equal to " +student.computeGradePointAvrg(student.getPointsEarned(), student.getCreditHours()));

	}

}
