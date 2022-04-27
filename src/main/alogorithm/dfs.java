package main.alogorithm;

import java.util.ArrayList;

public class dfs {

    public ArrayList dfsofGraph (int vertex, ArrayList<ArrayList<Integer>> a)
    {
        boolean[] v = new boolean[vertex];
        ArrayList<Integer> p =new ArrayList<>();
        for (int i = 0;i<vertex;i++)
        {
            if(!v[i]) {
                dfs1(i, a, p, v);
            }
        }
        return p;
    }

    private void dfs1(int i, ArrayList<ArrayList<Integer>> a, ArrayList<Integer> p, boolean[] v) {

            v[i] = true;
            p.add(i);
            for (Integer neigbhour :a.get(i))
            {
                if (!v[neigbhour])
                {
                    dfs1(neigbhour,a,p,v);
                }
            }

    }
}
