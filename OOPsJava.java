package com.javabasics;

public class OOPsJava {
	
	
   // Encapsulation restricts direct access to some of an object's components, 
   // which helps prevent unintended interference and misuse of the data.	
	
	
   // To allow controlled access to the private data members, public methods (also known as accessor methods) are provided.	
   public static int myInt = 0 ;
   
   
   //The data members (fields or attributes) of a class are often marked as private. 
   //This makes them accessible only within the class itself, and not from outside.

   
   private static int myPrivateInt = 1;
   
   
   
   // Protected members are accessible within the same class, 
   // within subclasses (even if the subclass is in a different package),
   // and within the same package.
   protected static int myProtectedInt = 2;
   
   
	
	
   public void polymorphism() {
	   System.out.println("In this way polymorphism works");
   }
   
   
   public static void inheritance() {
	   System.out.println("This is inheritance where property of parent class is transferred to child ");
	   
   }
	

}


class ExamplePolymorphism extends OOPsJava {
	
	//Polymorphism is the ability of objects of different classes to be treated as objects of a common superclass.
	//This allows for flexibility and extensibility in your code. 
	//While not directly shown in your example, polymorphism can be 
	//achieved through method overriding and interfaces in Java.

	
	@Override
	public void polymorphism() {
		// TODO Auto-generated method stub
		super.polymorphism();
		System.out.println("Here I changed the print statement");

		
	}
	
	public static void main(String[] args) {
		
        //An object is a real-world entity that can be identified distinctly.
		//For example,example here is an object below for class ExamplePolymorphism.
		
        ExamplePolymorphism example = new ExamplePolymorphism();
        example.polymorphism(); // This will call the overridden method in ExamplePolymorphism
	}
	
	
}


class ExampleInheritance extends OOPsJava {

	//Inheritance is the mechanism in which one class acquire all the features of another class.
	public static void main(String[] args) {
		inheritance();
		System.out.println(myInt);
	//	System.out.println(myPrivateInt);
		System.out.println(myProtectedInt);



	}
}




//Abstract class representing a generic vehicle
abstract class Vehicle {
 // Abstract method to represent the action of driving
 public abstract void drive();
}

//Concrete class representing a specific type of vehicle (Car)
class Car extends Vehicle {
 // Implementation of the drive method specific to a car
 @Override
 public void drive() {
     System.out.println("The car is being driven.");
 }
}

 
class AbstractionExample {
 public static void main(String[] args) {
     // Creating an instance of Car
     Car myCar = new Car();
     
     // Using abstraction to drive the car without knowing its internal details
     myCar.drive();
 }
}
