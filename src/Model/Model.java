package Model;


public class Model 
{
private int roll;
private String name;
private double res,p1,p2,p3;


public int getRoll()
{
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public double getRes() {
//	return res;
//	}
public void setRes(double res) {
	this.res = res;
}
public double getP1() {
	return p1;
}
public void setP1(double p1) {
	this.p1 = p1;
}
public double getP2() {
	return p2;
}
public void setP2(double p2) {
	this.p2 = p2;
}
public double getP3() {
	return p3;
}
public void setP3(double p3) {
	this.p3 = p3;
}

public Model() 
{
	super();
	
}


















public Model(int roll, String name, double p1, double p2, double p3) {
	this.roll = roll;
	this.name = name;
    this.res = res;
	this.p1 = p1;
	this.p2 = p2;
	this.p3 = p3;
}
@Override
public String toString() 
{
	return "Model [roll=" + roll + ", name=" + name + ", res=" + res + ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
}

}
