public class CheckersMove {
 // A CheckersMove object represents a move in the game of Checkers.
 // It holds the row and column of the piece that is to be moved
 // and the row and column of the square to which it is to be moved.
 // (This class makes no guarantee that the move is legal.)

  
 // Position of piece to be moved.
  private int moveFromX;
  private int moveFromY;
  private int moveToX;
  private int moveToY;
   // Constructor.  Just set the values of the instance variables.
  public CheckersMove(int r1, int c1, int r2, int c2)
  {
    moveFromX=r1;
    moveFromY=c1;
    moveToX=r2;
    moveToY=c2;
 }
  // Accessors
  public int getFromRow()
  {
    return moveFromX;
 }
  public int getFromCol()
  {
    return moveFromY;
  }
  public int getToRow()
  {
    return moveToX;
  }
  public int getToCol()
  {
    return moveToY;
  }
  public boolean isJump()
  {
    if(Math.abs(moveToX-moveFromX)!=2)
    {
      return false;
    }
    return true;
  }
  // end class CheckersMove.
}
 
 // Square it is to move to.

 

   // end class CheckersMove.
