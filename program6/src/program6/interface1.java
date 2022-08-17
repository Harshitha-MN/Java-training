package program6;
interface instagrampost
{
	public void like(); //abstract method
	public void comment();
	public void share();
}
interface photoedit
{
	public void crop();
	public void filter();
	public void background();
}
class post implements instagrampost
{
	@Override
	public void like() // by implementation we complete the abstract method statements
	{
		System.out.println("post liked");
	}
	public void comment()
	{
		System.out.println("comments published");
	}
	public void share()
	{
		System.out.println("posts shared");
	}
}
class photo implements photoedit
{
	@Override
	public void crop()
	{
		System.out.println("photo cropped");
	}
	public void filter()
	{
		System.out.println("photo filterd");
	}
	public void background()
	{
		System.out.println("background cleared");
	}
}

public class interface1 {
	public static void main(String[] args) {
		post p1=new post();
		p1.like();
		p1.comment();
		p1.share();
		photo p2=new photo();
		p2.crop();
		p2.filter();
		p2.background();
	}
}
