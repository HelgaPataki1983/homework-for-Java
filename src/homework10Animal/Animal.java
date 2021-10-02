package homework10Animal;
/*Создать абстрактный класс Animal и расширяющие его классы Dog, Cat, Horse.
        Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
        Метод sleep, например, может выводить на консоль "Животное спит".
        Dog, Cat, Horse переопределяют методы makeNoise, eat. Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
        Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
        Пусть этот метод распечатывает food и location пришедшего на прием животного. В методе main создайте массив типа Animal,
        в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.

        Как минимум один метод в классе Animal должен быть абстрактным.*/


public abstract class Animal {
 private String food;
 private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract void makeNoice();
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
