package bean;

public class Student {
    int Id;
    String Name;
    String birDate;
    boolean gender;

    public Student(int id, String name, String birDate, boolean gender) {
        this.Id = id;
        this.Name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int ID) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}

