package main.codesignal;

public class productadjarray {

    int solution(int[] inputArray) {

        int p = inputArray[0]*inputArray[1];
        int temp;
        for(int i = 1;i<inputArray.length-1;i++)
        {
            temp  = inputArray[i]*inputArray[i+1];
            if(temp>p)
            {
                p = temp;
            }
        }
        return p;
    }

}
