package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel on 11/06/15.
 */
public class JavaTraining2 {

    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        String N = null;
        try {
            N = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String AP = null;
        try {
            AP = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] APList = AP.split(" ");
        int strControl= APList.length;
        List<Integer> intList = new ArrayList<Integer>();
        while (strControl>= 1) {
            intList.add(Integer.parseInt(APList[strControl-1]));
            strControl--;
            }
        int intControl = 0;
        System.out.println("IntList size - " + intList.size() + "\n");
        List<Integer> diff = new ArrayList<Integer>();
        while (intControl+2 <= intList.size()) {
            System.out.println(intList.get(intControl));
            System.out.println(intList.get(intControl) - intList.get(intControl + 1));
            diff.add(intList.get(intControl) - intList.get(intControl + 1));
            intControl++;
        }
        System.out.println(diff.toString());

        int diffControl = 0;
        while(diffControl+2 <= diff.size()){
            System.out.println(diff.get(diffControl) + " - " + diff.get(diffControl + 1));
            if(diff.get(diffControl) != diff.get(diffControl + 1)){
                int missing = intList.get(diffControl) - diff.get(diffControl+1);
                System.out.println(missing);
                break;
            }
            diffControl++;
        }
    }

}
