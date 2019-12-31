/** #3
* A crossword puzzle grid is a two-dimensional rectangular array of black and white squares. 
* Some of the white squares are labeled with a positive number according to the crossword labeling rule.
* The crossword labeling rule identifies squares to be labeled with a positive number as follows.
* A square is labeled with a positive number if and only if:
* the square is white and the square does not have a white square immediately above it, 
* or it does not have a white square immediately to its left, or both.
* The squares identified by these criteria are labeled with consecutive numbers in row-major order, starting at 1.
* Class information for this question
* 
* public class Square
* public Square(boolean isBlack, int num)
* public class Crossword
* private Square[][] puzzle
* public Crossword(boolean[][] blackSquares)
* private boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
*/
public class Crossword
{
/** 
* Each element is a Square object with a color (black or white) and a number. 
* the number has a default value of 0 if color is black or does not satisfy the coloring rule
* puzzle[r][c] represents the square in row r, column c.
* There is at least one row in the puzzle.
*/
private Square[][] puzzle; 

/**
* Part (b)
* Write the Crossword constructor. The constructor should initialize the crossword puzzle grid 
* to have the same dimensions as the parameter blackSquares. Each element of the puzzle grid 
* should be initialized with a reference to a Square object with the appropriate color and number. 
* The number is positive if the square is labeled and 0 if the square is not labeled.
* Assume that toBeLabeled works as specified, regardless of what you wrote in part (a). 
* You must use toBeLabeled appropriately to receive full credit.
* Complete the Crossword constructor below. 
* Constructs a crossword puzzle grid.
* Precondition: There is at least one row in blackSquares. 
* Postcondition:
* if and only if blackSquares[r][c] is true.
* The squares in the puzzle are labeled according to the crossword labeling rule.
* The crossword puzzle grid has the same dimensions as blackSquares.
* The Square object at row r, column c in the crossword puzzle grid is black
* if and only if blackSquares[r][c] is true.
* The squares in the puzzle are labeled according to the crossword labeling rule.
*/
public Crossword(boolean[][] blackSquares)
{ 
  /**allocate the puzzle in memory */
  puzzle = new Square[blackSquares.length][blackSquares[0].length];
  int ct = 1;//keeps track of consecutive square numbers
  for(int i = 0; i < puzzle.length; i++){//iterate over puzzle rows
      for(int j = 0; j < puzzle[0].length; j++){//iterate across a single row 
          if(blackSquares[i][j]){
            puzzle[i][j] = new Square(true, 0);
        }
          else{
              if(toBeLabeled(i, j, blackSquares)){
                  puzzle[i][j] = new Square(false,ct);
                  ct++;//increase label number by 1
            }
           else{
                  puzzle[i][j] = new Square(false,0);
        }
    }

}
}
}
/** Part (a)
* Write the Crossword method toBeLabeled. The method returns true if the square indexed 
* by row r, column c in a crossword puzzle grid should be labeled with a positive number 
* according to the crossword labeling rule; otherwise it returns false. 
* The parameter blackSquares indicates which squares in the crossword puzzle grid are black.
* 
* Returns true if the square at row r, column c should be labeled with a positive number; 
* false otherwise.
* The square at row r, column c is black if and only if blackSquares[r][c] is true. 
* Precondition: r and c are valid indexes in blackSquares.
*/
public boolean toBeLabeled(int r, int c, boolean[][] blackSquares)//made public for testing
{ 
/**
* A square is labeled with a positive number if and only if:
* the square is white and the square does not have a white square immediately above it, 
* or it does not have a white square immediately to its left, or both.
*/
    //Clever AP code handles early exit of code due to r == 0 or c == 0
    //Never will have an array out of bounds exception
    return (!(blackSquares[r][c]) && (r == 0 || c == 0 || blackSquares[r - 1][c] ||blackSquares[r][c - 1]));

}
/** returns puzzle */
public Square[][] getPuzzle(){
    return puzzle;
}


/** Print puzzle, used in testing*/
public void printPuzzle(){
    for(int i = 0; i < puzzle.length; i++){//iterate over puzzle rows
      for(int j = 0; j < puzzle[0].length; j++){//iterate across a single row 
           System.out.print(puzzle[i][j]+" ");
       }
        System.out.println();
     }

    }
  }






