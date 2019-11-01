
package dslab1;

public class Merge_sort {
    
    Merge_sort(int arr[],int length )
    {
       
    }
    
    void merging(int arr[] , int start , int middle , int end  )
    {
        int N1=middle-start+1; //to include the middle
        int N2=end-middle;
        int subarr1[]=new int [N1];
        int subarr2[]=new int [N2];
        for (int i = 0 ; i<N1; i++)
        {
            subarr1[i]=arr[start+i];
        }
        for (int k = 0 ; k<N2; k++)
        {
            subarr2[k]=arr[middle+1+k];//do the other half 
        }
        int i =0;
        int k=0;
        int j=0;
        while (i<N1 && k<N2)
        {
            if (subarr1[i]<subarr2[k])
            {
                arr[j]=subarr1[i];
                i++;
                j++;
            }
            else if (subarr1[i]>subarr2[k])
            {
                arr[j]=subarr2[k];
                k++;
                j++;
            }
            else if (subarr1[i]==subarr2[k])
            {
                arr[j]=subarr1[i];
                i++;
                j++;
                arr[j]=subarr2[k];
                k++;
                j++;
            }
        }
            if (i!=((subarr1.length)-1))
            {
                while(i<N1)
                {
                    arr[j]=subarr1[i];
                    i++;
                    j++;
                }
            }
             if (k!=((subarr2.length)-1))
            {
                while(k<N2)
                {
                    arr[j]=subarr2[k];
                    k++;
                    j++;
                }
            }
        
       
                     
    }
     
    void split(int arr[], int start, int end ) 
    { 
        if (start==end)
        {
            return;
        }
        else
        { 
            int middle = (start+end)/2; 
            split(arr, start , middle ); 
            split(arr , middle+1, end  ); 
            merging(arr,start ,middle, end ); 
        } 
    }
}
