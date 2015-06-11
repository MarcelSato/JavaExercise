package Test;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcel on 10/06/15.
 */
public class JavaTraining1 {

    public static void main (String args[]) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(in);
            String aStr = input.readLine();
            int t = Integer.parseInt(aStr);
            for (int i = 0; i < t; i++) {
                String bStr = input.readLine();
                String[] test = bStr.split(" ");
                int a = Integer.parseInt(test[0]);
                int b = Integer.parseInt(test[1]);
                int n = Integer.parseInt(test[2]);

                System.out.println(a);
                System.out.println(b);
                System.out.println(n);

                if(0 <= a && b <= 50 && 1 <= n && n <= 15){

                }

            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}

