package NTU_EDU;

public class Person {
    private String name;
    private String address;
    public Person(String name,String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }

    public void setAddress(String addr) { this.address = addr; }
    public String toString() {
        return String.format("\nPerson: Name - "+this.name+",Address - "+this.address);
    }
}