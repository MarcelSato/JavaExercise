package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcel on 12/06/15.
 */
public class JavaTest1 {

    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        String T = null;
        int qtyT;
        try {
            T = input.readLine();
            qtyT = Integer.parseInt(T);
            String str;
            for(int i = 0; i < qtyT; i++){
                str = input.readLine();
                String[] range = str.split(" ");
                int A = Integer.parseInt(range[0]);
                int B = Integer.parseInt(range[1]);
                int qty = 0;
                while(A <= B){
                    int ctl = 1;
                    while(ctl <= B) {
                        if (Math.sqrt(A) % ctl == 0) {
                            qty++;
                            break;
                        }
                        ctl++;
                    }
                    A++;
                }
                System.out.println(qty);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


