/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		BufferedReader p = new BufferedReader(
		    new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(p.readLine());
		while(t-- != 0){
		    int n;
		    n = Integer.parseInt(p.readLine());
		    HashMap<String,Integer> hm = new HashMap
		    <String,Integer>();
		    
		    for(String x:p.readLine().split(" ")){
		        if(x.equals("END")){
		            for(String key: hm.keySet()){
		                hm.put(key,0);
		            }
		        }
		        else{
		            int tmp;
		            if(hm.containsKey(x)){
		               tmp = hm.get(x);
		               tmp = (tmp+1)%2;
		               hm.put(x,tmp);
		            }
		            
		            else{
		                hm.put(x,1);
		            }
		        }
		    }
		    int count;
		    count = 0;
		    for(String key: hm.keySet()){
		        if(hm.get(key) == 1){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
