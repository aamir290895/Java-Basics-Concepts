package com.javabasics;

public class StaticPolymorphism {
	
	// Static polymorphism is also known as compile-time polymorphism or method overloading.
	// It occurs when multiple methods in the same class have the same name but different parameter lists (different types or different numbers of parameters). 
	
	int add() {
		int x , y, res;
		
		x = 10;
		y = 20;
		
		return res = x+ y;
	}
	
	
	void add(int x , int y) {
		int res;
		res = x+ y;
		
		System.out.println(res);
	}

}

class Resut extends StaticPolymorphism{
	
	public static void main(String[] args) {
		StaticPolymorphism poly = new StaticPolymorphism();
		int res =  poly.add();
		System.out.println(res);
	}
}


