/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader p = new BufferedReader(
		    new InputStreamReader(System.in));
		    
		    int t;
		    t = Integer.parseInt(p.readLine());
		    while(t-- != 0){
		           int n;
		           n = Integer.parseInt(p.readLine());
		           int arr[] = new int[n];
		           int i,j;
		           i = 0;
		           for(String x:p.readLine().split(" ")){
		               arr[i++] = Integer.parseInt(x);
		           }
		           int s;
		           s = 0;
		           for(i=0;i<n;i++){
		               for(j=i+1;j<n;j++){
		                   if(Math.abs(arr[j]-arr[i])>1){
		                       s = s + (arr[j] - arr[i]);
		                   }
		                   
		               }
		           }
		           System.out.println(s);
		    }
	}
}
