package com.harshu;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		 while(true){
		System.out.println("Enter the choice : ");
		System.out.println("...............................");
		System.out.println("1. if-else statement");
		System.out.println("2. java for loop");
		System.out.println("3. java while loop");
		System.out.println("4. do-while loop");
		System.out.println("5. java continue statement");
		System.out.println("6. Nested for loop");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:

			System.out.println("enter the number");
			int number=sc.nextInt();
			if(number>0) {
				System.out.println("number is positive");
			}else if(number<0) {
				System.out.println("number is negative");
			}else {
				System.out.println("number is zero");
			}
			
			break;
			
		case 2:
			
			System.out.println("enter the value of n");
			int n =sc.nextInt();
		     
		    for (int i = 1; i <= n; ++i) {
		      System.out.println("developer in josh company");
		    }
			break;
			
		case 3:
			
			System.out.println("enter the value of i: ");
			int i = sc.nextInt();
			int m=1;
			 
	        
	        while (m < i) {
	            System.out.println("Hello World");
	 
	            // update expression
	            m++;
	        }
	        
	        break;
	     case 4:
	    	 
	    	 System.out.println("enter the value of j: ");
	    	 int g=sc.nextInt();
	    	 int j=1;    
	    	    do{    
	    	        System.out.println(j);    
	    	    j++;    
	    	    }while(j<=g); 
	    	    break;
	    	    
	     case 5:
	    	 System.out.println("Enter the value of h: ");
	    	 int h=sc.nextInt();
	    	 for(int k=1;k<=h;k++){
	    	    	if(k==5){	    	    	    
	    	    		continue;
	    	    	}
	    	    	System.out.println(k);
	    	 }
	    	    	
	    	    	break;
	    	    	
	    	    	
	    	    	
	     case 6:
	    	 System.out.println("enter the number of rows");
	    	 int rows = sc.nextInt();

	    	   
	    	    for (int o = 1; o <= rows; ++o) {

	    	     
	    	      for (int q = 1; q<= o; ++q) {
	    	        System.out.print(q + " ");
	    	      }
	    	      System.out.println("");
	    	    }
	    	    
	    	    break;
			
		}

	}
		
}
}

