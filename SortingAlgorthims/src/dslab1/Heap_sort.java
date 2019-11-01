
package dslab1;

/**
 *
 * @author user
 */
public class Heap_sort  {
    public int parent ;
    public int left_child ; 
    public int right_child;
    
    Heap_sort(int arr[],int size)
    {
       int temp;
       build_max_Heapfiy(arr,size);
       while(size!=0)
       {
           size--;
           temp=arr[size];
           arr[size]=arr[0];
           arr[0]=temp;
           heapify(arr,0,size);
       }
    }
    
    private void build_max_Heapfiy(int arr[],int size)
    {
        for(int i=size/2;i>=0;i--)
        {
            heapify(arr,i,size);
        }
        
    }
    
    private void heapify(int arr[], int index , int size )
    {
        int largest =index;
        parent=index;
        left_child=(2*index)+1;
        right_child=(2*index)+2;
        int temp;
        if (left_child<size && arr[parent]<arr[left_child])
        {
            temp=arr[left_child];
            arr[left_child]=arr[parent];
            largest=left_child;
            arr[parent]=temp;
        }
        if (right_child<size && arr[parent]<arr[right_child] )
        {
          temp=arr[right_child];
          arr[right_child]=arr[parent];
          largest=right_child;
          arr[parent]=temp;
        }
        if(arr[largest]!=arr[parent])
        {
       heapify(arr,largest,size);
        }
        
       
    }
                
    }

