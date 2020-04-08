package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person(1,"Thanh",20));
        personList.add(new Person(4,"Thao",23));
        personList.add(new Person(3,"Hanh",21));
        personList.add(new Person(6,"Thanh",30));

        System.out.println("Truoc khi sap xep:");
        for(Person p:personList){
            System.out.println(p.toString());
        }
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return -(o1.getAge()-o2.getAge());
            }
        });
        System.out.println("Sau khi sap xep theo tuoi:");
        for(Person p:personList){
            System.out.println(p.toString());
        }
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sau khi sap xep theo ten:");
        for(Person p:personList){
            System.out.println(p.toString());
        }


    }
}
