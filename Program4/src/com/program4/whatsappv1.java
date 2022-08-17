//multilevel inheritance :subclass inheriting the properties of super class and that superclass inheriting from another superclass

package com.program4;

class whatsapp1
{
	public void deliveryreport()
	{
		System.out.println("single tick");
	}
}

class whatsappv2 extends whatsapp1
{
	@Override //it compares the given method declaration of subclass with every other methods present in super class
	public void deliveryreport()
	{
		super.deliveryreport(); //it will point to immediate parent class object
		System.out.println("double tick");
	}
}
class whatsappv3 extends whatsappv2
{
	@Override
	public void deliveryreport()
	{
		//super.deliveryreport();
		System.out.println("blue tick");
	}
}
public class  whatsappv1
{
  public static void main(String[] args) 
	{
		whatsappv3 w1=new whatsappv3();
		w1.deliveryreport();
		whatsappv2 w2=new whatsappv2();
		w2.deliveryreport();
	}
}
