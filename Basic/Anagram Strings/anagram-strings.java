//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.areAnagram(S1, S2));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int areAnagram(String S1, String S2) {
        if(S1.length()!=S2.length()) return 0;
        if(isAnagram(S1,S2)) return 1;
        return 0;
    }
    static boolean isAnagram(String S1,String S2){
        char[] s1 = S1.toCharArray();
        char[] s2 = S2.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.equals(s1,s2);
    }
}