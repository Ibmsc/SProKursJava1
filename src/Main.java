public class Main {

    public static int minStaffSalary(Employee[] employees) {

        int min = employees[0].getSalaryStaff();
        String  minName = String.valueOf(0);
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryStaff() < min) {
                min = employees[i].getSalaryStaff();
                minName = employees[i].getStaff();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой : " + minName + "- " + min + ";");
        return min;
    }
    public static int maxStaffSalary(Employee[] employees) {

        int max = employees[0].getSalaryStaff();
        String  maxName = String.valueOf(0);
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryStaff() > max) {
                max = employees[i].getSalaryStaff();
                maxName = employees[i].getStaff();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой : " + maxName + "- " + max + ";");
        return max;
    }
    public static void averageStaffSalary(Employee[] employees) {

        int sum = countStaffSalary(employees);
        int average = sum / employees.length;
        System.out.println("Среднее значение зарплат: " + average);
    }
    public static int countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат зарплат за месяц : " + sum);
        return sum;
    }
    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Сотрудники компании : " + employee.getStaff());
        }
    }
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Васильев Алексндр Иванович ", 54000, 1);
        employee[1] = new Employee(" Николаев Андрей Александрович ", 35000, 2);
        employee[2] = new Employee(" Николаева Раиса Ивановна ", 60000, 3);
        employee[3] = new Employee(" Иванов Иван Иванович ", 40000, 4);
        employee[4] = new Employee(" Мороз Петр Васильевич ", 59000, 5);
        employee[5] = new Employee(" Хохлова Валентина Сергеевна ", 32000, 1);
        employee[6] = new Employee(" Константинов Александр Викторович ", 43000, 2);
        employee[7] = new Employee(" Майоров Анатолий Владимерович ", 55000, 3);
        employee[8] = new Employee(" Борисов Станислав Игоревич ", 32000, 4);
        employee[9] = new Employee(" Ромашкин Роман Романович ", 58000, 5);

        System.out.println();
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i] + " ; ");
        }

        System.out.println();
        countAllStaff(employee);
        System.out.println();
        countStaffSalary(employee);
        System.out.println();
        averageStaffSalary(employee);
        System.out.println();
        minStaffSalary(employee);
        System.out.println();
        maxStaffSalary(employee);

    }
}