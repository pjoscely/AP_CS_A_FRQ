
/** AP #3
* Not implemented on the AP, but given below
*/
public class Square
{
/**
* Constructs one square of a crossword puzzle grid.
* Postcondition:
* The square is black if and only if isBlack is true. 
* The square has number num. 0 is the default value for a black 
* or not labled white square
*/
private boolean isBlack;
private int num;
/** Constructor for Square class */
public Square(boolean isBlack, int num){
 
this.isBlack = isBlack;
if (isBlack){
 this.num = 0;
}
else{
    this.isBlack = isBlack;
    this.num = num;
}
}
/** Mutators and accessors */
public void changeColor(boolean isBlack, int num){
     this.isBlack = isBlack;
     if (isBlack){
     num = 0;
      }
     else{
         this.num = num;
    }
}
public void changeNumber(int num){
    if (isBlack){
      num = 0;
      }
      else{
     this.num = num;
    }
    }
public boolean getColor(){
     return isBlack;
    }
public int getNumber(){
     return num;
    }

public String toString(){
    if(isBlack){
      return "B:"+num;  
    }
    else{
      return "W:"+num;
    }
    
}
}