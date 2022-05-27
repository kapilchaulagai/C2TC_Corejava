package corejava_package;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Library {

	public static void main(String[] args)throws IOException {
		// TODO Library Management
		Operation op = new Operation();
		op.input();
		op.compute();
		op.display();
		
	}

}

class Operation
{
	int accNum;
	int days;
	String title;
	String author;
	Scanner sc = new Scanner(System.in);
	void input()throws IOException
	{
		System.out.println("Enter the Accession Number: ");
		accNum = sc.nextInt();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Title of Book: ");
		title = reader.readLine();
		System.out.println("Enter the Author Name: ");
		author = reader.readLine();
		System.out.println("Enter the no. of days late for the submission of book: ");
		days = sc.nextInt();
	}

	void compute()
	{
		int fine = days*5;
		System.out.println("The fine amount for the book is "+fine+" Rupees only.\n");
	}
	void display()
	{
		System.out.println("ACCESSION NUM \t TITLE \t BOOK AUTHOR");
		System.out.println(accNum+"    \t\t"+title+"  \t"+author);
	}
	
}