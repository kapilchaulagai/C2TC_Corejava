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
	public double sales_amount;
	public double commission_amount;
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
	void calculation()
	{
		System.out.println("Enter the Sales Amount: ");
		sales_amount = scan.nextInt();
		if(sales_amount>=100000)
		{
			commission_amount = 0.1*sales_amount;
			System.out.println("The commission amount is: "+commission_amount);
		}
		else if(sales_amount>=50000&&sales_amount<100000)
		{
			commission_amount = 0.05*sales_amount;
			System.out.println("The commission amount is: "+commission_amount);
		}
		else if(sales_amount>=30000&&sales_amount<50000)
		{
			commission_amount = 0.03*sales_amount;
			System.out.println("The commission amount is: "+commission_amount);
		}
		else
		{
			System.out.println("No commission");
		}
	}
	void display()
	{
		System.out.println("NAME \t ADDRESS \t PHONE NUMBER\t SALES AMOUNT\t COMMISSION AMOUNT");
		System.out.println(name+" \t"+address+"  \t"+phone+ " \t\t "+sales_amount+ "\t\t " +commission_amount+ "\t ");
	}
}