package main.alogorithm;

import java.util.ArrayList;

public class directed {

    public boolean dfs11(int v,ArrayList <ArrayList<Integer>> adj,ArrayList<Integer> ans ,boolean vis [])
    {
        vis[v] = true;

        for (Integer neigbhour : adj.get(v))
        {
            if (!vis[neigbhour])
            {
                if (dfs11(neigbhour,adj,vis,v)
            }
        }
    }
}
