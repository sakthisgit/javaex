

public class Student extends Person {
    private String program;
    private int year;
    private double fee;
    private String school;

    public Student(String name,String address,String program,int year,double fee,String school) {
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
        this.school = school;
    }
    public String getProgram() { return this.program; }
    public String getSchool() { return this.school; }
    public int getYear() { return this.year; }
    public double getFee() { return this.fee; }

    public void setProgram(String program) { this.program = program; }
    public void setSchool(String school) { this.school = school; }
    public void setFee(double fee) { this.fee = fee; }
    public void setYear(int year) { this.year = year; }
    public String toString() {
        return String.format("\n Student Details:\nName: "+super.getName()
                             +",Address: "+super.getAddress()
                             +",Program: "+getProgram()
                             +",School: "+getSchool()
                             +",Year: "+getYear()
                             +",Fee: "+getFee());
    }
}