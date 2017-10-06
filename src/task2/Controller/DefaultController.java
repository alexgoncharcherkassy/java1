package task2.Controller;

import task2.Model.AbstractPerson;
import task2.Model.Person.Student;
import task2.Model.Person.Worker;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DefaultController {
    public static void main(String[] args) throws Exception {
        TreeMap<String, AbstractPerson> personBook = new TreeMap<String, AbstractPerson>((aStr, bStr) -> bStr.compareTo(aStr));
        for (int i = 0; i < 10; i++ ) {
            Worker worker = new Worker();
            worker.setAge(22 + i);
            worker.setName("Worker " + i);
            worker.setJob("Job " + i);
            Student student = new Student();
            student.setAge(22 + i);
            student.setName("Student " + i);
            student.setUniversity("University " + i);

            personBook.put(student.getName(), student);
            personBook.put(worker.getName(), worker);
        }
        Set<Map.Entry<String, AbstractPerson>> set = personBook.entrySet();
        for (Map.Entry<String, AbstractPerson> item: set) {
            System.out.println(item.getValue().getDetails());
        }
    }
}
