package convert;

/**
 * Created by DELL on 06.09.2018.
 */
public class Converter {
    private String [] str;
    private final  int CONSTANT_1 = 64;
    private final int CONSTANT_2 = 26;


    public Converter(String [] str)
    {
        this.str=str;

    }

    private  int AlgorithmForConvertToValue()
    {   int encoding;
        int val;
        int result =0;
        char [] ch = str[0].toCharArray();



            for (int i = 0; i < ch.length; i++) {

                encoding = (int)ch[i];
                val = encoding - CONSTANT_1;
                result = result * CONSTANT_2 + val;
                System.out.println("В массиве char  есть буква: " + val);

            }
            return result;


    }





    public void ConvertToValue(){

         if(str.length>1 || str.length<1) System.out.println("Erorr , Petro you are fool!");
         else {System.out.println("Your value is: " + AlgorithmForConvertToValue());}

    }





}
