package main.alogorithm;

public class kadane {

    int kadane (int a[],int n)
    {
        int max =0;
        int curr = 0;
        for(int i = 0;i<n;i++)
        {
            curr = curr + a[i];
            if(curr > max)
                max  = curr;
            if(curr < 0)
                curr =0;

        }
        return  max;
    }
//    better then kadane algorithm
    int sumofsubarray(int a[])
    {
        int max =a[0];
        int sum = a[0];
        for(int i  =1;i<a.length;i++)
        {
            max = Math.max(max,max + a[i]);
            sum = Math.max(sum,max);
        }
        return  sum;
    }
}
