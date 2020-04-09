public class DiceGame {

    public static void main(String[] args) {
        //Variables
        String playerOne = "Zac";
        String playerTwo = "Dez";
        int player1die = (int)(Math.random() *6);
        int player2die = (int)(Math.random() *6);
        String winner = " has won!"; 

        System.out.println(playerOne + ": " +  player1die);
        System.out.println(playerTwo + ": " +  player2die);
         if(player1die > player2die) {
             System.out.println(playerOne + winner);
         }
         if(player2die > player1die) {
             System.out.println(playerTwo + winner);
         
      }
    }
 }
	



