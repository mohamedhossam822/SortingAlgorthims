
package dslab1;


public class NormalSort {
    
    NormalSort(int arr[],int length)
    {
       

        
    }
    void insertion_sort (int arr[], int size)
    {
        
        for (int i=0 ; i<size ; i++)
        {
        int current=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>current)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;   //arr[0]
        }
       
    }
    
    void Selection_sort (int arr[], int size)
    {
  
      int temp;
     
        for (int i =0; i<size ; i++)     // 6 5 9 1 0      56910
        {
            int smallest = i;
            
            for (int j=i+1; j<size; j++)
            {
                 if (arr[j]<arr[smallest])
            {
                smallest=j;
             }
                 
            
            }
            temp=arr[i];
            arr[i]=arr[smallest];
           arr[smallest]=temp;
           
                
        }
    }
}