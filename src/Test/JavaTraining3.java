package Test;

/**
 * Created by Marcel on 11/06/15.
 */
public class JavaTraining3 {

    public static void main(String args[]) {

        int arr[] = {1, 3, 5, 7, 11};
        int difference[] = new int[arr.length - 1];
        int missingTerm;
        for (int i = 1; i < arr.length; i++) {
            difference[i - 1] = arr[i] - arr[i - 1];
        }
        for (int j = 0; j < arr.length - 1; j++) {

            if (difference[j] != difference[j + 1]) {
                missingTerm = arr[j] + difference[j + 1];
                System.out.println("The missing term is: " + missingTerm);
                break;
            }
        }
        for (int j = 0; j < arr.length -1; j++){
            System.out.println("Arr " + arr[j]);
            System.out.println("Diff " + difference[j]);
        }
    }
}
