package entities;

public class Aumento {

    private Integer id;
    private String name;
    private Double salary;

    public Aumento(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(Double percentage) {
        salary += salary / 100 * percentage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.3f", salary);
    }
}
