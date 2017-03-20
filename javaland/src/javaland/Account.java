package javaland;
import java.util.Scanner;

public class Account {
 
 public static void main(String[] args){
  Account1 account1 = new Account1(50);
  Account1 account2 = new Account1(0);
  
  System.out.printf("account1 balance : $%.2f\n", account1.getBalance());
  System.out.printf("account1 balance : $%.2f\n", account2.getBalance());
  
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter withdrawal amount for account1: ");
  double withdraw1 = sc.nextDouble();
  
  account1.withdraw(withdraw1);
  
  System.out.printf("account1 balance : $%.2f\n", account1.getBalance());
  System.out.printf("account1 balance : $%.2f\n", account2.getBalance());
  

  System.out.printf("Enter withdrawal amount for account2: ");
  double withdraw2 = sc.nextDouble();
  
  account2.withdraw(withdraw2);
  
  if(account2.getBalance() < 0){
   System.out.println("Debit amount exceeded account balance");
   account2.setBalance(0);
  }
  
  System.out.printf("account1 balance : $%.2f\n", account1.getBalance());
  System.out.printf("account1 balance : $%.2f\n", account2.getBalance());
 }

}
 