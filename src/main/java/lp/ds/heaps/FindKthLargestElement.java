package lp.ds.heaps;

import java.util.List;

public class FindKthLargestElement {
  public static void main(String[] args){
    //
    List<Integer> list = List.of(2,7,3,9,1);
    int k =2;
    System.out.println(findKthLargestElement(list,k));
  }
  
  public static  int findKthLargestElement(List<Integer> list, int k){
    
    //base case
    if(list==null || list.size()<k){
      System.out.println("Invalid Inputs: "+k);
      return 0;
      }
    
    
    
    return 0;
  }
}
