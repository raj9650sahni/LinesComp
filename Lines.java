package assignment;

import java.util.*;
import java.lang.Math;

public class Lines {
	
	public void lineStatus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose from the below option ");
		System.out.println("Enter 1 to calculate the length of first line");
		System.out.println("Enter 2 to calculate the length of second line");
		System.out.println("Enter 3 to check the euality of two lines ");
		System.out.println("Enter 4 to compare two lines  ");
		int option = sc.nextInt();
		
	   
		
		switch(option)
		{
			case 1:
				double ans1 = firstline();
				System.out.println("length of the first line is = " + ans1);
				break;
				
				
			case 2:
				double ans2 = secondline();
			    System.out.println("length of second line is = " + ans2);                                   
			    break;
			    
			case 3: 
			    equals();
			    break;
			    
			case 4:
				toCompare();
				break;
			
			default:
			    System.out.println(" invalid input enter again ");
			    lineStatus();
		
		}
		sc.close();
	}
	
	public double firstline() {
		Scanner dp = new Scanner(System.in);
		System.out.println("enter the x1 coordinates of first line ");
		int x1= dp.nextInt(); 
		System.out.println("enter the y1  coordinates of first line ");
		int y1 = dp.nextInt();
		System.out.println("enter the x2 coordinates of first line ");
		int x2 = dp.nextInt();
		System.out.println("enter the y2 coordinates of first line ");
		int y2 = dp.nextInt();
		
		
		
		double line_len = (double) Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
		return line_len;
		

	}
	
	public double secondline() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the p1 coordinates of second line ");
		int p1= sc.nextInt(); 
		System.out.println("enter the q1 coordinates of second line ");
		int q1 = sc.nextInt();
		System.out.println("enter the p2 coordinates of second line ");
		int p2 = sc.nextInt();
		System.out.println("enter the q2 coordinates of second line ");
		int q2 = sc.nextInt();
		
		
	    double sec_line = (double) Math.sqrt(((p1-p2)*(p1-p2)) + ((q1-q2)*(q1-q2))); 
	
		return sec_line;
	
	
	
	}
	
	
	public void equals() {
		
		
		double l1 = firstline(); 
		
		double l2 = secondline();
		
		
		if (l1 == l2) {
			System.out.println("Lines are equal");
		}else {
			System.out.println("lines are not equal");
		}
		
	}
	
	public void toCompare() {
		
		double l1 = firstline(); 
		
		double l2 = secondline();

	    if (l1 == l2) {
	    	System.out.println("lines are equal");
	    }
	    else if (l1> l2) {
	    	System.out.println("first line is greater");
	    }
	    
	    else {
	    	System.out.println("second line is greater");
	    }
	    	
	}
}
	     
