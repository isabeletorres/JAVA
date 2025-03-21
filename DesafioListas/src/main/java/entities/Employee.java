package entities;

public class Employee {
    private Integer id;
    private String name;
    private double salary;

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        this.salary += this.salary * (percentage/100);
    }

    @Override
    public String toString() {
        return  id +
                ", " + name +
                ", " + salary
                ;
    }
}
