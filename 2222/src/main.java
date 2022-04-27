import java.util.*;

public class main {
    public static void main(String[] args) {
        int transaction [] = new int[100];


        }
        static void transact(int a[],int n)
        {
            PriorityQueue<Integer> q1 = new PriorityQueue<>();
            for(int i :a)
            {
                q1.add(i);
                q1.add(0);

            }
            for(int i =0;i<q1.size();i++)
            {
                int l = q1.poll();
                int r = q1.poll();
                int sum = 0;
                sum = l+r;
                ans = ans + sum;
                q1.add
            }
        }
    }

