// FInding Minimum and maximum in an array using least number of comparison
import java.util.Scanner;
public class Q2MiniMax{
  public static void linear(int array[]){ // Worst case comparison 2(N-1)
    int min=array[0], max=array[0];
    for(int i= 1; i<array.length; i++){
      if(min>array[i])
      min=array[i];
      else if(max<array[i])
      max=array[i];
    }
    System.out.println("Min: "+min+" Max: "+max);
  }
  static class Minimax{ // nested class to store the minimum and maximum
    int min;
    int max;
  }
  public static Minimax tournament(int array[], int start, int end){ // Using Divide and conquer number of comparison is reduced to 3n/2-2
    Minimax mm = new Minimax();
    if(start == end){
      mm.max = array[start];
      mm.min = array[start];
      return mm;
    }
    if (start==end-1) {
      if(array[start]>array[end]){
        mm.max = array[start];
        mm.min = array[end];
      }
      else{
        mm.max = array[end];
        mm.min = array[start];
      }
      return mm;
    }
    Minimax mml = tournament(array, start, (start+end)/2);
    Minimax mmr = tournament(array, (start+end)/2+1, end);
    if(mml.min<mmr.min)
      mm.min = mml.min;
    else
      mm.min = mmr.min;
    if(mml.max>mmr.max)
      mm.max = mml.max;
    else
      mm.max = mmr.max;
    return mm;
  }
  public static void pairMinimax(int array[]){ // From each pair extract the min/max and compare with the global min/max and replace it. Number of comparions if n is even 3(n-1)/2 for odd 3*(n-1)/2 
    int max, min, i;
    if(array.length%2 == 1){  
      max = array[0];
      min = array[0];
      i=1;
    }
    else {
      if(array[0]>array[1]){
        min = array[1];
        max = array[0];
      }
      else{
        min = array[0];
        max = array[1];
      }
      i=2;
    }
    for(; i<array.length-1; i+=2){
      if(array[i]<array[i+1]){
        if(array[i]<min){
          min=array[i]; }
        else if(max<array[i+1]){
          max=array[i+1];
        }
      }
      else{
        if(array[i+1]<min){
          min=array[i+1]; }
        else if(max<array[i]){
          max=array[i];
        }
      }
    }
    System.out.println("Min: "+min+" Max: "+max);
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n = in.nextInt();
    int array[] = new int[n];
    for(int i = 0; i<n; i++){
      array[i] = in.nextInt();
    }
    // Lineaar search method
    linear(array);
    // divide and conquer
    Minimax mm = tournament(array, 0, array.length-1);    
    System.out.println("Min: "+mm.min+" Max: "+mm.max);
    // Compare in Pairs
    pairMinimax(array);
  }
} 