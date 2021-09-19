/**
 * D2C question
 * If Alex has to deliver items to all the houses in an 
 * array "houses" with their house index number in it.
 * What will be the minimum distance travelled by Alex
 * given that Alex can start from any house.
*/
import java.util.*;
public class Houseprob{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Integer houses[] = new Integer[n];
    for(int i=0; i<n; i++)
      houses[i]=in.nextInt();
    // finding the difference between the maximum and
    // minimum house index to deliver
    int diff = Collections.max(Arrays.asList(houses))-Collections.min(Arrays.asList(houses));
    System.out.print(diff);
  }
}