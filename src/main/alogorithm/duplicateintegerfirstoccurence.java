package main.alogorithm;

import java.util.HashSet;

public class duplicateintegerfirstoccurence {

    int firstduplicate (int a[])
    {
        HashSet<Integer> a1 =new HashSet<>();
        for(int i = 0;i<a.length;i++)
        {
            if(!a1.contains(a[i]))
            {
                a1.add(a[i]);
            }
            else
            {
                return a[i];
            }
        }
        return -1;
    }
}
