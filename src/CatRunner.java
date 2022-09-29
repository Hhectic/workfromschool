public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Daisy", 2, 12.4, "Tabby");

        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Poppy", 1, 10.2, "Black");

        cat2.introduce();
        cat2.printCatInfo();

    }
}
