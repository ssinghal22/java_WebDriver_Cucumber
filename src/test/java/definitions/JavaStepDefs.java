package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.Cat;
import pages.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaStepDefs {
    @Given("^I write java step$")
    public void iWriteJavaStep() {
        System.out.println("Hello World!");

        String firstName = "Soni";
        String lastName = "Sing";
        String favoriteColor = "White";
        System.out.println(firstName + " " + lastName + " " + favoriteColor);
    }

    @And("^I print \"([^\"]*)\" in console$")
    public void iPrintInConsole(String text) throws Throwable {
        System.out.println();
        System.out.println(text);
    }

    @And("^I do actions with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iDoActionsWithAnd(String arg0, String arg1) throws Throwable {
       System.out.println();
       System.out.println();
        System.out.println("First arg: " + arg0);
        System.out.println("Second arg: " + arg1);
        System.out.println();
        System.out.println("UpperCase: " + arg0.toUpperCase());
        System.out.println("UpperCase: " + arg1.toUpperCase());
        System.out.println();
        System.out.println("Length of first arg: " + arg0.length());
        System.out.println("length of second arg: " + arg1.length());
        System.out.println();
        System.out.println("arg0 equal to arg1? " + (arg0 == arg1));
        System.out.println("arg0 equal to arg1? " + arg0.equals(arg1));
        System.out.println();
        System.out.println("arg0 equal to arg1, ignore case? " + arg0.equalsIgnoreCase(arg1));
        System.out.println();
        System.out.println("arg0 contains arg1? " + arg0.toLowerCase().contains(arg1.toLowerCase()));
        System.out.println();
        System.out.println("arg1 contains arg0? " + arg1.toLowerCase().contains(arg0.toLowerCase()));
    }

    @And("^I compare \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCompareAnd(String var1, String var2) throws Throwable {
        if(var1.equals(var2)) {
            System.out.println();
            System.out.println("2 strings r equal");
        }
           else {
               System.out.println();
               System.out.println("Strings not equal");
        }
    }

    @And("^I print url for \"([^\"]*)\" page$")
    public void iPrintUrlForPage(String domain) throws Throwable {
        System.out.println();
        System.out.println();

        if (domain.equalsIgnoreCase("google")) {
            System.out.println("google url: " + "https://www.google.com");
        }
        else if (domain.equalsIgnoreCase("sample")) {
            System.out.println("sample url: " + "https://skryabin.com/webdriver/html/sample.html");
        }
        else {
            System.out.println("Unsupported page: " + domain);
        }
    }

    @Given("^I work with arrays$")
    public void iWorkWithArrays() {

        String[] groceryList = {"apples", "oranges", "milk", "yogurt", "banana"};
        System.out.println();
        System.out.println("simple array: ");
        System.out.println(groceryList[0]);
        System.out.println(groceryList[1]);
        System.out.println(groceryList[2]);
        System.out.println(groceryList[3]);
        System.out.println(groceryList[4]);

        groceryList[1] = "kiwi";

        System.out.println();
        System.out.println("for each loop output for simple array: ");
        for (String item : groceryList) {

            if (item.equalsIgnoreCase("milk")) {
                System.out.println("item is " + "milk");
            }
            System.out.println(item);
        }

        ArrayList<String> anotherGroceryList = new ArrayList<>();
        anotherGroceryList.add("milk");
        anotherGroceryList.add("yogurt");
        anotherGroceryList.add("tomato");
        anotherGroceryList.add("avocado");
        anotherGroceryList.add("nuts");
        anotherGroceryList.add("rice");

        System.out.println();
        System.out.println("ArrayList output: ");
        System.out.println(anotherGroceryList.get(0));
        System.out.println(anotherGroceryList.get(1));
        System.out.println(anotherGroceryList.get(2));
        System.out.println(anotherGroceryList.get(3));
        System.out.println(anotherGroceryList.get(4));
        System.out.println(anotherGroceryList.get(5));

        System.out.println();
        System.out.println("ArrayList output using for each loop: ");
        for (String item : anotherGroceryList) {
            System.out.println(item);
        }
    }

    @Given("^I work with maps$")
    public void iWorkWithMaps() {
        HashMap<String, String> states = new HashMap<>();
        states.put("CA", "California");
        states.put("DE", "Delaware");
        System.out.println(states.get("DE"));

        HashMap<String, String> admin = new HashMap<>();
        admin.put("username", "skryabin");
        admin.put("email", "slava@skryabin");
        admin.put("password", "12345");
        admin.put("confirmPassword", "12345");
        admin.put("address", "123 Main st");
        admin.put("city", "San Ramon");
        admin.put("originCity", "San Ramon");

        HashMap<String, String> user = new HashMap<>();
        user.put("username", "doe");
        user.put("email", "john@doe.com");
        user.put("password", "password12345");
        user.put("confirmPassword", "password12345");
        user.put("address", "123 Main st");
        user.put("city", "San Ramon");
        user.put("originCity", "Los Altos");

        System.out.println(admin.get("username"));
        System.out.println(admin.get("password"));
        System.out.println(user.get("username"));
        System.out.println(user.get("password"));
    }

    @Given("^I work with classes$")
    public void iWorkWithClasses() {
        Cat cat = new Cat();
        Dog dog = new Dog("Marly");

        cat.meow();
        System.out.println(cat.getName());
        cat.sleep();
        cat.walk();
        cat.eat("cat's food");

        dog.walk();
        dog.bark();
    }
}
