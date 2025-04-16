package Curso;

public class Cursos {
	public String Name;
	public double TimeToFinish;
	public String Department;
	public String Principal;
	
	public Cursos() {}

	public Cursos(String name, double timeToFinish, String department, String principal) 
	{
		Name = name;
		TimeToFinish = timeToFinish;
		Department = department;
		Principal = principal;
	}
	
	@Override
	
	public String toString()
	{
		return "Name: " + Name +
			   "\nTime to finish: " + TimeToFinish +
			   "\nDepartment: " + Department +
			   "\nPrincipal: " + Principal;
	}
}

