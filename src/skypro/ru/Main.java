package skypro.ru;

public class Main {

    public static void printAllStaff(Employee[] array) {
        for (Employee i : array) {
            System.out.println("Персонал: " + i);
        }
    }

    public static void countSumSalary(Employee[] array) {
        int sum = 0;
        for (Employee i: array) {
            sum = sum + i.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum + " руб.");
    }

    public static void countMinSalary(Employee[] array) {
        int minSalary = array[0].getSalary();
        String employee = "";
        for (Employee i : array) {
            if (minSalary > i.getSalary()) {
                minSalary = i.getSalary();
                employee  = i.getFullNameStaff();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employee + "; " + "Зарплата: " + minSalary + " руб.");
    }

    public static void countMaxSalary(Employee[] array) {
        int maxSalary = array[0].getSalary();
        String employee = "";
        for (Employee i : array) {
            if (maxSalary < i.getSalary()) {
                maxSalary = i.getSalary();
                employee  = i.getFullNameStaff();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employee + "; " + "Зарплата: " + maxSalary + " руб.");
    }

    public static void countAverageSalary(Employee[] array) {
        int sum = 0;
        for (Employee i: array) {
            sum = sum + i.getSalary();
        }
        int average = sum / array.length;
        System.out.println("Среднее значение зарплат = " + average + " руб.");
    }

    public static void printFullNameEmployee(Employee[] array) {
        for (Employee i : array) {
            System.out.println("Сотрудник: " + i.getFullNameStaff());
        }
    }

    public static void main(String[] args) {

        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Николаев Дмитрий Иванович", 1, 89_000);
        staff[1] = new Employee("Марков Роман Николаевич", 2, 87_000);
        staff[2] = new Employee("Петров Петр Петрович", 3, 82_000);
        staff[3] = new Employee("Маликов Николай Семенович", 4, 97_000);
        staff[4] = new Employee("Семенов Никита Владимирович", 5, 98_000);
        staff[5] = new Employee("Калашникова Ирина Александровна", 5, 105_000);
        staff[6] = new Employee("Васильева Дарья Алексеевна", 4, 76_000);
        staff[7] = new Employee("Давыдова Анастасия Владимировна", 3, 97_000);
        staff[8] = new Employee("Макаров Семен Петрович", 2, 110_000);
        staff[9] = new Employee("Перов Руслан Альбертович", 1, 87_000);

        printAllStaff(staff);
        countSumSalary(staff);
        countMinSalary(staff);
        countMaxSalary(staff);
        countAverageSalary(staff);
        printFullNameEmployee(staff);
    }
}
