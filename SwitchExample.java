public class SwitchExample {
    public static void main(String[] args) {
        String Head_of_team = "MI";
        switch(Head_of_team) {
            case "Banglore" : System.out.println("virat");break ;
            case "Chennai" : System.out.println("dhoni"); break ;
            case "Delhi" : System.out.println("warner"); break ;
            case "Gujarat" : System.out.println("hardik"); break ;
            case "KKR" : System.out.println("russel"); break ;
            case "MI" : System.out.println("rohit"); break ;
            case "punjab" : System.out.println("kl rahul"); break ;
            case "LSG" : System.out.println("gambir"); break ;
            case "Rajastan_Royals" : System.out.println("butler"); break ;
            case "SRH" : System.out.println("Adani"); break ;
            default: System.out.println("no result found"); break ;  // default - when you have entered which is not below cases
        }//switch case
    }// main method
}// class
