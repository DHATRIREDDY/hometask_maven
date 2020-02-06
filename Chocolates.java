package com.epam_maven.Maven_hometask;

public class Chocolates extends Sweets{
	Chocolates(int num,int price,int weight)
	{
	super(num,price,weight);
	}
	public  String toString()
	{
	 String str="Price: "+this.price+" Weight: "+this.weight+" Total_Number: "+this.num;
	 return str;
	}
}
