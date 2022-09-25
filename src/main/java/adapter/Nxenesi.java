package adapter;

public class Nxenesi {
    private String name;
    private String Surname;
    private int mark;

    public Nxenesi(String name, String surname, int mark) {
        this.name = name;
        Surname = surname;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
