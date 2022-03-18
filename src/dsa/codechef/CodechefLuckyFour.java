package dsa.codechef;

import java.util.Scanner;

class CodechefLuckyFour
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Scanner s = new Scanner(System.in);
		
		int tcount =  1; //s.nextInt();
		
		while(tcount-- > 0 )
		{
		   int fourCount = 0;
		   String numString =  "444" ;//s.nextLine();
		   char[] ch = numString.toCharArray();
		   
		   for(char c: ch){
		       if(Integer.parseInt(String.valueOf(c))== 4){
		           fourCount++;
		       }

		   }
			System.out.println(fourCount);
		  

		}
		
		
	}
}