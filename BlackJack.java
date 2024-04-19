import java.util.Scanner;

/**
 * BlackJack
*/
public class BlackJack {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        //Introduction
        System.out.println("Welcome to Java Casino");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see...");
        System.out.println("...Ready? Press anything to begin!");
        scan.nextLine();

        
        // user cards
        System.out.println("You get a");
        int userNumber1= randomNumber();
        int userNumber2= randomNumber();
        int userTotal = (Math.min(userNumber1, 10)) + (Math.min(userNumber2,10));
        String userCard1= drawRandomCard(userNumber1);
        String userCard2= drawRandomCard(userNumber2);
        System.out.println(userCard1);
        System.out.println("and a");
        System.out.println(userCard2);
        System.out.println("your total is " + userTotal + "\n");

        //dealer cards
        int dealerNumber1 = randomNumber();
        int dealerNumber2 = randomNumber();
        String dealerCard1= drawRandomCard(dealerNumber1);
        String dealerCard2= drawRandomCard(dealerNumber2);
        System.out.println("The dealer shows");
        System.out.println(dealerCard1);
        System.out.println("and has a card facing down");
        System.out.println(faceDown());
        System.out.println("The dealer's total is hidden");

        //user turn: hit or stay
        while(true){
            String option= hitOrStay();

            if(option.equals("stay")){
                break;
            }
            //draw a new card
            int newNumber = randomNumber();
            String newCard = drawRandomCard(newNumber);
            userTotal+= Math.min(newNumber, 10);
            //print new card drawn
            System.out.println("You get a");
            System.out.println(newCard);
            //print total
            System.out.println("your total is " + userTotal +"\n");
            //condition if user loses 
            if(userTotal>21){
                System.out.println("Bust! Player loses");
                System.exit(0);
            }
        
            
        }

        //computer turn
        System.out.println("\nDealer's turn\n");
        System.out.println("The dealer's cards are");
        System.out.println(dealerCard1);
        System.out.println("and a");
        System.out.println(dealerCard2);
        int dealerTotal = (Math.min(dealerNumber1,10))+(Math.min(dealerNumber2,10));

        System.out.println("Dealer's total is " + dealerTotal);

        while(dealerTotal < 17){
            int dealerNewNumber = randomNumber();
            String dealerNewCard = drawRandomCard(dealerNewNumber);
            dealerTotal+= Math.min(dealerNewNumber,10);

            System.out.println("\nDealer gets a");
            System.out.println(dealerNewCard);
            System.out.println("Dealer's total is " + dealerTotal + "\n");
        }

        if(dealerTotal > 21){
            System.out.println("Bust! Dealer loses");
            System.exit(0);
        }

        if(userTotal > dealerTotal){
            System.out.println("User wins!");
        }else if(userTotal<dealerTotal){
            System.out.println("Dealer wins!");
            
        }else{
            System.out.println("It's a tie!");

        }  

        scan.close();

        
        }


    public static String faceDown(){
        return 
        "   _____\n" +
        "  |     |\n"+ 
        "  |  J  |\n"+ 
        "  | JJJ |\n"+ 
        "  |  J  |\n"+ 
        "  |_____|\n";

    }

    public static int randomNumber(){
        int randomNumber = (int)(Math.random()*13+1);
        return randomNumber;
    }

    public static String drawRandomCard(int cardNumber){
        switch(cardNumber){
            case 1:
            return  
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
        case 2:
            return  
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
        case 3:
            return  
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
        case 4:
            return  
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
        case 5:
            return  
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
        case 6:
            return  
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
        case 7:
            return  
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
        case 8:
            return  
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
        case 9:
            return  
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
        case 10:
            return  
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
        case 11:
            return  
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
        case 12:
            return  
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
        case 13:
            return  
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";
                  
        default: return "Error: card not found";
            
        }
    }

    public static String hitOrStay(){

        System.out.println("Would you like to 'hit or 'stay'?");
        String response= scan.nextLine();

        while(!(response.equalsIgnoreCase("hit" )|| response.equalsIgnoreCase("stay"))){
            System.out.println("Please write 'hit' or 'stay'");
            response = scan.nextLine();
        }
        return response;

    }


}
