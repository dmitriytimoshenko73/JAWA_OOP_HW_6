import controller.StudentControler;
import controller.TeacherControler;

public class Main {
    public static void main(String[] args) {
        StudentControler controler = new StudentControler();
        controler.create("Виктор", "Петрович", "Викторов");
        controler.create("Арсен", "Семенович", "Петрян");
        controler.create("Густав", "Олегович", "Суркин");
        controler.create("Вениамин", "Иванович", "Маркин");
        
        controler.sendOnConsole();
        System.out.println();


        TeacherControler teacherControler = new TeacherControler();
        teacherControler.create("Изольда", "Петровна", "Семёнова");
        teacherControler.create("Иван", "Семёнович", "Пупкин");
        teacherControler.create("Агрипина", "Георгиевна", "Карасева");
        teacherControler.create("Махмуд", "Эрнстович", "Шильман");
        teacherControler.sendOnConsole();
        
        


    }


}
    

