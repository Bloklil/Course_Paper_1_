public class Employee {

    private static int idCount = 1;
    private static int total = 0;

    private int id;
    private String fullName;
    private double salary;
    private int departament;

    public Employee(String fullName, int departament, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.id = idCount++;
        this.departament = departament;
    }

    public int getTotal() {
        return total;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ФИО - " + getFullName() + ", в департаменте " + getDepartament() + ". Зарплата - " + getSalary() + " рублей, id работника " + getId() + ".";
    }

}
