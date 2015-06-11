package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marcel on 10/06/15.
 */
public class JavaTraining {

    public static void main (String args[]) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(in);
            String str = input.readLine();
            for (int i = 0; i < Integer.parseInt(str); i++) {
                String str1 = input.readLine();

                try {
                    long myL = Long.parseLong(str1);
// System.out.println("* long");
                    System.out.println(str1 + " can be fitted in ");
                    try {
                        byte myB = Byte.parseByte(str1);
                        System.out.println("* byte");
                    } catch (Exception e) {
                    }
                    try {
                        short myS = Short.parseShort(str1);
                        System.out.println("* short");
                    } catch (Exception e) {
                    }
                    try {
                        int myI = Integer.parseInt(str1);
                        System.out.println("* int");
                    } catch (Exception e) {
                    }
                    System.out.println("* long");
                } catch (Exception e) {
                    System.out.println(str1 + " can't be fitted anywhere.");
                }
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
