package homework15Collections;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

StuffStore stuffStore = new StuffStore();
Map <String, Double> stuff = stuffStore.convertEnumToMap();
stuffStore.printGoods(stuff);
stuffStore.applyDiscountToGoods(stuff);
stuffStore.printGoods(stuff);

    }

}
