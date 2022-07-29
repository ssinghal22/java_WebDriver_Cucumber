package pages;

public class Dog extends Animal {

    public Dog(String name) {
        setName(name);
    }

    public void bark() {
        System.out.println(getClass() + " " + getName() + " says: Woof!");
    }

    //main() added by Soniya
public static void main(String[] args){
        Dog dog = new Dog("Coco");
        dog.bark();
}
}
