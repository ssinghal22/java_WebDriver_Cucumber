package javaInterview;//birth year and death year of a person, calculate highly populated year
//person1 1956 - 2000
//person1 1930 - 2007
//person1 1930 - 1999
//person1 1960 - 2000
//person1 1962 - 2001
//person1 1932 - 2002

//million records - limits 1900 to 2020


import java.util.HashMap;
import java.util.List;

public class Harness {

    public class Person{
        Integer birthyr;
        Integer deathyr;
    }

    static HashMap<Integer,Integer> year = new HashMap<Integer, Integer>();

    public static void calcMaxYear(List<Person> personList){
        int temp;

        for(Person person: personList){
            if(!year.keySet().contains(person.birthyr)){
                year.put(person.birthyr, 1);
            }
            else {
             temp = year.get(person.birthyr);
             year.put(person.birthyr, ++temp);
            }

            if(person.deathyr != person.birthyr) {

                if (!year.keySet().contains(person.deathyr)){
                    year.put(person.deathyr + 1, -1);
                }
                    else {
                    temp = year.get(person.deathyr);
                    year.put(person.deathyr + 1, --temp);
                }
                }
        }
    }


    private static void main(String args[]){

        //million records - limits 1900 to 2020

        //birthyr and deathyr >= 1900
        // birthyr and deathyr <= 2020
        //








    }






}
