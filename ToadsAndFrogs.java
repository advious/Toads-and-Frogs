// ### Project: Toads and Frogs Game ###
import java.util.*;

public class toadsAndFrogsGame {

    // global variables and arrays
    static int n;                        
    // board size
    static char[] board = new char[21];   // current board,
                                         
    // create a board of size 21 which is the max value of N
    static int dashPos;      // the position of the empty spot on the current board
    static int finish;                    // status of the game - {-1:in progress,0:player lost,1:player won}
   
    static int curMove;                   // the move chosen by the player in the current turn
    static int numOfMoves;               
    // keep the number of moves

    static Scanner scan = new Scanner (System.in);  // scanner that will used in the entire code

    static void setupGame() {
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                board[i] = 'T';
            } else if (i == n/2){
                board[i] = '-';
            } else {
                board[i] = 'F';
            }
        }
        numOfMoves = 0;
        finish = -1;
        dashPos = n/2;
    }

    static void drawScreen() {
        for (int i = 0; i < n; i++) {
            System.out.print(board[i]);
        }
        System.out.println("\nNumber of moves: " + numOfMoves + "\n");
    }

    static void getMove() {
        System.out.println("Enter move (1.." + n + "): ");
        curMove = scan.nextInt() - 1;
        if (curMove < 0 || curMove > n-1 || board[curMove] == '-' || board[curMove] == 'T' && curMove == n-1 || board[curMove] == 'F' && curMove == 0 || board[curMove] == 'T' && board[curMove+1] != '-' && curMove == n-2 || board[curMove] == 'T' && board[curMove+1] != '-' && board[curMove+2] != '-' && curMove <= n-3 || board[curMove] == 'F' && board[curMove-1] != '-' && curMove == 1 || board[curMove] == 'F' && board[curMove-1] != '-' && board[curMove-2] != '-' && curMove >= 2) {
            boolean valid = false;
            while (valid == false) {
                System.out.println("Invalid move!");
                System.out.println("Enter move (1.." + n + "): ");
                curMove = scan.nextInt() - 1;
                if (!(curMove < 0 || curMove > n-1 || board[curMove] == '-' || board[curMove] == 'T' && curMove == n-1 || board[curMove] == 'F' && curMove == 0 || board[curMove] == 'T' && board[curMove+1] != '-' && curMove == n-2 || board[curMove] == 'T' && board[curMove+1] != '-' && board[curMove+2] != '-' && curMove <= n-3 || board[curMove] == 'F' && board[curMove-1] != '-' && curMove == 1 || board[curMove] == 'F' && board[curMove-1] != '-' && board[curMove-2] != '-' && curMove >= 2)) {
                    valid = true;
                }
            }
        }
    }

    static void makeMove() {
        board[dashPos] = board[curMove];
        board[curMove] = '-';
        dashPos = curMove;
        numOfMoves++;
    }

    static int checkEndGame() {
        for (int i = 0; i < n; i++) {
            if (i < n/2 && board[i] != 'F' || i == n/2 && board[i] != '-' || i > n/2 && board[i] != 'T') {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String args[]) {

        setupGame();                       
    // STEP 1

        // main game loop
        while (true) {
            drawScreen();                  
    // STEP 2
            getMove();                      // STEP 3
           
    makeMove();                     // STEP 4
            finish = checkEndGame();       
    // STEP 5
            if (finish>-1) break;            // if game is finished, break the loop
       
    }
    

        // STEP 6: end game information
        // *** TO BE FILLED
        drawScreen();
        System.out.println("You finished!");
    }
}
