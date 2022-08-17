package program6;

abstract class scooty
{
	abstract void run();
}
class dio extends scooty
{
	public void run()
	{
		System.out.println("duet scooty is running");
	}
}
public class abstraction {

	public static void main(String[] args) {
		dio d= new dio();
		d.run();
	}

}
