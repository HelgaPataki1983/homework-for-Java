
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
        String f = "flour, water, solt";
        @Override
        String ingredients() {
            return f;
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

        @Override
        public String getCategory() {
            return "Desert";
        }
    },
    ZAPEKANKA(50, 2, "zapekanka") {
        @Override
        String ingredients() {
            return " flour, egg, milk, tvorog, cream";
        }

        @Override
        public String getCategory() {
            return "Desert";
        }
    },
    MOROZIVO(25, 1, "morozivo") {
        @Override
        String ingredients() {
            return "milk, cream, vanilla";
        }

        @Override
        public String getCategory() {
            return "Desert";
        }
    },
    DRY_WHITE_WINE(25,1,"dry_white_wine"){
        @Override
        public String getCategory() {
            return "Alcohol";
        }

        @Override
        String ingredients() {
            return "Alcohol";

        }
    },
    DRY_RED_WINE(25,1,"dry_red_wine"){
        @Override
        public String getCategory() {
            return "Alcohol";
        }

        @Override
        String ingredients() {
            return "Alcohol";

        }
    },
    GORILKA(20,1,"gorilka"){
        @Override
        public String getCategory() {
            return "Alcohol";
        }

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

    public String getCategory() {
        return "Main dish";
    }
}
