/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
	    
	    BufferedReader p = new BufferedReader(
	        new InputStreamReader(System.in));
	        int t;
	        t = Integer.parseInt(p.readLine());
	        while (t-- != 0){
	            int n;
	            n = Integer.parseInt(p.readLine());
	            HashMap<String,Integer> hm = new HashMap
	            <String,Integer>();
	            String maxStr="";
	            int maxCount = 0;
	            for(String x:p.readLine().split(" ")){
	                if(hm.containsKey(x)){
	                    Integer temp = hm.get(x);
	                    temp++;
	                    if(maxCount<temp){
	                        maxCount = temp;
	                        maxStr = x;
	                    }
	                    else if(maxCount == temp){
	                        if(maxStr.compareTo(x)>=0){
	                            maxStr = x;
	                        }
	                    }
	                    hm.put(x,temp);
	                }
	                else{
	                    if(maxCount == 1){
	                        if(maxStr.compareTo(x)>=0){
	                            maxStr = x;
	                            maxCount = 1;
	                        }
	                    }
	                    else if(maxCount == 0){
	                        maxCount = 1;
	                        maxStr = x;
	                    }
	                    hm.put(x,1);
	                    
	                }
	            }
	            System.out.println(maxStr);
	        }
	}
}
