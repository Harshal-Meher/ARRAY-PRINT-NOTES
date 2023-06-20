package Veiw;

import java.util.Scanner;

import Controller.Control;
import Model.Model;

public class View  {
	
 Model m = new Model();
// Control c  = new Control();
int n=0;
int k=0,i;

void menu()
{
	System.out.println(":::List:::");
	System.out.println("1.Insert");
	System.out.println("2.show");
	System.out.println("3.Update");
	System.out.println("4.Delete");
	System.out.println("5.Search");
	System.out.println("0.Exit");
}
public View()
{

	Control s[]=new Control[1000];

	boolean loop=true;
	while(loop)
	{
	menu();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Choice: ");
	int ch=Integer.parseInt(sc.nextLine());
	
	int roll = 0;
	String name = null;
	double p1 = 0,p2 = 0,p3 = 0;
	
	switch(ch)
	{
	
	case 1:
		System.out.println(":::Insert:::");
		System.out.println("Enter the number of student: ");
		n=Integer.parseInt(sc.nextLine());
		
	for( i=k;i<n+k;i++)
	{
    s[i]=new Control();
	s[i].insert(roll, name, p1, p2, p3);
	}
	k=n+k;
		break;
	case 2:
		System.out.println("::Show::");
		for( i=0;i<k;i++)
		{
			s[i].show(roll,name,p1, p2, p3);
		}
		break;
	case 3:
		int user=0;
		System.out.println("::::UPDATE::::");
		System.out.println("Enter Roll : ");
        int roll1=Integer.parseInt(sc.nextLine());
		m.setRoll(roll1);
		for( i=0;i<k;i++)
		{
		if(roll1==m.getRoll())
	    {
		s[i].update(roll, name, p3, p3, p3);
		}
		else
		{
			user++;
		}
		
		if(user==k)
		{
		System.out.println("SORRY STUDENT NOT FOUND.........");
		}
		}
		break;
	case 4:
		System.out.println("::::Delete::::");
		System.out.println("Enter Roll : ");
        int roll2=Integer.parseInt(sc.nextLine());
		m.setRoll(roll2);
		for( i=0;i<k;i++)
		{
		if(roll2==m.getRoll())
	    {
		s[i]=s[k-1];
		k--;
		System.out.println("Data Delete");
		break;
		}
		}
		if(i==k)
		{
		System.out.println("SORRY STUDENT NOT FOUND.........");	
		}
		break;
	case 5:
		System.out.println("::::Search::::");
		break;
	case 0:
		System.out.println(":::Exit:::");
		loop=false;
		break;
		
	}
	
}
}

}