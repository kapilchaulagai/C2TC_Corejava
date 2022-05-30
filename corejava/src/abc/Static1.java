package abc;

public class Static1 {
static int legs = 4;
	
	
	int tail=1;
	static {
		System.out.println("WELCOME TO SEACET");
	}
	
	static void tiger()
	{
		//System.out.println("Tiger has "+tail+" tail.");  //instance variable (non-static) can not be accessed by static methods
		System.out.println("Tiger has "+legs+" legs.");
		//monkey("Banana"); non-static method cannot be called inside static method
	}
	String monkey(String eat)
	{
		System.out.println("Monkey has "+legs+" legs.");//static variables can be accessed by non-static methods
		System.out.println("Monkey has "+tail+" tail.");
		System.out.println("Monkey eats "+eat+" .");
		return eat;
	}
	
	public static void main(String[] args) {
		// TODO 
		tiger();	
		Static1 st = new Static1();
		st.monkey("FRUITS");
	}

}
