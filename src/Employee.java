public class Employee {
    private int id;
    private String fullName;
    private int salary;
    private static int idCount = 1;
    private int departament;
    private static int total = 0;

    public int getTotal() {
        return total;
    }

    public int getSalary() {
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

    public Employee(String fullName, int departament, int salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.id = idCount++;
        this.departament = getDepartament();
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public String toString() {
        return "ФИО - " + getFullName() + ", в департаменте " + getDepartament() + ". Зарплата - " + getSalary() + " рублей, id работника " + getId() + ".";
    }

    public static int calculatedTotalSalary(Employee[] employees) {
        int total = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static int averageSalary(Employee[] employees) {
        int total = 0;
        int idCount = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.getSalary();
                idCount++;
            }
        }
        return total / idCount;
    }

    public int hashCode() {
        return Integer.hashCode(getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return getId() == employee.getId();
    }

    public static void printFuuNames(Employee[] employees) {
        for (int i = 0; i < idCount; i++) {
            if (employees[i] !=null) {
                System.out.println(employees[i].getFullName());
            }

        }
    }
}