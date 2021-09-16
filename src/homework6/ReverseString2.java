package homework6;
//Write method which takes a String of multiple words, and reverses the order
        //of the words (not the whole String!), eg “Hello world” -> “world Hello”

public class ReverseString2 {
    public static void main(String[] args) {
        String toReverse = "I have to be a good AQA" ;
        System.out.println(reverseString1(toReverse));
           }
    public static String reverseString1(String toReverse) {

        String[] myStringArray = toReverse.split(" ");
        System.out.println(myStringArray);

        String result = new String();
               for (int i = myStringArray.length - 1; i >= 0; i --) {
            result += myStringArray[i] + " ";
        }
        return result ;
         }

}



