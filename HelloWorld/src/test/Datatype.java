package test;

import java.util.Scanner;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----Printing string
		
		System.out.println("Hello world");
	//-----Datatype in java
		int n1=10;
		int n2=11;
		
		int sum=n1+n2;
		Float mul=(float)n1*n2;
		float div=(float)n1/n2;
		
		String Name="Ash";
		System.out.println("My name is " + Name);
		System.out.println("Length of string is "  + Name.length());
		System.out.println( Name.concat("wini"));
		
				
		
		int reminder=n2%n1;
		System.out.println("Addition of " + n1 + " and  " + n2 + " is :"+sum);
		System.out.println("Multiplication  of " + n1 + " and  " + n2 + " is : "+mul);
		System.out.println("quotient of " + n1 + " and  " + n2 + "   is :"+div);
		System.out.println("reminder is " + reminder);
		
		//---input by user --using scanner class
		/*Scanner sc =new  Scanner(System.in);
		
		System.out.println("Enter the username :");
		 String name=sc.next();
		
		 System.out.println("Enter the lenght of the username :"+ name.length() );
		 System.out.println("Check the name will start with   S  "+ name.startsWith("S", 0) );
		 
		 if(sc.match()==null)
		 {
			System.out.println("username not empty") ;
		 }*/
		
		 
		 //--Arrays---------
		 
		 int arrays []= {10,21,32,43,54};
		  System.out.println("Third value of the array " + arrays[2]);
		  for(int i=0;i< arrays.length;i++)
			  System.out.println("Number with index value :"+ i +"  " + arrays[i]);
		 
		 
		 
		 //--String arrays--
		   String Sarrays []= {"Apple","kiwi" , "banana"};
		   System.out.println("Lenght of the string array is :" + Sarrays.length);
		   /*for(int i=0;i< Sarrays.length;i++)
				  System.out.println("Print the String Arrays with number of characters in each string  "+  Sarrays[i]+" "+ Sarrays[i].length());
			 */
		  if( Sarrays[0].equals("fruits"))
			  
			  System.out.println("Enterd string is equals to array");
		  
		  else
			  System.out.println("Enterd string is not equals to array");
			  
		 
		 
		 
		
			
	}

}
