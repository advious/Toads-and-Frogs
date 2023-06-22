# Toads-and-Frogs
A simple logic game where the objective is to get toads and frogs on opposite sides of a 1-by-N board.
## Rules:
Toads and Frogs is a one-player game. Given a board of size N (where N is odd), the left side of the board is filled with toads and the right side is with frogs and the middle square is empty. Here is the initial board configuration for N=7:
![image](https://github.com/advious/Toads-and-Frogs/assets/122961412/5aca1162-df06-4173-8f5c-35d9a4ce0938)

A toad can slide right or jump over one square to the right.
**__Slide:__**
![image](https://github.com/advious/Toads-and-Frogs/assets/122961412/e0b5be4a-8261-458a-8108-d7a2a359d416)
![image](https://github.com/advious/Toads-and-Frogs/assets/122961412/e6639f07-4adb-44cc-8f45-21363bfe8666)

**__Jump:__**
![image](https://github.com/advious/Toads-and-Frogs/assets/122961412/cb2e6ef6-2b02-43a3-a87c-aedca8443044)
![image](https://github.com/advious/Toads-and-Frogs/assets/122961412/50ca7811-3203-453b-b08e-a6fa2a9ef6cc)

Similarly, a frog can slide left or jump over one square to the left.
The objective of the game is to move the toads to the right side and the frogs to the left side of the board in the __minimum number of moves__. The final configuration should be as follows:
![image](https://github.com/advious/Toads-and-Frogs/assets/122961412/a7d91441-840d-43d5-8ccd-f79c27899a7b)

## Game Design:
- The player will enter the board size N. N is an odd number (3 <= N <= 21). Then you will set up the board with respect to N. For instance, for N = 7, the board should be TTT-FFF where Ts are toads and Fs are frogs.
- In each turn, print the current board and the number of moves on the screen.
- Then the program waits for the player input, a number between 1 to N. Considering the board is numbered from 1 to N, the number indicates moving the element in that square. For instance, if the board is TTT-FFF:
  + 3 moves the toad from position 3 to position 4 -- TTT-FFF => TT-TFFF
  + 6 moves the frog from position 6 to position 4 -- TTT-FFF => TTTFF-F
- Continue asking the player to move if the provided move is not valid. Otherwise, make the move.
- The game finishes whenever all frogs are on the left side and all toads are on the right side and the empty square is in the middle.
