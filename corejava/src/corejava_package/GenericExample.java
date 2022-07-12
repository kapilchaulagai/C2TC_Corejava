package corejava_package;
class GenericClass<T>
{
	GenericClass()
	{
		System.out.println("The Generic class is declared now. You can use it well.");
	}
	public void methodgeneric(T obj)
	{
		System.out.println("This type of the object that this class now contain is"+obj.getClass().getSimpleName());
	}
}
public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String> gc = new GenericClass<String>();
		gc.methodgeneric("Fahad");
		
		GenericClass<Integer> gc1 = new GenericClass<>();
		gc1.methodgeneric(123);
	}

}
