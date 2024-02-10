package com.testing1;
public class MathUtils
{
	public int add(int a,int b)
	{
	return a+b;}
	public int subtract(int a,int b){
	return a-b;}
	public int multiply(int a,int b){
	return a*b;}
	public double divide(int a,int b)
	{ 
		if(b==0)
			return -1;
		else
			return (double)a/b;
	}
public static void main(String[] args)
{
	MathUtils mu=new MathUtils();
	mu.add(3, 5);
	
}
}


	