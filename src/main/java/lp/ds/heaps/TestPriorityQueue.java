package lp.ds.heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class TestPriorityQueue {
  
  public static void main(String[] args) {
    PriorityQueue<Integer> maxHeapPriorityQueue = new PriorityQueue<>();
    PriorityQueue<Integer> minHeapPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    int nums[] = {1, 23, 12, 9, 30, 2, 50};
    int k = 3;// 3th largest, 3th smallest
    System.out.println(Arrays.toString(nums));
    for (int n : nums) {
      maxHeapPriorityQueue.offer(n);
      minHeapPriorityQueue.offer(n);
      
      if (maxHeapPriorityQueue.size() > k) {
        maxHeapPriorityQueue.poll();
        minHeapPriorityQueue.poll();
      }
    }
    System.out.format("%dth largest element is %d  ", k, maxHeapPriorityQueue.peek());
    System.out.format("%n%dth smallest element is at %d", k, minHeapPriorityQueue.peek());

//    System.out.println(priorityQueue);
//    System.out.println(priorityQueue.peek());
//    System.out.println(priorityQueue.poll());
//    System.out.println(priorityQueue.peek());
//    priorityQueue.offer(10);
//    priorityQueue.poll();
//    priorityQueue.peek();
//    priorityQueue.size();
//    priorityQueue.add(20);
//    priorityQueue.clear();
//
  }
}
