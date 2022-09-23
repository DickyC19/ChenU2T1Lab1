public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Fluffles", 9, 8.24);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Puffles", 6, 9.21);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
