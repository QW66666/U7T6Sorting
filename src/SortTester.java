import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {256, 234, 231, 222, 210, 123, 120, 111, 110, 90, 50, 33, 23, 10, 1, -5, -6};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {256, 234, 231, 222, 210, 123, 120, 111, 110, 90, 50, 33, 23, 10, 1, -5, -6};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
