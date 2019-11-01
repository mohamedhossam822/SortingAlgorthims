package dslab1;

import java.util.Scanner;

public class DSlab1 {

    public static void main(String[] args) 
        {
            System.out.println("enter the length of array ");
            Scanner input = new Scanner(System.in);
            int length = input.nextInt();
            int arr[]=new int[length];
            System.out.println("enter the elements ");
            
            for(int i=0;i<length;i++)
            {
                arr[i]= input.nextInt();
            }
            
            System.out.println("select the sorting tech.");
            System.out.println("1-Heap");
            System.out.println("2-Selection sort");
            System.out.println("3-Insertion sort");
            System.out.println("4-Merge sort");
            System.out.println("5-Quick sort");
            System.out.println("6-Bubble sort");
            int option= input.nextInt();
            NormalSort normalSort=new NormalSort(arr,length);
            Heap_sort heap = new Heap_sort(arr,length );
            Merge_sort merge=new Merge_sort(arr,length );
            switch (option)
            {
                /*case 1 :
                    
                     heap.build_max_Heapfiy(arr,length );
                     break; */
                     
                case 2 :
                     normalSort.Selection_sort(arr, length);
                     break; 
                     
               /* case 3 :
                         normalSort.Insertion_sort(arr, length);
                     break; 
                     */
                case 4 :
                     merge.split(arr, 0, length-1);
                     break; 
                     
              /*  case 5 :
                     
                     break; 
                     
                case 6 :
                     Heap_sort heap = new Heap_sort(arr,length );
                     heap.build_max_Heapfiy(arr,length );
                     break; 
*/
            }
         for(int i=0;i<length;i++)
            {
              System.out.println(arr[i]);
            }
                   

                    
        }
    
}
