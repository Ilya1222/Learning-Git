package demo;

/**
 * Created by DELL on 12.09.2018.
 */
public class Subtask3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("NOD: "+a);
    }

}
