package adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Java studentJava = new Java("Eltion Kuptrija", 10.0);
        DotNet studentDotNet = new DotNet("Elvis Kavaja", 9.0);
        Nxenesi nxenes = new Nxenesi("Rais", "Sallagaj", 5);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(studentJava);
        studentList.add(studentDotNet);
        NxenesToStudentAdapter adapter = new NxenesToStudentAdapter(nxenes);
        studentList.add(adapter);

        for (Student student : studentList) {
            student.fullName();
            student.getGrade();
        }
    }
}