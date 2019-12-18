package pages;

public abstract class Animal {
    //can't create instance of it/add 'abstract', doesn't make sense to create instance of it

    private String name; //all instance variables/fields r private, mostly

    public Animal() { //all methods r public, mostly. this is constructor
        name = "Nameless one";
    }

    public String getName() { //getter function
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(getClass() + " " + getName() + " is walking...");
    }

    public void sleep() {
        System.out.println(getClass() + " " + getName() + " is sleeping...");
    }

    public void eat(String what) {
        System.out.println(getClass() + " " + getName() + " is eating "+ what);
    }
}
