package com.epam_maven.Maven_hometask;

public class Sweets {
	int num,price,weight;
	Sweets(int no_of_sweets, int cost_of_sweet, int weight_of_sweet){
	this.num=no_of_sweets;
	this.price=cost_of_sweet;
	this.weight=weight_of_sweet;
	}

	public  String toString() {
	String str=" Weight: "+this.weight+"Price: "+ this.price+"Total Number: "+this.num;
	return str;
	}
	
}
