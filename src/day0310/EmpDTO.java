package day0310;

public class EmpDTO {
    private String name;
    private String part;
    private int year;
    private String pn;

    public EmpDTO() {
    }

    public EmpDTO(String name, String part, int year, String pn) {
        this.name = name;
        this.part = part;
        this.year = year;
        this.pn = pn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }
}
