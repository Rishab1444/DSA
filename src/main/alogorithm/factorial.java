package main.alogorithm;
import  java.util.ArrayList;
public class factorial {
    static ArrayList<Integer> factorial(int N){
        //code here
        int k;
        ArrayList<Integer> a  =new ArrayList<Integer>();
        if(N == 0)
        {
            a.add(1);
        }
        else
        {
             N * factorial(N-1);
            a.add(k);}
        return a;
    }
}
