package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class HashModel implements iGetModel {

    public HashMap<Integer, Student> students;
    public Integer count;
    /*
     * 2) Сделать вариант класса hashModel с хранилищем типа HashMap<Long,Student>,
     * подключить к нему интерфейс iGetModel.
     * Класс подключить к контроллеру.
     */

    public HashModel(HashMap<Integer, Student> allStudents) {
        this.students = allStudents;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studs = new ArrayList<Student>();
        for (Map.Entry<Integer, Student> item : students.entrySet()) {

            studs.add(students.get(item.getKey()));

        }
        return studs;
    }

    public HashMap<Integer, Student> getAllStudentsHash() {
        return students;
    }

    public HashMap<Integer, Student> delete(HashMap<Integer, Student> allStudents, Integer key) {
        this.students = allStudents;
        students.remove(key);
        return students;
    }

}
