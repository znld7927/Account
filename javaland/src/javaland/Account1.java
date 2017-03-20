	package javaland;
	
	public class Account1 {
	 protected double balance;
	
	 public Account1(double s){
	  balance = s;
	 }
	 
	 public double getBalance(){
	  return balance;
	 }
	 
	 public void setBalance(double s){
	  balance =s;
	 }
	 
	 public void credit(double s){
	  balance = balance + s;
	 }
	 
	 public int debit(double s){
	  balance = balance - s;
	  return 0;
	 }
	}
	 