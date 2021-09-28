package homework9;

import static java.lang.Math.random;

public class Ghost {
    private String color;

    public Ghost(){
        String[] color = new String[]{"white", "yellow", "red"};
        int i = (int)(random() * color.length);
        this.color = color[i];

    }
    /*public String[] randomColor(String color){
        for (int i = 0; i < color.length(); i++) {
            color[i] = (int) (random() * 20 + 1);
        }
        return color[i];*/



    public String getColor() {
        return color;
    }
}


