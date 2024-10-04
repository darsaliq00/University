class Person
{
	public void speak()
	{
		System.out.println("The person is speaking");
	}
}

class Teacher extends Person
{
	public void speak()
	{
		System.out.println("The teacher is giving a lecture");
	}
}

class Student extends Person
{
	public void speak()
	{
		System.out.println("The student is asking questions");
	}
}

public class people
{
	public static void main(String[] args)
	{
		Person a =new Person();
		a.speak();
		
		Student s =new Student();
		s.speak();
		
		Teacher t =new Teacher();
		t.speak();
	}
}