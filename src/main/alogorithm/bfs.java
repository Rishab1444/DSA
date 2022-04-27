package main.alogorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class bfs {

    boolean bfs (ArrayList<ArrayList<Integer>> a,int dest,int source, int pred[],int v,int dist[])
    {
        Queue<Integer> queue = new LinkedList<>();
        boolean visited []= new boolean[];
        for (int i = 0;i<v;i++)
        {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[0] = true;
        dist[source] =0;
        queue.add(source);
        while (!queue.isEmpty())
        {
            int curr = queue.remove();
            

        }
    }
}
