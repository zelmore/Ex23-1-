// Ex23-1 
// Zachary Elmore
// 12/5/16
// Uses the bubble sort method to sort a list of numbers

import java.util.Comparator;

public class BubbleSort {

	/** Bubble sort method using the comparable interface*/
	public static <E extends Comparable<E>> void bubbleSort(E[] list){
	    boolean needNextPass = true;
	    
	    for (int k = 1; k < list.length && needNextPass; k++) {
	      // Array may be sorted and next pass not needed
	      needNextPass = false;
	      for (int i = 0; i < list.length - k; i++) {
	        if (list[i].compareTo(list[i + 1]) > 0){
	          // Swap list[i] with list[i + 1]
	          E temp = list[i];
	          list[i] = list[i + 1];
	          list[i + 1] = temp;
	          
	          needNextPass = true; // Next pass still needed
	        }
	      }
	    }
	  }
	
	/** Bubble sort method using the comparator interface*/
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
	    boolean needNextPass = true;
	    
	    for (int k = 1; k < list.length && needNextPass; k++) {
	      // Array may be sorted and next pass not needed
	      needNextPass = false;
	      for (int i = 0; i < list.length - k; i++) {
	        if (comparator.compare(list[i], list[i + 1]) > 0){
	          // Swap list[i] with list[i + 1]
	          E temp = list[i];
	          list[i] = list[i + 1];
	          list[i + 1] = temp;
	          
	          needNextPass = true; // Next pass still needed
	        }
	      }
	    }
	  }

	  /** A test method */
	  public static void main(String[] args) {
	    Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12}; //array of numbers
	    System.out.print("Original List: ");
	    for (int i = 0; i < list.length; i++)// prints out each number in the list
		  System.out.print(list[i] + " ");
	    bubbleSort(list);// sorts the numbers
	    System.out.print("\nSorted List: ");
	    for (int i = 0; i < list.length; i++)// prints out each number in the sorted list
	      System.out.print(list[i] + " ");
	  }
}

