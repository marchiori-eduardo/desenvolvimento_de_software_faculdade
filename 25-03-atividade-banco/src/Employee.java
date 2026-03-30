public class Employee {
    private String name;
    private String department;
    private double salary;
    private String admissionDate;
    private int RG;
    private boolean ativo;

    public Employee(String name, String department, double salary, String admissionDate, int RG, boolean ativo) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.admissionDate = admissionDate;
        this.RG = RG;
        this.ativo = ativo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String bonifica (){

        return "Você foi bonificado com: ";
    }

    public void demite() {
        this.ativo = false;
    }
}
