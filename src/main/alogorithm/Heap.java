package main.alogorithm;
/*
This is a Max heap operation
node = i
parent node= i/2
left node = 2 *i
right node = 2*i+1;
heap property is that a tree should be complete binary tree
* */
public class Heap {
    void insertion(int a[],int n,int k)
    {
        n = n+1;
        a[n] = k;
        int i = n;
        while (i>1)
        {
            int parent  = i/2;
            if(a[parent] <a[i]) /* a[parent] > a[i]*/
            {
                swap(a,parent,i);
                i =parent;
            }
            else
            {
                return;
            }

        }
    }

    private void swap(int[] a, int i, int i1) {
         int temp =a[i];
         a[i] = a[i1];
         a[i1] = temp;
    }
    void deletion(int a[],int n,int k)
    {
        a[1] = k;
        n =n-1;
        int i =1;
        while(i<n)
        {
            int l = a[2*i];
            int r = a[2*i+1];
            int larger = l > r ?2*i :2*i+1;
            if(a[larger]>a[i])
            {
                swap(a,larger,i);
                i = larger;
            }
            else
            {
                return;
            }
        }
    }
    void heapsort(int a[],int n)
    {
        for(int i = n;i>1;i--)
        {
            swap(a,1,i);
            heapify(a,i-1,1);
        }
    }
    /*
    Heapify make the algorithm in O(n) from O(nlogn)
    heapify take a node an array and built a tree underneath
     */

    void heapify(int a[],int n,int i)
    {
        int largest = i;
        int l = 2*i;
        int r = 2*i+1;
        if(l<=n && a[largest]<a[l])
            largest =l;
        if(r<=n && a[largest] < a[r])
            largest = r;
        if (largest!=i)
            swap(a,largest,i);
            heapify(a,n,largest);
    }

}
