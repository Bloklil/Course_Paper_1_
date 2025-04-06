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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return getId() == employee.getId();
    }

    public int hashCode() {
        return Integer.hashCode(getId());
    }

    public String toString() {
        return "ФИО - " + getFullName() + ", в департаменте " + getDepartament() + ". Зарплата - " + getSalary() + " рублей, id работника " + getId() + ".";
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
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
            if (employee != null && (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = employee;
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

    public static void printFuuNames(Employee[] employees) {
        for (int i = 0; i < idCount; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void printAllEmployeesInDepartment(Employee[] employees, int departament) {
        int totalSalary = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartament() == departament) {
                totalSalary += emp.getSalary();
            }
        }
        System.out.println("Сотрудники отдела " + departament + " имеют общую ЗП: " + totalSalary + " рублей.");
    }

    public static void indexSalary(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }

    public static Employee employeeWithMinSalaryByDepartment(Employee[] employees, int departament) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee employeeWithMaxSalaryByDepartment(Employee[] employees, int departament) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double averageSalaryByDepartment(Employee[] employees, int departament) {
        double totalSalary = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return totalSalary / count;
    }

    public static void printEmployeesDep(Employee[] employees, int departament) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                System.out.println(" id сотрудника: " + employee.getId() + ", ФИО: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void indexSalaryDep(Employee[] employees, double percentage, int departament) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }

    public static void printThresholdEmployessSalaryMin(Employee[] employees, double Threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < Threshold) {
                System.out.println("Работники, получающие меньше - " + Threshold + " рублей. id сотрудника: " + employee.getId() + ", ФИО: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printThresholdEmployessSalaryMax(Employee[] employees, double Threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= Threshold) {
                System.out.println("Работники, получающие больше - " + Threshold + " рублей. id сотрудника: " + employee.getId() + ", ФИО: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

}