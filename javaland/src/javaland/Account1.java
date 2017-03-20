	package javaland;
	
	public class Account1 {
	 private double money;
	
	 public Account1(double s){
	  money = s;
	 }
	 
	 public double getMoney(){
	  return money;
	 }
	 
	 public void setMoney(double s){
	  money =s;
	 }
	 
	 public void add(double s){
	  money += s;
	 }
	 
	 public void withdraw(double s){
	  money -= s;
	 }
	}
	 