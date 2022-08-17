package program6;

public class encapsulation {
		  public static void main(String[] args) {

		    // create an object of Person
		    Person p1 = new Person();

		    // change age using setter
		    p1.setAge(21);
		    p1.setName("Harshi");;

		    // access age using getter
		    System.out.println("My age is " + p1.getAge());
		    System.out.println("My name is " + p1.getName());
		  }
		}

