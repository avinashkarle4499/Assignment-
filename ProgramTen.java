package homeworkday2;

import java.util.Scanner;

public class ProgramTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cs=new Scanner(System.in); 
	     int n,i=1;
	     System.out.println("1,8,27,64,125(Limit):");
	     n=cs.nextInt();
	     while(i<=n)
	     {
	      System.out.print(i*i*i+" ");
	      i++;
	      }
	      cs.close();
	 }
	}


