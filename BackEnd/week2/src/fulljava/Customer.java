package fulljava;

class Customer{
    private int custNo;
    private String custName ;
    private String custAddr ;
    private static int billNo;
    static {billNo=0;}
   
    // customer constructor for initialization
   
    public Customer(String custName, String custAddr) {
        super();
        this.custNo = ++billNo;
        this.custName = custName;
        this.custAddr = custAddr;
    }
   
   
    public int getCustNo() {
        return custNo;
    }
    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public String getCustAddr() {
        return custAddr;
    }
    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }
   
    public void display() {
        // Display customer details
        System.out.println("Customer Number: " + custNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddr);
    }
   
    public static void printBillNo()
    {
        System.out.println("Bill No :"+billNo);
    }
}