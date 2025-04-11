public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee(new Employee("Зигмунд Фрейд Фурункулович", 1, 129211));
        employeeBook.addEmployee(new Employee("Левитан Агрипина Фёдоровна", 2, 111111));
        employeeBook.addEmployee(new Employee("Мёд Григорий Медведкович", 4, 99000));
        employeeBook.addEmployee(new Employee("Шестопал Фёдор Борисович", 5, 110900));
        employeeBook.addEmployee(new Employee("Сметанин Максим Валентинович", 1, 111698));
        employeeBook.addEmployee(new Employee("Черномол Дарья Валерьевна", 2, 111451));
        employeeBook.addEmployee(new Employee("Вольфрам Зульфия Амурфовна", 3, 112345));
        employeeBook.addEmployee(new Employee("Черепан Максим Леонидович", 4, 113890));
        employeeBook.addEmployee(new Employee("Прудников Артём Сергеевич", 5, 119999));

        employeeBook.printAllEmployees();
        final int totalSalary = employeeBook.calculatedTotalSalary();
        System.out.println("Сумма зарплат всех сотрудников: " + totalSalary + " рублей.");
        final Employee employeeWithMinSalary = employeeBook.findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: \n" + employeeWithMinSalary);
        final Employee employeeWithMaxSalary = employeeBook.findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: \n" + employeeWithMaxSalary);
        final int i = employeeBook.averageSalary();
        System.out.println("Средняя зарплата по отделам: \n" + i + " рублей.");
        employeeBook.printAllFuuNames();
        employeeBook.printAllEmployeesInDepartment(1);
        employeeBook.indexSalary(111); //индексация всех.
        byte minDepartament = 1;
        var minDerp = employeeBook.employeeWithMinSalaryByDepartment(1);
        System.out.println("Сотрудник в отделе " + minDepartament + " с минимальной зарплатой: \n" + minDerp);
        byte maxDepartament = 2;
        var maxDerp = employeeBook.employeeWithMaxSalaryByDepartment(2);
        System.out.println("Сотрудник в отделе " + maxDepartament + " с максимальной зарплатой: \n" + maxDerp);
        byte averageDepartament = 1;
        var averageDep = employeeBook.averageSalaryByDepartment(1);
        System.out.println("Средняя зарплата по отделу " + averageDepartament + ":\n" + averageDep + " рублей.");
        employeeBook.printEmployeesDep(1);
        employeeBook.indexSalaryDep(10, 1); //индексация в департаменте
        employeeBook.printThresholdEmployessSalaryMin(230000); //порог ниже ЗП
        employeeBook.printThresholdEmployessSalaryMax(290000); // порог выше ЗП
        employeeBook.removeEmployee(1); // удаление по id
        employeeBook.printAllEmployees();
        Employee employeeById = employeeBook.getEmployeeById(2);
        System.out.println("Работник по ID: \n" + employeeById);
    }
}