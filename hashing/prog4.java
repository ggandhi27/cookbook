import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	 //code
	    BufferedReader p = new BufferedReader(
	 new InputStreamReader(System.in));
	 
        int t;
        t = Integer.parseInt(p.readLine());
        while (t-- != 0){
            int nk[] = new int[2];
            int i,j;
            i = 0;
            for(String x: p.readLine().split(" ")){
                nk[i++] = Integer.parseInt(x);
            }
            i = 0;
            int arr[] = new int[nk[0]];
            int pos[] = new int[nk[0]];
            for(String x: p.readLine().split(" ")){
                arr[i] = Integer.parseInt(x);
                pos[i] = i;
                i++;
            }
            
            for(i=0;i<nk[0];i++){
                for(j=i+1;j<nk[0];j++){
                    if(arr[i]>arr[j]){
                        int tmp;
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        
                        tmp = pos[i];
                        pos[i] = pos[j];
                        pos[j] = tmp;
                    }
                }
            }
            for(i=0;i<nk[1];i++){
                for(j=i+1;j<nk[1];j++){
                    if(pos[i]>pos[j]){
                        int tmp;
                        tmp = pos[i];
                        pos[i] = pos[j];
                        pos[j] = tmp;
                        
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                        
                    }
                }
            }
            
            for(i=0;i<nk[1];i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
	 }
}
