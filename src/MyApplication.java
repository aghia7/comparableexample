import models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Bake", "Bakebayev", 3.45));
        list.add(new Student("Sake", "Sakebayev", 2.45));
        list.add(new Student("Dake", "Dakebayev", 3.12));
        list.add(new Student("Rake", "Rakebayev", 1.67));
        list.add(new Student("Make", "Makebayev", 4.0));
        list.add(new Student("Zhake", "Zhakebayev", 2.99));

        list.sort(Comparator.comparingDouble(Student::getGpa));

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
