package main.alogorithm;

public class suminRange {
    public  int range(int a[],int [][]b,int v)
    {
        int c =(int) 1e9 +7;
        int a1[] = new int[a.length+1];
        for (int i = 0;i<a.length;i++) {
            a1[i + 1] = a1[i] + a[i];
        }
        long s =0;
        for (int i =0;i<b.length;i++)
        {
            s += a1[b[i][1] - b[i][0]];
            s = (s +c)%c;
        }
        return (int) ((s+c)%c);

    }
}
