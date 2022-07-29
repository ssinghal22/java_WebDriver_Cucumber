package pages;

public class Cat extends Animal {

    public Cat() {}

    public Cat(String name) {
        setName(name);
    }

    public void meow() {
        System.out.println(getClass() + " " + getName() + " says: Meow!");
    }

    //main() added by Soniya
public static void main(String[] args){
        Cat cat = new Cat();
        cat.meow();

        Cat cat1 = new Cat("Billy");
        cat1.meow();
}
}
