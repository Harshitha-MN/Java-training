package com.program4;

import java.util.Scanner;

public class Constructor {
	//copy constructor
	private double fruiteprice;  
	private String fruitename;  
	//constructor to initialize fruite price and fruite name   
	Constructor(double fruitePrice, String fruiteName)  
	{   
	fruiteprice = fruitePrice;  
	fruitename = fruiteName;  
	}  
	//creating a copy constructor  
	Constructor(Constructor fruit)  
	{  
	System.out.println("\nAfter invoking the Copy Constructor:\n");  
	fruiteprice = fruit.fruiteprice;  
	fruitename = fruit.fruitename;  
	}  
	//creating a method that returns the price of the fruit  
	double showPrice()  
	{  
	return fruiteprice;  
	}  
	//creating a method that returns the name of the fruit  
	String showName()  
	{  
	return fruitename;  
	}  
	
	
	
	
	
	
	
	{
        System.out.println("init block");
    }
 	
	
	
	
	
	
	
	//constructor overloading
	double width, height, depth;
	  
    // constructor used when all dimensions
    // specified
    Constructor(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }  
  
    // constructor used when cube is created
    Constructor(double len)
    {
        width = height = depth = len;
    }
  
    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }


    
    
    
    
    //Common Constructor for many examples
    		String name;	
	 
		   int n;
		   public Constructor(){
			   
			   System.out.println("default");
		      n = 100;
		      
		      name="Harshitha";
		      width = height = depth = 0;
		 
		   }
		   Constructor( int n,int x){
		      this.n = n;
		   }
		   Constructor (int x)
		    {
		        System.out.println(x);
		    }
	
	//parameterized constructor
	    int num;
	   String data;
	   float flt;
	   Constructor(int num, String data, float flt){
	      this.num = num;
	      this.data = data;
	      this.flt = flt;
	   }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		 while(true){
		System.out.println("Enter the choice : ");
		System.out.println("...............................");
		System.out.println("1. parameterized constructor");
		System.out.println("2. default constructor");
		System.out.println("3. no arg constructors");
		System.out.println("4. constructor overloading");
		System.out.println("5. constructor chaining");
		System.out.println("6. copy constructor");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:

			parameterizedConstructor();
			
			break;
			
		case 2:
			defaultConstructor();
			break;
		
		case 3:
			noargConstructor();
			break;
			
		case 4:
			constructoroverloading();
			break;
			
		case 5:
			constructorchaining();
			break;
			
		case 6:
			copyconstructor();
			break;
			
		
		
		
		}
		 }
	}
		 
		public static void copyconstructor() {
			Constructor  f1 = new Constructor(399, "Ruby Roman Grapes");  
			System.out.println("Name of the first fruit: "+ f1.showName());  
			System.out.println("Price of the first fruit: "+ f1.showPrice());  
			//passing the parameters to the copy constructor  
			Constructor f2 = new Constructor (f1);  
			System.out.println("Name of the second fruit: "+ f2.showName());  
			System.out.println("Price of the second fruit: "+ f2.showPrice());  
		
	}

		public static void constructorchaining() {
			// Object creation by calling no-argument
	        // constructor.
	        new Constructor ();
	 
	        // Object creation by calling parameterized
	        // constructor with one parameter.
	        new Constructor(10);
		
	}

		public static void constructoroverloading() {
			 Constructor  mybox1 = new Constructor(10, 20, 15);
			 Constructor mybox2 = new Constructor();
			
		  
		        double vol;
		  
		        // get volume of first box
		        vol = mybox1.volume();
		        System.out.println(" Volume of mybox1 is " + vol);
		  
		        // get volume of second box
		        vol = mybox2.volume();
		        System.out.println(" Volume of mybox2 is " + vol);
		  
		      
		
	}

		public static void noargConstructor() {

		    // object is created in another class
		    Constructor obj = new Constructor ();
		    System.out.println(" name = " + obj.name);
		
	}

		public static void defaultConstructor() {
		
				   
				      System.out.println(new Constructor ().n);
				      System.out.println(new Constructor(1000).n);
				   }
				
		
	

		public static  void parameterizedConstructor(){
			 Scanner sc = new Scanner(System.in);
		      System.out.println("Enter an integer value: ");
		      int num = sc.nextInt();
		      System.out.println("Enter a string value: ");
		      String data = sc.next();
		      System.out.println("Enter a floating point value: ");
		      float flt = sc.nextFloat();      
		      Constructor  obj = new Constructor(num, data, flt);
		      System.out.println(obj.num);
		      System.out.println(obj.data);
		      System.out.println(obj.flt);
			 
			 
			 
		 }
		 
	
}

