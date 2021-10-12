package homework12Clothes;

public class AtelierMain {
    public static void main(String[] args) {
        Clothes menClothes = new Tie(35,"red","Tie",Size.M);
        Clothes womanClothes = new Skirt(40,"blue","Skirt", Size.XS);
        Clothes clothes = new Trousers(75,"white", "Trousers", Size.XXS);
        Clothes clothes1 = new TShirt(30,"mylticolor", "Tshirt", Size.L);
        Clothes[] clothess = {menClothes,womanClothes, clothes, clothes1};


        Atelier atelier = new Atelier();
        atelier.dressMan(clothess);
        atelier.dressWoman(clothess);




            }

            }



