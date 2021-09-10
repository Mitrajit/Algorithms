import java.util.Scanner;

class Q5NegPos { // Not stable order is different
    public static void segregate(int a[]){ 
        int starting = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0 ){
                if(i!=starting){
                    int k = a[i];
                    a[i] = a[starting];
                    a[starting] = k;
                }
                starting++;
            }
        }
        print(a);
    }
    public static void segregatepointer(int a[]){
        int low=0,high=a.length-1;
        while(low<=high){
            if(a[low]>0 && a[high]<0)
                swap(a,low++,high--);
            if(a[low]<0)
                low++;
            if(a[high]>0)
               high--;
        }
        print(a);
    }
    public static void swap(int a[], int i, int j){
        int k = a[i];
        a[i] = a[j];
        a[j] = k; 
    }
    public static void print(int a[]){
        for(int i: a)
        System.out.print(i+" ");
    }
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++)
		a[i] = in.nextInt();
		segregate(a);
    System.out.println();
    segregatepointer(a);
	}
}