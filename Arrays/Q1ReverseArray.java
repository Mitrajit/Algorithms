import java.util.Scanner;
public class Q1ReverseArray{
  public static void reverse(int array[]){  //Reverse using loops
    for(int i=0; i<array.length/2; i++){
      int k = array[i];
      array[i] = array[array.length - i - 1];
      array[array.length - i - 1] = k;
    }
  }
  public static void recursiveReverse(int array[],int start, int end){ //Reverse using recursion
    if(start >= end)
      return; //exit function if all array elements
    else{
      int k = array[start];
      array[start++] = array[end];
      array[end--] = k;
      recursiveReverse(array, start, end);      
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = in.nextInt();
    int array[] = new int [n];
    for(int i=0;i<n;i++)
      array[i] = in.nextInt();
    recursiveReverse(array,0, array.length - 1);
    System.out.println("Revered array?");
    for(int i:array){
      System.out.print(i+" ");
    }
    in.close();
    System.out.println();
  }
}