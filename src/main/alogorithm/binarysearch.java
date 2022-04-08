package main.alogorithm;

public class binarysearch {

    static  void binarysearch(int a[],int key,int high,int low)
    {
        int mid =0;
        while(low<=high)
        {
            mid = (low + high)/2;
            if(a[mid] == key)
                System.out.println("element found");
            else if(key>a[mid])
                low = mid+1;
            else
                high = mid-1;
        }


    }
    static  int infinitesearch(int a[],int key)
    {
        int low =0;
        int high =1;
        while(a[high]<key)
        {
            low =high;
            high = 2*high;

        }
         binarysearch(a,key,high,low);
         return 1;
    }
}
