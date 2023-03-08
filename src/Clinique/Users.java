package Clinique;

public class Users {
    private int idUser;
    private String name;
    
    private int age;

    public void setIdUser(int id){
        this.idUser=id;
    }
    public void setName(String name){
        this.name=name;
    }
    
    
    public void setAge(int age){
        this.age=age;
    }

    public int getIdUser(){
        return idUser;
    }
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
