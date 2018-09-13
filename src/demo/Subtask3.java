package demo;

/**
 * Created by DELL on 12.09.2018.
 */
public class Subtask3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a >= b) {
            a = a % b;
        } else {
            b = b % a;
        }

        if (a == 0) System.out.println("NOD:"+b);
        else System.out.println("NOD: "+a);
    }




}
