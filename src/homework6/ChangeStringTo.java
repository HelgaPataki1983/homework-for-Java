package homework6;
//Write a method which takes a String and changes all digits within this string into *

import static java.lang.String.valueOf;

public class ChangeStringTo {
    public static void main(String[] args) {
        String convert = "56465  46546454476" ;
        System.out.println(Convert(convert));

    }
    public static String Convert (String convert){
        //char a = '*';
        String result = "";
        for (int i = 0; i < convert.length(); i ++){

            if(Character.isDigit(convert.charAt(i)))
            result += "*";
            else {
                result += convert.charAt(i);
            }

        }
        return result;// if (!Character.isDigit(charArray[i])) нашла вот такую проверку, но не знаю как применить
    }
    }

