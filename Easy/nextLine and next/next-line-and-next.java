//{ Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Geeks g = new Geeks();
		g.getInput();
	}
}
// } Driver Code Ends


//User function Template for Java

//Complete the function
class Geeks {
static void getInput () {
 
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt(); //Taking the number of testcases
    while(t-->0)
    {
    int a = sc.nextInt();
    sc.nextLine(); //a will have int value along with it '/n' will be stored in buffer/memory.
        String s =sc.nextLine(); //nextLine will read new line character so it will print a new line only.
        //so we need to input the string once again.
        
        //Your code here
    
    System.out.println(a);
    System.out.println(s);
    }
 
}
}

