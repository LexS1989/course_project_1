package skypro.ru;

public class Employee {
    String fullNameStaff;
    int department;
    int salary;
    int id;
    static int counter = 1;

    public Employee(String fullNameStaff, int department, int salary) {
        this.fullNameStaff = fullNameStaff;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter = ++counter;
    }

    public String getFullNameStaff() {
        return fullNameStaff;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + fullNameStaff + "; " +
                "Табельный номер: " + id + "; " +
                "Зарплата: " + salary + " руб." + "; " +
                "Отдел: " + department;
    }
}
