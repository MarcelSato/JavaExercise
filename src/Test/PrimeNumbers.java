package Test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcel on 11/06/15.
 */

public class PrimeNumbers {

    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        int n = 0;
        int testNum = 3;
        int control = 1;
        String N;
        try {
            N = input.readLine();
            n = Integer.parseInt(N);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(n >= 1){
            System.out.println(2);
        }
        for(int i = 2; i < n; i++){

            for(int j = 2; j <= Math.sqrt(testNum); j++){
                if(testNum % j == 0) {
//                    System.out.println(testNum / j + " " + Math.sqrt(testNum));
                    control = 0;
                }
            }
            if(control != 0){
                System.out.println(testNum);
            }

            control = 1;
            testNum++;
        }
    }
}
