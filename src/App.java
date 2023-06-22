
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;

import Model.HashModel;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;


public class App {
    public static void main(String[] args) throws Exception {

        // Для первого задания раскомитить

        /*
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Иванов", 24, 1);
        Student s2 = new Student("Иван", "Сидоров", 27, 2);
        Student s3 = new Student("Андрей", "Голиков", 41, 3);
        Student s4 = new Student("Сергей", "Иванов", 24, 1);
        Student s5 = new Student("Иван", "Сидоров", 27, 2);
        Student s6 = new Student("Андрей", "Голиков", 41, 3);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        iGetModel hm = new Model(students);
        iGetView viewEng = new ViewEng();
        Controller controllerEng = new Controller(viewEng, hm);
        controllerEng.update();
        */

        // Для второго задания раскомитить
        /*
        HashMap<Integer, Student> allStudents = new HashMap<Integer, Student>(); //
        // создала пустой ХэшМэп

        Student s1 = new Student("Сергей", "Иванов", 24, 1);
        Student s2 = new Student("Иван", "Сидоров", 27, 2);
        Student s3 = new Student("Андрей", "Голиков", 41, 3);
        Student s4 = new Student("Сергей", "Иванов", 24, 1);
        Student s5 = new Student("Иван", "Сидоров", 27, 2);
        Student s6 = new Student("Андрей", "Голиков", 41, 3);

        // добавляю студентов в хэшмэп
        allStudents.put(0, s1);
        allStudents.put(1, s2);
        allStudents.put(2, s3);
        allStudents.put(3, s4);
        allStudents.put(4, s5);
        allStudents.put(5, s6);
        HashModel hm = new HashModel(allStudents); //создаю модель, в которую ложу
        // заполненный хэшмэп
        iGetModel newFModel = hm; //
        iGetView view = new View();
        Controller controller = new Controller(view, newFModel);
        controller.update();
        */

        // 3) Добавить команду в метод run класса контролер по удалению студента:
        // * Для этого: Добавить в switch команду DELETE
        // * - запросить у пользователя номер студента на удаление
        // * - вызов удаления у модели(метод добавить в интерфейс iGetModel)
        // * - если такого нромера нет, то сообщить об этом
        // * Весь код прокомментировать и добавить само-документацию.
        HashMap<Integer, Student> allStudents = new HashMap<Integer, Student>(); // создала пустой ХэшМэп

        Student s1 = new Student("Сергей", "Иванов", 24, 1);
        Student s2 = new Student("Иван", "Сидоров", 27, 2);
        Student s3 = new Student("Андрей", "Голиков", 41, 3);
        Student s4 = new Student("Сергей", "Иванов", 24, 1);
        Student s5 = new Student("Иван", "Сидоров", 27, 2);
        Student s6 = new Student("Андрей", "Голиков", 41, 3);

        // добавляю студентов в хэшмэп
        allStudents.put(0, s1);
        allStudents.put(1, s2);
        allStudents.put(2, s3);
        allStudents.put(3, s4);
        allStudents.put(4, s5);
        allStudents.put(5, s6);
        HashModel hm = new HashModel(allStudents); // создаю модель, в которую ложу заполненный хэшмэп
        iGetModel newFModel = hm; //
        iGetView view = new View();
        Controller controller = new Controller(view, newFModel);
        controller.run();


    }
}

/*
 * 1) Сделать вариант класса ViewEng с текстом на английском языке, подключить к
 * нему интерфейс iGetView.
 * Класс ViewEng подключить к контроллеру. ГОТОВО
 * 2) Сделать вариант класса hashModel с хранилищем типа HashMap<Long,Student>,
 * подключить к нему интерфейс iGetModel.
 * Класс подключить к контроллеру. ГОТОВО
 * 3) Добавить команду в метод run класса контролер по удалению студента:
 * Для этого: Добавить в switch команду DELETE
 * - запросить у пользователя номер студента на удаление
 * - вызов удаления у модели(метод добавить в интерфейс iGetModel)
 * - если такого нромера нет, то сообщить об этом
 * Весь код прокомментировать и добавить само-документацию.
 * 
 * (задача со *)
 * 1) решить базовое решение
 * 2) сделать выбор языка при запуске контроллера
 * 3) сделать несколько моделей и студентов распределить по ним
 * 4) если не найден студент в одной модели продолжить поиск в следующей
 */