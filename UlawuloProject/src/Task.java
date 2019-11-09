
public class Task {
    private String nameProject;
    private int maxTugas;
    
    public Task(String nameProject, int maxTugas){
        setNameProject(nameProject);
        setMaxTugas(maxTugas);
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public int getMaxTugas() {
        return maxTugas;
    }

    public void setMaxTugas(int maxTugas) {
        this.maxTugas = maxTugas;
    }
    
    
}
