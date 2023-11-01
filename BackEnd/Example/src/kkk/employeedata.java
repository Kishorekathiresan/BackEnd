package kkk;


public class employeedata {
	private String name;
	private int age;
	private float salary;
	
	
	public employeedata(String name, int age, float basic, float hra, float da, float specialAllowance) {
        this.name = name;
        this.age = age;
        this.salary = calculateSalary(basic, hra, da, specialAllowance);
        
	}
	 private float calculateSalary(float basic, float hra, float da, float specialAllowance) {
	        return basic + hra + da + specialAllowance;
	    }
    
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	 public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	    }
}




 

 



