package main.alogorithm;

import java.util.HashSet;
import java.util.Set;

public class countdistinct {

    int size (int a[])
    {
        Set<Integer> set = new HashSet<>();
        for (int i : a)
        {
            set.add(i);
        }
        return set.size();
    }
    int unionset(int a[],int b[])
    {
        Set<Integer>set = new HashSet<>();
        for(int i :a)
        {
            set.add(i);
        }
        for (int j :b)
        {
            set.add(j);
        }

        return set.size();
    }
    int intersection(int a[],int b[])
    {
        Set<Integer> set = new HashSet<>();
     /*   Set<Integer> set1 =new HashSet<>();*/
        int c = 0;
        for(int i:a)
        {
            set.add(i);
        }
        for (int i :b)
        {
            if(set.contains(i))
          /*      set1.add(i);*/
                c++;
                set.remove(i);
        }
        return c;
    }
}
