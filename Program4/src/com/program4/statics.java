package com.program4;

      public class statics 
      { 
    	  
    	  //static block we can execute static block without using a main method  ('_')
			  static
			  {
				  System.out.println("static block  ready");
			   }
		  
		  //this is static method
			   static int i = 10;
			   static String s = "static method";
		   
		  //static class
			   public static String str = "welcome to josh";
			   static class newtry
		       {
				   //non-static method
				   		public void disp() 
				   		{
				   			System.out.println(str); 
							   /* If you make the str variable of outer class
							    * non-static then you will get compilation error
							    * because: a nested static class cannot access non-
							    * static members of the outer class.
							    */
			             }
			    }
		        public static void main(String args[])
		        {  
		        	   System.out.println("java training"); 
						   
					    //static methods
						   System.out.println("i:"+i);
					       System.out.println("s:"+s);
					       
					    //static class
					       statics.newtry t = new newtry();  //we have non static method so that we create an object for this
					        t.disp();
			    }
      }


