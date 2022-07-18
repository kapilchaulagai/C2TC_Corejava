package cap.practice.java;
/*public*/ class Student //Only one class can be public and that also for classname.java
{
	private String name;
	
	public String getName()
	{
		System.out.println(name);
		return name;
	}
	public void setName(String studentName)
	{
		name = studentName;
	}
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		//obj.name = "John";//name is a private literal so can't be called outside where it resides
		obj.setName("John");
		obj.getName();
	}

}
