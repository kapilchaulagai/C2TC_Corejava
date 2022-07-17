package corejava_package;
@FunctionalInterface
interface Statement
{
	public String greet();//interface with single abstract method
}
public class LambdaExmple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s = ()->//Interface reference for lambda expression
		{
			return "Hello World";
		};  //lambda body ends with semicolon after closing braces
		String gr = s.greet();
		System.out.println(gr);
	}

}
