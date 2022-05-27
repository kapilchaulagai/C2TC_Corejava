package abc;

public class StatEx {
	static int age;
	public static void main(String[] args) {
		// TODO Example for Static
		StatEx st = new StatEx();
		StatEx st1 = new StatEx();
		st.age =30;
		st1.age=40;
		System.out.println("age is "+st.age);
		System.out.println("age is "+st1.age);
	}

}
