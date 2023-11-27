public class Employee extends User {
    String department;
    public Employee(String userTc, String name, String surname, String department) {
        super(userTc,name,surname);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
