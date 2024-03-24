//{ Driver Code Starts
//Initial Template for Java

//Initial Template for C++
//Initial Template for C++

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

//Back-end complete function Template for Java
class Geeks{
    
  
    static void comment(int a, int b, int c){
        
    
        System.out.println(a);
    
        System.out.println(c);
    }
    
}

//{ Driver Code Starts.
 
class gfg{
    
    public static void main(String args[]){
        //Creating an Object of Scanner class
        Scanner sc = new Scanner(System.in);
        
        //Getting number of testcases
        int testcase = sc.nextInt();
        
        // Taking input for all testcases
        while(testcase-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            //Creating an Object of class Geeks
            Geeks g = new Geeks();
            
            //Calling the comments function of class Geeks
            g.comment(a, b, c);
        }
    }
    
} 
// } Driver Code Ends