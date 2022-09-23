package lis;

import java.util.Scanner;
public class one {
public void insert()
{
	int Roll;
	String dept,Name;
	Scanner ob = new Scanner(System.in);
	System.out.println("enter :");
	Roll = ob.nextInt();
	dept = ob.next();
	Name = ob.next();
	one ob1= new one();
	ob1.display(Roll,Name,dept);
}
	public void display(int Roll,String Name,String dept) {
	
	//printing the input
	System.out.println(Roll);
	System.out.println(Name);
	System.out.println(dept);
	
}




	public static void main(String[] args) {
		one x = new one();
		x.insert();
		


	}

}
