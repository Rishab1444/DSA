package main.codesignal;
import java.util.*;
public class countpairfromtwoarray {

    public  boolean pairs(int a[],int b[],int v)
    {

        HashMap<Integer,Integer> a1 = new HashMap<>();

        for(int i =0;i<a.length;i++)
        {
            a1.put(a[i],0);
        }

        for(int i =0;i<b.length;i++)
        {
            if(a1.containsKey(v-b[i]))
            {
                return true;
            }

        }
        return false;

    }
}
