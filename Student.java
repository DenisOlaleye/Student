//Denis Olaleye
//21.09.2022

/*Create a class named Student that has fields for an ID number, number of credit hours earned, and number of points earned. 
(For example, many schools compute grade point averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.)
Include methods to assign values to all fields. A Student also has a field for grade point average. Include a method to compute the grade point average
field by dividing points by credit hours earned. Write methods to display the values in each Student field. Save this class as Student.java.*/

public class Student 
{
	//declaring class fields
	private int studentsId;
	private double creditHoursEarned;
	private double pointsEarned;
	private double gradePointAverage;
	
	//creating constructor for Student class
	public Student()
	{
		studentsId = 9999;
		creditHoursEarned = 3;
		pointsEarned = 12;
	}
	
	//writing methods to set values to the fields
	public void setId(int id)
	{
		studentsId = id;;
	}
	public void setCreditHours(double hours)
	{
		creditHoursEarned = hours; 
	}
	public void setPointsEarned(double points)
	{
		pointsEarned = points;
	}
	
	//writing methods to get values from the fields
	public int getId()
	{
		return studentsId;
	}	
	public double getCreditHours()
	{
		return creditHoursEarned;
	}	
	public double getPointsEarned()
	{
		return pointsEarned;
	}
	//method to compute GPA
	public double computeGradePointAvrg(double pointsEarned, double creditHoursEarned)
	{
		gradePointAverage = pointsEarned/creditHoursEarned;
		
		System.out.println("Grade point average is equal to " +gradePointAverage);
		return gradePointAverage;
	}
	
}
