package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1,"Hai",8.5));
        listStudent.add(new Student(4,"Anh",8.0));
        listStudent.add(new Student(3,"Xuan",9.5));
        listStudent.add(new Student(5,"Lan",8.5));

        System.out.println("Danh sach truoc sap xep:");
        for(Student s:listStudent){
            System.out.println(s.toString());
        }

        Collections.sort(listStudent);

        System.out.println("Danh sach sau sap xep:");
        for(Student s:listStudent){
            System.out.println(s.toString());
        }


    }
}
