package week2;

 

class student4 {
    private int rollNo;
    private String name;

 

    public student4(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

 

    public int getRollNo() {
        return rollNo;
    }

 

    public String getName() {
        return name;
    }

 

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}