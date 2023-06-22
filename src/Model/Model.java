package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
   private List<Student> students;
   private HashMap<Integer, Student> allStudents;

   public Model(HashMap<Integer, Student> allStudents) {  //консьруктор на Хэшмэп
      this.allStudents = allStudents;
   }

   public Model(List<Student> students) {//консьруктор на Лист
      this.students = students;
   }

   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public HashMap<Integer, Student> delete(HashMap<Integer, Student> allStudents, Integer key) {
      allStudents.remove(key);
      return allStudents;
   }

   public HashMap<Integer, Student> getAllStudentsHash() {
      return allStudents;
   }
}
