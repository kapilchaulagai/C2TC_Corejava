package corejava_package;
import java.util.*;
public class Commission {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business cm = new Business();
		cm.input();
		cm.calculation();
		cm.display();
	}

}
class Business
{
	String name;
	String address;
	long phone;
	public int sales_amount;
	public int commission_amount;
	Scanner scan = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter your Name: ");
		name = scan.nextLine();
		System.out.println("Enter your Address: ");
		address = scan.nextLine();
		System.out.println("Enter your Phone Number: ");
		phone = scan.nextLong();
	}
	int calculation()
	{
		System.out.println("Enter the Sales Amount: ");
		sales_amount = scan.nextInt();
		int value = sales_amount;
		if(sales_amount>=100000)
		{
			commission_amount = (10/100)*value;
			System.out.println("The commission amount is: "+commission_amount);
			return commission_amount;
		}
		else if(sales_amount>=50000&&sales_amount<100000)
		{
			commission_amount = (5/100)*value;
			System.out.println("The commission amount is: "+commission_amount);
			return commission_amount;
		}
		else if(sales_amount>=30000&&sales_amount<50000)
		{
			commission_amount = (3/100)*value;
			System.out.println("The commission amount is: "+commission_amount);
			return commission_amount;
		}
		else
		{
			System.out.println("No commission");
			return commission_amount;
		}
	}
	void display()
	{
		System.out.println("NAME \t ADDRESS \t PHONE NUMBER\t SALES AMOUNT\t COMMISSION AMOUNT");
		System.out.println(name+" \t"+address+"  \t"+phone+ " \t\t "+sales_amount+ "\t\t " +commission_amount+ "\t ");
	}
}