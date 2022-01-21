class Person1 {
    private String name;

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Employee extends Person1 {
    private String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}


class CompanyApp {
    public static void main(String[] args) {
        Employee emp = new Employee("Peter Gibbons", "IT");
        System.out.println(emp.getName() + " works in " + emp.getDepartment());
    }
}

