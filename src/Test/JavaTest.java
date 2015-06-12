package Test;

/**
 * Created by Marcel on 12/06/15.
 */
public class JavaTest {
    public static void main(String[] args) {
        int[] a ={1};
        JavaTest t = new JavaTest();
        t.increment(a);
        System.out.println(a[a.length -1]);
        System.out.println(a[0]);
    }
    void increment(int[] i){
        i[i.length -1] ++;
    }
}
