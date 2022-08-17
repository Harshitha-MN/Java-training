package com.program4;

//hybrid inheritance
//this example includes single inheritance,hierarchical inheritance,hybrid inheritance
//karnataka class inherits the properties of india clss since india and karnataka relationship represents single inheritance
//further father cls inherited by son and inheritance class ,thus father becomes the parent class for son and inheritance these clss shows hierarchical inheritance
//combinedly it denotes hybrid inheritance


	//parent class  super class
	class india
	{  
		  public void show()  
		  {  
		   System.out.println("india is my country");  
		  }  
	}  
	//inherits india properties  
	class karnataka extends india 
	{  
		 public void show()  
		{  
		  System.out.println("karnataka is a state");  
		}  
	 }  
	//inherits karnataka properties  
	class banglore extends karnataka
	{  
		public void show()  
		{  
			System.out.println("banglore electronic city");  
		}  
	}  
	//inherits karnataka properties  
	public class inheritance extends karnataka
	{  
		public void show()  
		{  
			System.out.println("josh hudgi");  
		}  
	public static void main(String args[])  
	{  
		inheritance a = new inheritance();  
		a.show();  
	}  
}

