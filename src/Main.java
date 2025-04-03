public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        initializeEmployees();
        int totalSalary = Employee.calculatedTotalSalary(employees);
        System.out.println("Общая зарплата: " + totalSalary + " рублей.");
        var min = Employee.findEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с минимально ЗП: " + min);
        var max = Employee.findEmployeeWithMaxSalary(employees);
        System.out.println("Сотрудник с максимальной ЗП: " + max);
        int average = Employee.averageSalary(employees);
        System.out.println("Средняя зарплата " + average + " рублей.");

    }

    public static void initializeEmployees() {
        employees[0] = new Employee("Зигмунд Фрейд Фурункулович", 1, 111_129);
        employees[1] = new Employee("Левитан Агрипина Фёдоровна", 2, 89_890);
        employees[2] = new Employee("Мёд Григорий Медведкович", 3, 78_111);
        employees[3] = new Employee("Шестопал Фёдор Борисович", 1, 111_900);
        employees[4] = new Employee("Сметанин Максим Валентинович", 4, 111_456);
        employees[5] = new Employee("Черномол Дарья Валерьевна", 5, 101_001);
        employees[6] = new Employee("Вольфрам Зульфия Амурфовна", 4, 123_456);
        employees[7] = new Employee("Черепан Максим Леонидович", 3, 101_099);
        employees[8] = new Employee("Прудников Артём Сергеевич", 5, 99_909);
        Employee.printAllEmployees(employees);
        Employee.printFuuNames(employees);

    }

}