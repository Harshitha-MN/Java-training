package com.program4;

//aggregation : we use this for the code reusabiity purpose when there is no is-a relationship
//has a relationship

     class Operation 
       	{ 
			 int square(int n)
			 {  
			  return n*n;  
			 } 
       }  
		public class aggregation //circle
		{  
			Operation   op;//aggregation  
		   double pi=3.14;  
		   
					 double area(int radius)
					 {  
					   op=new Operation  ();  
					   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
					   return pi*rsquare; //circle formula
					 }
		 
		 public static void main(String args[])
		 {  
			 aggregation c=new aggregation();  
		     double result=c.area(6);  //radiusvalue6  6*6*3.14
		     System.out.println(result);  
		 }  
	}  
		   
