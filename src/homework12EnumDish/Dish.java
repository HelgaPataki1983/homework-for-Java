
package homework12EnumDish;

public enum Dish {
    GOLUBCI(50, 2, "golubci") {
        String ingr = "cabbage, meat, rice, cream";//может лучше так?
        public void ingredients() {
            print(getCategory(null) + getName() + ingr);

        }
    },
    OKROSHKA(25, 1, "okroshka") {
        public void ingredients() {
            print(getCategory(null) + getName() + ": popato, meat, egg, cucumber,yogurt");

        }
    },
    GALUSHKI(25, 1, "galushki") {
        public void ingredients() {
            print(getCategory(null)  + getName() + ": flour, water, solt");

        }
    },
    DERUNY_S_GRYBY(30, 1, "deruny") {
        public void ingredients() {
            print(getCategory(null) + getName() + " : potato, egg, onions, flour, milk, mushrooms, cream ");

        }
    },
    VARENUKU_S_KARTOPLA(50, 2, "varenuku") {
        public void ingredients() {
             print(getCategory(null) + getName() + " : flour, meat, rice, cream, potato, onion,cream");

        }
    },
    BLINY_S_TVOROGOM(30, 1, "bliny_s_tvorogom") {
        public void ingredients() {
            print(getCategory("Dessert:") + getName() + " : flour, egg, milk, tvorog, cream");

        }
    },
    ZAPEKANKA(50, 2, "zapekanka") {
        public void ingredients() {
            print(getCategory("Dessert:")  + getName() + " : flour, egg, milk, tvorog, cream");

        }
    },
    MOROZIVO(25, 1, "morozivo") {
        public void ingredients() {
            print(getCategory("Dessert: ") + getName() + " : milk, cream, vanilla");

        }
    },
    DRY_WHITE_WINE(25,1,"dry_white_wine"){
        @Override
        void ingredients() {
            print(getCategory("Alcohol:") + getName());

        }
    },
    DRY_RED_WINE(25,1,"dry_red_wine"){
        @Override
        void ingredients() {
            print(getCategory("Alcohol:") + getName());

        }
    },
    GORILKA(20,1,"gorilka"){
        @Override
        void ingredients() {
            print(getCategory("Alcohol:") + getName());

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

    abstract void ingredients();

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
