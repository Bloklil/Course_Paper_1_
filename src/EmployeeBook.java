class EmployeeBook {

    private Employee[] employees = new Employee[10];
    private int capacity;

    public EmployeeBook(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < capacity; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int calculatedTotalSalary() {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public int averageSalary() {
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

    public void printAllFuuNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void printAllEmployeesInDepartment(int departament) {
        int totalSalary = 0;
        for (Employee emp : employees) {
            if (emp != null && emp.getDepartament() == departament) {
                totalSalary += emp.getSalary();
            }
        }
        System.out.println("Сотрудники отдела " + departament + " имеют общую ЗП: " + totalSalary + " рублей.");
    }

    public void indexSalary(double percentage) {
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }

    public Employee employeeWithMinSalaryByDepartment(int departament) {
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

    public Employee employeeWithMaxSalaryByDepartment(int departament) {
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

    public double averageSalaryByDepartment(int departament) {
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

    public void printEmployeesDep(int departament) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                System.out.println(" id сотрудника: " + employee.getId() + ", ФИО: "
                        + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void indexSalaryDep(double percentage, int departament) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                double newSalary = employee.getSalary() * (1 + percentage / 100);
                employee.setSalary((int) newSalary);
            }
        }
    }

    public void printThresholdEmployessSalaryMin(int threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < threshold) {
                System.out.println("Работники, получающие меньше - " + threshold + " рублей. id сотрудника: "
                        + employee.getId() + ", ФИО: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

    public void printThresholdEmployessSalaryMax(int threshold) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= threshold) {
                System.out.println("Работники, получающие больше - " + threshold + " рублей. id сотрудника: "
                        + employee.getId() + ", ФИО: " + employee.getFullName() + ". Зарплата: " + employee.getSalary());
            }
        }
    }

}
