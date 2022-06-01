package abc;

public class FinalEx extends Exmple1//extends Exam1 //final class cannot be inherited
{
	final int speedlimit = 90;
	void run()
	{
		//speedlimit = 400;//final variable cannot be changed
		System.out.println("Speed of car is restricted upto "+speedlimit+" .");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalEx fe = new FinalEx();
		Exmple1 el = new Exmple1();
		fe.run();
		el.run();
	}

}
//final class Exam1
class Exmple1
{
	 /*final*/ void run()//final method cannot be overridden
	{
		System.out.println("Dog can run faster than Cat.");
	}
}