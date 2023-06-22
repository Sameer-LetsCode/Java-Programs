public class Account {

//    int account_number ;
//    double deposit;
//    double withdraw;

    void display1(int account_number, double deposit , double withdraw ){
        if (deposit > withdraw){
            System.out.println("Sameer");
//            System.out.println("Balance is: " + (deposit - withdraw));
        }
        else
            System.out.println("please deposit");
    }// method
    void balance (double deposit , double withdraw ){
        System.out.println("Balance is: " + (deposit - withdraw));
    }// balance

    public static void main(String[] args) {
        Account ac = new Account();
        ac.display1(1234,3000,2000);
        ac.balance(3000,2000);

    }

}
