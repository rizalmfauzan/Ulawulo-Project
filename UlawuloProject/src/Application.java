import java.util.*;
public class Application {
    public static void main(String[] args) {
        List<Person> Person = new ArrayList<>();
        
               
        Manager m1 = new Manager(001,"Udin Sedunia","Product Development","087751123");
        
        Project project = new Project(m1,"Building Tubes",5);
        
        Programmer p1 = new Programmer(4233,"Ray");
        Programmer p2 = new Programmer(0150,"Riz");
        
        
        project.addProgrammer(p1);
        project.addProgrammer(p2);
        
        project.addTask(p1,"Membuat Class");
        project.addTask(p2,"Membuat Driver");
    }
}
