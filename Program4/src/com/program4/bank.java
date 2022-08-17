package com.program4;
		// Concept of Association:n the this example, two separate classes Bank and Employee are associated through their Objects.
        //Bank can have many employees, So it is a one-to-many relationship. 
		/*Association is a relation between two separate classes which establishes through their Objects.
		  Association can be one-to-one, one-to-many, many-to-one, many-to-many. In Object-Oriented programming, 
          an Object communicates to another object to use functionality and services provided by that object.*/ 
		
		// Class 1
		// Bank class
		class bank1 
		{

			// Attributes of bank
			private String name;

			// Constructor of this class
			bank1(String name)
			{
				// this keyword refers to current instance itself
				this.name = name;
			}

			// Method of Bank class
			public String getBankName()
			{
				// Returning name of bank
				return this.name;
			}
		}

		// Class 2
		// Employee class
		class Employee
		{
			// Attributes of employee
			private String name;
			// Employee name
			Employee(String name)
			{
				// This keyword refers to current instance itself
				this.name = name;
			}

			// Method of Employee class
			public String getEmployeeName()
			{
				// returning the name of employee
				return this.name;
			}
		}

		// Class 3
		// Association between both the
		// classes in main method
		class bank 
		{
			public static void main(String[] args)
			{

				// Creating objects of bank and Employee class
				bank1 bank1 = new bank1("ICICI");
				Employee emp = new Employee("Ridhi");

				// Print and display name and
				// corresponding bank of employee
				System.out.println(emp.getEmployeeName()
								+ " is employee of "
								+ bank1.getBankName());
	}

}
