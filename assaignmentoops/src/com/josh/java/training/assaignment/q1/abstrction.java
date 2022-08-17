package com.josh.java.training.assaignment.q1;

abstract class animal
{
	String name;
	public animal(String name)
	{
		this.name="name";
    }
	public abstract void greets();
}
class cat extends animal
{
	public cat(String name)
	{
		super(name);
		this.name="name";
	}
	@Override
	public void greets()
	{
		System.out.println("meow");
	}
}
class dog extends animal
{
	public dog(String name)
	{
		super(name);
		this.name="name";
	}
	@Override
	public void greets()
	{
		System.out.println("woof");
	}
	public void greets1( String another)
	{
		System.out.println("woooof");
	}
}
class bigdog extends dog
{
	public bigdog(String name)
	{super(name);
		this.name="name";
	}
	@Override
	public void greets()
	{
		System.out.println("wooow");
	}
	public void greets2(String dog)
	{
		System.out.println("wooooow");
	}
	public void greets(String bigdog)
	{
		System.out.println("woooooooooow");
	}
}
class abstrction
{
public static void main(String[] args) {
	{
		cat c=new cat("zuzu");
		dog d=new dog("babbu");
		bigdog bd=new bigdog("babbudu");
		c.greets();
		d.greets();
		d.greets1("bijili");
		bd.greets();
		bd.greets2("ambu");
		bd.greets1("gfsad");
	}
}
}