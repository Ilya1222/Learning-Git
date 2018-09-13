package demo;

/**
 * Created by DELL on 12.09.2018.
 */
public class Subtask4 {

    public static void main(String[] args) {
        int a,b,c;
        String string=args[0];
        String s1;
        String s2;
        String s3;
        s1 = string.substring(0,1);
        s2=string.substring(1,2);
        s3=string.substring(2,3);
        a=Integer.parseInt(s1);
        b=Integer.parseInt(s2);
        c=Integer.parseInt(s3);
        a=a+b+c;
        System.out.println("Amount of: "+string+"=>>"+a);



    }


}
