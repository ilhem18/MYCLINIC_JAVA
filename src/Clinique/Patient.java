package Clinique;
public class Patient {
    private int idPatient;
    private String name;
    private boolean sexe;
    private int age;

    public void setIdPatient(int id){
        this.idPatient=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSexe(boolean sexe){
        this.sexe=sexe;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getIdPatient(){
        return idPatient;
    }
    public String getName(){
        return name;
    }
    public boolean getSexe(){
        return sexe;
    }
    public int getAge(){
        return age;
    }
}
