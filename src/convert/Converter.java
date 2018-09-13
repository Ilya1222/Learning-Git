package convert;

/**
 * Created by DELL on 06.09.2018.
 */
public class Converter {
    private String[] str;
    private String number_next_value;
    private int length;
    private final int CONSTANT_1 = 64;
    private final int CONSTANT_2 = 26;

    public Converter(String number)
    {number_next_value=number;
    }

    public Converter(String[] str, int length) {
        this.str = str;
        this.length = length;
    }


    private int[] algorithmForConvertToValue() {
        int[] values = new int[length];
        for (int id = 0; id < str.length; id++) {
            int encoding;
            int value;
            int result = 0;
            char[] ch = str[id].toCharArray();
            for (int i = 0; i < ch.length; i++) {

                encoding = (int) ch[i];
                value = encoding - CONSTANT_1;
                result = result * CONSTANT_2 + value;

            }
            values[id] = values[id] + result;
        }

        return values;
    }


    private String[] algorithmForConvertToSymbol() {
        String [] strings = new String[length];
        int[] counter = algorithmForConvertToValue();
        for (int i = 0; i < counter.length; i++) {
            int number = counter[i];
            int final_container, start_container, difference, count;
            int solution = 0;
            char symbol;
            String count2 = "";
            do {
                start_container = number;
                number = number / 26;
                final_container = number;
                count = final_container * 26;
                difference = start_container - count;
                if (difference == 0) {
                    solution = 26 + CONSTANT_1;
                    number = number - 1;
                } else if (difference > 0) solution = difference + CONSTANT_1;
                symbol = (char) solution;
                String s = String.valueOf(symbol);
                count2 += s;
            } while (number > 0);
            String resault = new StringBuffer(count2).reverse().toString();
            strings[i]=resault;
        }
        return strings;
    }


       private String algorithmToNextValue()
       {   int number =Integer.parseInt(number_next_value);
           number+=1;
           int final_container, start_container, difference, count;
           int solution = 0;
           char symbol;
           String count2 = "";
           //char string;
           do {
               start_container = number;
               number = number / 26;
               final_container = number;
               count = final_container * 26;
               difference = start_container - count;
               if (difference == 0) {
                   solution = 26 + CONSTANT_1;
                   number = number - 1;
               } else if (difference > 0) solution = difference + CONSTANT_1;
               symbol = (char) solution;
               String s = String.valueOf(symbol);
               count2 += s;
           }
           while (number > 0);
           String result = new StringBuffer(count2).reverse().toString();
          return result;
       }






    public void printConvert(){
        int [] r =algorithmForConvertToValue();
        String [] s=algorithmForConvertToSymbol();
        for(int i =0;i<length;i++)
        {
            System.out.println(str[i]+"==>"+r[i]+"==>>"+s[i]);
        }

    }

    public void printNextValue()
    {System.out.println("-----------------------------------------------------------------------");
        System.out.println( "Next symbol of value:"+ number_next_value +"=>>"+algorithmToNextValue());
    }
}
