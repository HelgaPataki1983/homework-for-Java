package homework15Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class StuffStore {
    private double seasonalDiscount;

    public double getSeasonalDiscount() {
        return seasonalDiscount;
    }

    public Map<String,Double> stuffShop = new HashMap<>();
    public Map convertEnumToMap(){
        for (Stuff stuff: Stuff.values()){
            stuffShop.put(stuff.getName(), stuff.getPrice());
        }
        return stuffShop;
   }

    public void printGoods(Map<String,Double>stuffShop){ //непонятен синтаксис в этом цикле, не могла б ты обьянить?
        Iterator it = stuffShop.entrySet().iterator();   // или можно итератор по другому использовать как -то?
        while (it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("Price of item " + pair.getKey() + " is " + pair.getValue() + " UAH");
        }
    }
    public Map <String,Double> applyDiscountToGoods(Map<String, Double>stuffShop){
        for (Map.Entry <String, Double> entry: stuffShop.entrySet()) {
            entry.setValue(entry.getValue()- seasonalDiscount);

        }
    return stuffShop;
    }
}

/*
for(Map.Entry<String, Double> entry : yourMapName.entrySet()) {
        тут делаешь что тебе нужно с ключом и значением
        entry.getKey() ->  вернет ключ
        entry.getValue() -> вернет значение
*/
