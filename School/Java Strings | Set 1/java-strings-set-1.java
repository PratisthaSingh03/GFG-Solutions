//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.conRevstr(S1, S2));
        }
    }
}

// } Driver Code Ends


// User function template for Java
class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        
        for(int i = S1.length()-1;i >= 0 ; i--)
        {
            a.append(S1.charAt(i));
        }
        for(int i = S2.length()-1;i >= 0 ; i--)
        {
            b.append(S2.charAt(i));
        }
        
        return (b.append(a)).toString();
    }
}