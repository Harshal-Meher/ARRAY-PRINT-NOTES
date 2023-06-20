package Controller;

import java.util.Scanner;

import Model.Model;

public class Control
{
	
Model m = new Model();


public void insert(int roll,String name,double p1,double p2,double p3 )
{
	Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter Your Roll No: ");
	 roll=Integer.parseInt(sc.nextLine());
	 m.setRoll(roll);
	 System.out.println("Enter Your Name: ");
	 name=sc.nextLine();
	 m.setName(name);
	 System.out.println("Enter Your Paper 1: ");
	 p1=Double.parseDouble(sc.nextLine());
	 m.setP1(p1);
	System.out.println("Enter Your Paper 2: ");
	 p2=Double.parseDouble(sc.nextLine());
	 m.setP2(p2);
	System.out.println("Enter Your Paper 3: ");
	 p3=Double.parseDouble(sc.nextLine());
	 m.setP3(p3);
	System.out.println("|.................................|");
}

public void show(int roll,String name,double p1,double p2,double p3)
{
	System.out.println("Roll : "+ m.getRoll());
	System.out.println("Name : "+ m.getName());
	System.out.println("Paper 1 : "+m.getP1());
	System.out.println("Paper 2 : "+m.getP2());
	System.out.println("Paper 3 : "+m.getP3());
//	res=(p1+p2+p3)/3;
//	System.out.println("Result : "+res);
	System.out.println("|.................................|");
}
//
public void update(int roll,String name,double p1,double p2,double p3)
{
	Scanner sc=new Scanner(System.in);
    System.out.println("1.Name");
    System.out.println("2.Result");
    System.out.println("Enter Your choice : ");
    int ch=Integer.parseInt(sc.nextLine());
    switch(ch)
    {
    case 1:
    	System.out.println("Old Name: "+m.getName());
    	System.out.println("Update Name: ");
    	name=sc.nextLine();
    	m.setName(name);
    	break;
    case 2:
    	System.out.println("::Result::");
    	System.out.println("1.Paper 1 ");
    	System.out.println("2.Paper 2 ");
    	System.out.println("3.paper 3 ");
    	System.out.println("Enter your choice : ");
    	int ch2=Integer.parseInt(sc.nextLine());
    	switch(ch2)
    	{
    	case 1:
    		System.out.println("Old Marks paper 1: "+m.getP1());
    		System.out.println("Update Paper 1 mark : ");
    		p1=Double.parseDouble(sc.nextLine());
    		m.setP1(p1);
    		break;
    	case 2:
    		System.out.println("Old Marks paper 2: "+m.getP2());
    		System.out.println("Update Paper 2 mark : ");
    		p2=Double.parseDouble(sc.nextLine());
    		m.setP2(p2);
    		break;
    	case 3:
    		System.out.println("Old Marks paper 3: "+m.getP3());
    		System.out.println("Update Paper 3 mark : ");
    		p3=Double.parseDouble(sc.nextLine());
    		m.setP3(p3);
    		break;   		
    	}
    	break; 
    }
}

}


