//program to show current and savings account using abstract class. 
 
//defining abstract class.
abstract class Acc {
    abstract void getBalance();     //method without method body
    abstract void depositBalance();
    abstract void widrawBalance();
}
class currentAcc extends Acc {       // currentAcc inherits the methods of abstract class Acc
    void getBalance()
    {
        System.out.println("your balance is 10,000 for current account");
    }
    void depositBalance() {
    	 System.out.println("Deposit into current account, transaction charges Rs.10");
    }
    void widrawBalance(){
    	 System.out.println("widraw from current account, transaction charges Rs.10");
    }
}


class savingsAcc extends currentAcc  // savingsAcc inherits the same methods of abstract class Acc
{
    void getBalance()
    {
        System.out.println("your balance is 10,000 for savings account");
    }
    void depositBalance() {
    	 System.out.println("Deposit into savings account");
    }
    void widrawBalance(){
    	 System.out.println("widraw from savings account ");
    }
}

class Account {
 
    public static void main(String args[]) //main method
    {
    	  Acc b= new currentAcc();//making an object and calling current Acc
          b.getBalance();
          b.depositBalance();
          b.widrawBalance();
        
          Acc c= new savingsAcc();//making an object and calling savings Acc
          c.getBalance();
          c.depositBalance();
          c.widrawBalance();
        
    }
}

