package demo;

/**
 * Created by DELL on 12.09.2018.
 */
public class Subtask2 {
    public static void main(String[] args) {
        int count =args.length;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(count==2) {
            a=a+b;
            System.out.println("Amount: "+a);
        } else System.out.println("Petro you are full");

    }
}
