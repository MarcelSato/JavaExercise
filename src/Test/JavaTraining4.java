package Test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcel on 11/06/15.
 */

public class JavaTraining4 {

    public static void main(String args[]){

        InputStreamReader in  = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        String N = null;
        int control = 1;
        int num = 3;
        int n = 0;
        try {
            N = input.readLine();
            n = Integer.parseInt(N);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(n >= 1){
            System.out.println(2);
        }

        for(int i = 2; i <= n; i++){
            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num % j == 0){
                    control = 0;
                }
            }
            if(control != 0){
                System.out.println(num);
            }
            control = 1;
            num++;
        }

    }

}
