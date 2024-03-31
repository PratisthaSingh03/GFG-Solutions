//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total count-1 of elements 
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList-1
		    int v1[]=new int[n];
		    
		    //adding elements to the ArrayList-1
		    for(int i=0;i<n;i++)
		    {
		        v1[i]=sc.nextInt();
		    }
		    
		    //taking total count-2 of elements 
		    int m=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList-2
		    int v2[]=new int[m];
		    
		    //adding elements to the ArrayList-2
		    for(int i=0;i<m;i++)
		    {
		        v2[i]=sc.nextInt();
		    }
		    Solution ob = new Solution();
		    //calling the method common_element
		    //and passing ArrayList 1, 2 as arguments
		    //and storing the results in a new ArrayList
		    ArrayList<Integer>ans=ob.common_element(v1, v2);
		    
		    //printing the elements of the new ArrayList
		    for(int i:ans)
		    System.out.print(i+" ");
		    
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        TreeMap<Integer,Integer> tm1 = new TreeMap<Integer,Integer>(); //declaration 
        TreeMap<Integer,Integer> tm2 = new TreeMap<Integer,Integer>();
        //declaration 
        for(int x: v1)
        {
            tm1.put(x,tm1.getOrDefault(x,0)+1);

 

//inserting into first treemap
        }
        
         for(int x: v2)
        {
            tm2.put(x,tm2.getOrDefault(x,0)+1);

//inserting into second treemap
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(Map.Entry<Integer,Integer> e: tm1.entrySet())
        {
            if(tm2.containsKey(e.getKey()))
            {
                int p = e.getValue();
                int q = tm2.get(e.getKey());
                int r = Math.min(p,q);
                while(r>0)
                {
                    arr.add(e.getKey());
                    r--;
                }
                /*Running first treemap and concurrently checking similarity in second treemap and adding elements it to the arraylist*/
            }
        }
        
        
        return arr;
    }
}