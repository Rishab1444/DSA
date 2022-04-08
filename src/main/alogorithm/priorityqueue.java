package main.alogorithm;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/*it is based on  heap data structure
* */
public class priorityqueue {
    void priortyqueue() {
        /*for minheap which is default*/
        PriorityQueue<Integer> a = new PriorityQueue<>();
        /*for max heap */
        PriorityQueue<Integer> a1 = new PriorityQueue<>(Collections.reverseOrder());
        a.add(5);
        a.add(12);
        a.add(10);
        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.poll();
        }

    }

    int kthelement(int a[], int k) {
        PriorityQueue<Integer> a1 = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            a1.add(a[i]);
        }
        for (int i = k; i < a.length; i++) {
            if (a1.peek() < a[i]) {
                a1.poll();
                a1.add(a[i]);

            }
        }
        return a1.peek();
    }

    int nropes(int a[]) {
        PriorityQueue<Integer> a1 = new PriorityQueue<>();
        for (int i : a) {
            a1.add(i);

        }
        int ans = 0;
        while (a1.size() < 1) {
            int p = a1.poll();
            int q = a1.poll();
            int sum = p + q;

            ans = ans + sum;
            a1.add(ans);
        }
        return ans;
    }
}
