import java.util.*;  

class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.println("welcome to banksim 2000");
        //Balance
    int balance = 100;
    
  
    
    System.out.println("1 - current balance");
    System.out.println("2 - deposit");
    System.out.println("3 - withdraw");
    System.out.println("4 - end");
    int a= sc.nextInt();
    if (a==1){
      System.out.println("the current balance is "+balance);
    }else if (a==2){System.out.println("");
      int deposit= sc.nextInt(); 
  System.out.println("the balance after deposit is " + (balance+deposit));   
    } else if (a==3){
      int withdraw = sc.nextInt();  
      System.out.println("the balance after withdraw is " + (balance - withdraw));  
    }

    

      //deposit amount
    int deposit = 50;
      //withdraw
    int withdraw = a;

    
      
  }
}