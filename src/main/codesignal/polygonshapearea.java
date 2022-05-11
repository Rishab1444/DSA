package main.codesignal;
/*
here the input was given n = 2  and the output was 5

* */
public class polygonshapearea {
    int solution(int n) {

        if(n == 1)
            return 1;
        else
            return n*n+(n-1)*(n-1);

    }

}
