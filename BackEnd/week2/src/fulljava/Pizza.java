package fulljava;

public class Pizza {
    protected String type;
    protected String[] toppings;
    protected String name;
    protected float timeForPreparation;
 
    public Pizza(String type, String[] toppings, String name, float timeForPreparation) {
        if (!type.equals("veg") && !type.equals("non-veg")) {
            System.out.println("Invalid type");
            return;
        }
 
        this.type = type;
        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
    }
 
    @Override
    public String toString() {
        StringBuilder toppingsStr = new StringBuilder();
        if (toppings.length == 0) {
            toppingsStr.append("No toppings");
        } else {
            for (String topping : toppings) {
                toppingsStr.append(topping).append(", ");
            }
           
        }
 
        return "Pizza Details:\n" +
                "Type: " + type + "\n" +
                "Toppings: " + toppingsStr.toString() + "\n" +
                "Name: " + name + "\n" +
                "Time for Preparation: " + timeForPreparation + " minutes";
    }}
    class ItalianPizza extends Pizza {
        public ItalianPizza(String type, String[] toppings, String name, float timeForPreparation) {
            super(type, toppings, name, timeForPreparation);
        }
 
        @Override
        public String toString() {
            return "Italian " + super.toString();
        }
    }
 
    class MexicanPizza extends Pizza {
        public MexicanPizza(String type, String[] toppings, String name, float timeForPreparation) {
            super(type, toppings, name, timeForPreparation);
        }
 
        @Override
        public String toString() {
            return "Mexican " + super.toString();
        }
    }
 
 
