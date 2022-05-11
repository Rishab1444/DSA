package main.codesignal;

/*
For statues = [6, 2, 3, 8], the output should be
solution(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
* */

import java.util.Arrays;

public class makeArrayconsecutive2 {
    int solution(int[] statues) {

        Arrays.sort(statues);
        int  l = statues.length;
        int n = statues[l-1] - statues[0];
        return n - l+1;

    }

}
