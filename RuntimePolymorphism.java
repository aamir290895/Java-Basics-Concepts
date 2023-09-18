package com.javabasics;



//Dynamic polymorphism is also known as runtime polymorphism or method overriding. 
//It occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. 

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class RuntimePolymorphism {
	
	 public static void main(String[] args) {
	        Shape s1 = new Circle();
	        Shape s2 = new Rectangle();

	        s1.draw(); // Calls the draw method of Circle class
	        s2.draw(); // Calls the draw method of Rectangle class
	    }

}
