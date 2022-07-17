package abc;
class GenericMethod
{
	public <T> void methodgen(T var)
	{
		System.out.println("The value passed is of type "+var.getClass().getSimpleName());
	}
}
public class GenericMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj = new GenericMethod();
		obj.<String>methodgen("Fahad Bhai");
		obj.<Integer>methodgen(123);
		
		obj.methodgen("Kapil");
		obj.methodgen(456);
	}

}
