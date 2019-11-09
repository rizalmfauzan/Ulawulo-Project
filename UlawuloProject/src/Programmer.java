import java.util.*;
public class Programmer extends Person{
    private List<Project> listProject;
    private List<Task> listTask;
    private int idProgrammer;
    private String nameProgrammer;
    
    public String getNameProgrammer() {
        return nameProgrammer;
    }

    public void setNameProgrammer(String nameProgrammer) {
        this.nameProgrammer = nameProgrammer;
    }

    public int getIdProgrammer() {
        return idProgrammer;
    }

    public void setIdProgrammer(int idProgrammer) {
        this.idProgrammer = idProgrammer;
    }
    
   
    public Programmer(int idProgrammer, String nameProgrammer) {
        setIdProgrammer(idProgrammer);
        setNameProgrammer(nameProgrammer);
    }
}
