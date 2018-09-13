package demo;

import convert.Converter;

/**
 * Created by DELL on 11.09.2018.
 */
public class Subtask5 {
    public static void main(String[] args) {
        Converter converter = new Converter(args,args.length); //Создаём объект класса Converter
        converter.printConvert(); // используем метод превода в значение
        Converter converter1 = new Converter("26");
        converter1.printNextValue();
    }
}
