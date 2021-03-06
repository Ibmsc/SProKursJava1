public class Employee {

    private String staff;
    private int salaryStaff;
    private int departmentNumber;
    private int id;
    private static int counter;

    public Employee (String staff, int salaryStaff, int departmentNumber){
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        this.id = counter;
        counter++;
    }
    public static int getCounter(){
        return counter; }

    public String getStaff() {
        return staff;
    }
    public int getId() {return id;}

    public int getSalaryStaff() {return salaryStaff;}

    public int getDepartmentNumber() {return departmentNumber;}

    public void setStaff (String staff) {this.staff = staff; }

    public void setSalaryStaff (int salaryStaff) {this.salaryStaff = salaryStaff;}

    public void setDepartmentNumber(int departmentNumber) {this.departmentNumber = departmentNumber;}

    @Override
    public String toString(){
        return "Ф.И.О. сотрудника :" + this.getStaff() + "; " + "Зарплата сотрудника : " + this.getSalaryStaff()
                + " ; " + "Отдел сотрудника : " + this.getDepartmentNumber() + "; ID сотрудника - " + this.getId();



    }}
