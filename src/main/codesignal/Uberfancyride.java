package main.codesignal;

public class Uberfancyride {

    public  String fancyride(int l,double fare[])
    {
        int fareOff =20;
        String s ="";
        String [] s1 = new String[]{"UberX","UberXL","UberPlus","UberBlack","UberSUV"};
        for(int i = fare.length-1;i>=0;i++)
        {
            fare[i] = fare[i]*l;
            if(fare[i]<=fareOff)
            {
                s = s1[i];
                break;
            }
        }
        return s;
    }
}
