import controller.StudentControler;
import controller.TeacherControler;

public class Main {
    public static void main(String[] args) {
        StudentControler controler = new StudentControler();
        controler.create("Анатолий", "Петрович", "Иванов");
        controler.create("Аркадий", "Семенович", "Петров");
        controler.create("Семен", "Олегович", "Сидоров");
        controler.create("Виктор", "Иванович", "Агеев");
        
        controler.sendOnConsole();
        System.out.println();


        TeacherControler teacherControler = new TeacherControler();
        teacherControler.create("Татьяна", "Петровна", "Семёнова");
        teacherControler.create("Игорь", "Семёнович", "Воронин");
        teacherControler.create("Антонина", "Георгиевна", "Сомова");
        teacherControler.create("Марат", "Эрнстович", "Танагузов");
        teacherControler.sendOnConsole();
        
        


    }


}
    

