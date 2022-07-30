package com.Module1;

import java.util.Scanner;

//import com.sun.tools.sjavac.server.SysInfo;

public class pro2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character :");
        String input=sc.next();
		System.out.println("input is "+input);
		char[] array=input.toCharArray();
		if(input.length()>1)
		{
			System.out.println("Enetr only one character ");
		}
		else if(array[0]=='a'||array[0]=='e'||array[0]=='i'||array[0]=='o'||array[0]=='u'||array[0]=='A'||array[0]=='E' ||array[0]=='I'||array[0]=='O'||array[0]=='U')
		{
			System.out.println("console");
		}
		else
		{
			System.out.println("vowel");
		}	
     }
}

    	
  
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Enter only one character: ");
		String ch = sc.next();
		if(ch.length()>1)
		{
				System.out.println("Error only one character");
		}
		else
		{
			 if(ch =="a"|| ch =="e" ||ch=="i"||ch=="o" ||ch=="u" ||ch=="A"||ch=="E"||ch=="I"||ch=="O"||ch=="U")
			{
			
				System.out.println("Vowel");
				
			}
			 else
			 {
				 System.out.println("Constant ");
			 }
		}
			

		
		
		
	}

}*/

		
