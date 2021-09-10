// { Driver Code Starts
//Initial template for Java

import java.io.*;

public class Q4Sort012 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

 // } Driver Code Ends
//User function template for Java

class Solution
{   
    public static void swap(int a[], int i, int j){
        int k = a[i];
        a[i] = a[j];
        a[j] = k; 
    }
    public static void sort012(int a[], int n)
    {
        int low=0, hig=n-1;
        for(int i=0;i<=hig;){
            if(a[i]==0){
                swap(a,i,low++);
            }
            else if(a[i]==2){
                swap(a,i,hig--);
                if(a[i]==2 || a[i]==0)
                continue;
            }
            i++;
        }
    }
}

// { Driver Code Starts.
