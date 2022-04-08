package main;

import main.alogorithm.moore;

import java.util.ArrayList;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {

       /* int v =5;
        int e = 10;

        int a[][] = new int[v+1][v+1];
        ArrayList<ArrayList<Integer>> a1 = new ArrayList<>();
        int i;
        for (i = 0;i<v;i++)
        {
            a1.add(new ArrayList<>());
        }


    }
    void addedge(int a[][],int source,int destination)
    {
        a[source][destination]  = 1;
        a[destination][source] = 1;
    }

    void addedge(ArrayList<ArrayList<Integer>> a1,int source,int destination)
    {
        a1.get(source).add(destination);
        a1.get(destination).add(source);

    }*/
        Scanner s1 = new Scanner(System.in);
     moore a1 =new moore();
    int a[] = new int[10];
    for (int i  = 0;i<5;i++)
    {
        a[i]= s1.nextInt();
    }

        System.out.println(a1.voore(a));
    }


}
