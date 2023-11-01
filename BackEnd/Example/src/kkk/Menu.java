package kkk;

public class Menu {
	String dishName;
	float calories,price,bottle;
	int time;
	
	
	public Menu() {
		this.dishName="Undefinied";
		this.calories=(float)0.0;
		this.price=(float)0.0;
		this.bottle=(float)0.0;
		this.time=0;
	}
	
	public float getCalories() {
		return calories;
	}
	public void setCalories(float calories) {
		this.calories = calories;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getBottle() {
		return bottle;
	}
	public void setBottle(float bottle) {
		this.bottle = bottle;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public void setDishName(String dishName) {
		this.dishName=dishName;
	}
	public String getDishName() {
		return dishName;
	}
	public void output() {
		System.out.println("Menu "+this.dishName+" contain "+this.calories+" calories ,comes with "+
	               this.bottle+" wine bootles and cost "+this.price);
	}
}
