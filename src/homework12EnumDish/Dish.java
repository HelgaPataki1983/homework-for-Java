
package homework12EnumDish;

public enum Dish {
    GOLUBCI(50, 2, "golubci") {
        @Override
        String ingredients() {
            return "cabbage, meat, rice, cream";
        }
    },
    OKROSHKA(25, 1, "okroshka") {
        String ingredients() {
            return "potato, meat, egg, cucumber,yogurt";
        }
    },
    GALUSHKI(25, 1, "galushki") {
        @Override
        String ingredients() {
            return "flour, water, solt";
        }
    },
    DERUNY_S_GRYBY(30, 1, "deruny") {
        @Override
        String ingredients() {
            return "potato, egg, onions, flour, milk, mushrooms, cream";
        }
    },
    VARENUKU_S_KARTOPLA(50, 2, "varenuku") {
        @Override
        String ingredients() {
            return "flour, meat, rice, cream, potato, onion,cream";
        }
    },
    BLINY_S_TVOROGOM(30, 1, "bliny_s_tvorogom") {
        @Override
        String ingredients() {
            return "flour, egg, milk, tvorog, cream";
        }
    },
    ZAPEKANKA(50, 2, "zapekanka") {
        @Override
        String ingredients() {
            return " flour, egg, milk, tvorog, cream";
        }
    },
    MOROZIVO(25, 1, "morozivo") {
        @Override
        String ingredients() {
            return "milk, cream, vanilla";
        }
    },
    DRY_WHITE_WINE(25,1,"dry_white_wine"){
        @Override
        String ingredients() {
            return "Alcohol";

        }
    },
    DRY_RED_WINE(25,1,"dry_red_wine"){
        @Override
        String ingredients() {
            return "Alcohol";

        }
    },
    GORILKA(20,1,"gorilka"){
        @Override
        String ingredients() {
            return "Alcohol";

        }
    };

    private String name;
    private int price;
    private int preparationTime;
    private String category;



    Dish(int price, int preparationTime, String name) {
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    abstract String ingredients();


    public String getCategory(String category) {
        if (category == null) {
            this.category = "Main Dish";
        } else {
            this.category = category;
        }
        return this.category;
    }

    public void print(String text) {
        System.out.println(text);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

}
