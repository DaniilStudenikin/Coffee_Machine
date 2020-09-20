class Cat {
    String name;
    int age;
    static int counter = 0;
    // write static and instance variables

    public Cat(String name, int age) {
        // implement the constructor
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;

    }
}