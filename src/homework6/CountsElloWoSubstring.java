package homework6;
/*Write a method that counts how many times a substring occurs within a string, eg String example = “Hello world, hello Java, hello homework”
        String substring = “ello” -> 3
        String substring = “wo” -> 2*/
public class CountsElloWoSubstring {
    public static void main(String[] args) {
        String initial = "Hello world, hello java, hello homework";
        String substring = "ello";
        System.out.println(countNumberOfElloWo(initial, substring));

    }
        public static int countNumberOfElloWo(String a, String substring){
            int result = 0;
            int shift  = 0;
            while ((shift  = a.indexOf(substring))>=0) {
                result++;
                a = a.substring(shift+1);


            }
                return result;

            /*for (int i = 0; i < a.length(); i ++) {
                int first = a.indexOf("ello");8?*/
            }


        }





