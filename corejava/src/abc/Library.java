package abc;
import java.util.*;
public class Library {
	int accNum;
	int days;
	String title;
	String author;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			}

		}

		class Operation
		{
			
			void input()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Accession Number: ");
				accNum = sc.nextInt();
				System.out.println("Enter the Title of Book: ");
				title = sc.nextLine();
				System.out.println("Enter the Author Name: ");
				author = sc.nextLine();
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

