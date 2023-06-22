package Controller;

// import View.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Model.HashModel;
// import Model.Model;
import Model.Student;

public class Controller {
   private iGetView view;
   private iGetViewEng viewEng;
   private iGetViewHash viewHash;
   private iGetModel model;
   private List<Student> students;
   private HashMap<Integer, Student> allStudents;

   public Controller(iGetView view, iGetModel model) {
      this.view = view;
      this.model = model;
      this.students = new ArrayList<Student>();
   }

   public Controller(iGetViewEng viewEng, iGetModel model) {
      this.viewEng = viewEng;
      this.model = model;
      this.students = new ArrayList<Student>();
   }

   public Controller(iGetViewHash viewHash, iGetModel model) {
      this.viewHash = viewHash;
      this.model = model;
      this.allStudents = new HashMap<Integer, Student>();
      allStudents.entrySet();
   }

   public void getAllStudents() {
      students = model.getAllStudents();
   }

   public void getAllStudentsHash() {
      allStudents = model.getAllStudentsHash();
   }

   public boolean testData() {
      if (students.size() > 0)
         return true;
      else
         return false;
   }

   public void update() {
      // MVP
      getAllStudents();
      if (testData())
         view.printAllStudents(students);
      else
         System.out.println("Список сиудентов пуст!");

      // MVC
      // view.printAllStudents(model.getAllStudents());
   }

   public void run() {
      Commands com = Commands.NONE;
      boolean getNewIteration = true;
      while (getNewIteration) {
         String command = view.prompt("Введите команду:");
         com = Commands.valueOf(command.toUpperCase());
         switch (com) {
            case EXIT:
               getNewIteration = false;
               System.out.println("Выход из программы!");
               break;
            case LIST:
               getAllStudents();
               view.printAllStudents(students);
               break;
            case NONE:
               System.out.println("Какой-то метод");
               break;
            case READ:
               System.out.println("Какой-то метод на чтение");
               break;
            case CREATE:
               System.out.println("Какой-то метод на создание");
               break;
            case UPDATE:
               System.out.println("Какой-то метод");
               break;
            case D:
               Scanner in = new Scanner(System.in);
               System.out.print("Введите уникальный код человека для удаления из списка ");
               String userEnter = in.nextLine();
               System.out.println(userEnter);
               allStudents = model.getAllStudentsHash();
               model.delete(allStudents, Integer.valueOf(userEnter));
               break;

         }

      }
   }

}
