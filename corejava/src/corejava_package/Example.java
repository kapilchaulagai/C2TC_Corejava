package corejava_package;

public class Example {
	Example(){
		System.out.println("This is Default or no parameterized Constructor.");
	}
	Example(int legs, int eyes){
		System.out.println("This is 2  parameterized Constructor.");
		System.out.println("Fahad has "+legs+" legs.And has "+eyes+" eyes.");
	}
	Example(String name,int age,float salary)
	{
		System.out.println("This is 3  parameterized Constructor.");
		System.out.println("Fahad's another name is "+name+" ,his age is "+age+" and has salary of amount "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		Example ex1 = new Example(2,2);
		Example ex2 = new Example("Zameer",21,2000.5f);
	}

}
