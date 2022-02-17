import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int time = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        time++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Run time: "  + time);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int time = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        time++;
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Run time: " + time);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {

  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {    
    /* TO BE IMPLEMENTED IN PART C */
  }
}