import java.text.DecimalFormat; 
import java.text.NumberFormat;
import javax.swing.*; 
import java.util.*;

public class MagicSquareTest { 
    public static void main (String[] args)
     {
     
      //creates magic square 2d arrays   
      int [][] square = { {16,3,2,13},
                          {5,10,11,8}, 
                          {9,6,7,12}, 
                          {4,15,14,1} };
      int [][] square1 = {  {5,9,1},
                            {7,2,6},  
                            {3,4,8}  };
      int [][] square2 = { {11,24,7,20,3},
                           {4,12,25,8,16}, 
                           {17,5,13,21,9}, 
                           {10,18,1,14,22}, 
                           {23,6,19,2,15}  };
      
      //creates magicsqure object of first array above
      MagicSquare squares = new MagicSquare(square); 
      //calls toString, prints array 
      System.out.println(squares);
     
      //tests if square is magic square (it is!)
      if (squares.isMagic())
         System.out.println("It's MAGIC!! With a sum of "+squares.getMagicNum());
      else
         System.out.println("This is not a magic square");
      System.out.println();
      
      //creates magicsquare object of second array
      MagicSquare squares1 = new MagicSquare(square1); 
      //prints array
      System.out.println(squares1);

      //tests to see if square is magic (it is not)
      if (squares1.isMagic())
         System.out.println("It's MAGIC!! With a sum of "+squares1.getMagicNum());
      else
         System.out.println("This is not a magic square");
      System.out.println();
       
      //creates magicsquare object of third array
      MagicSquare squares2 = new MagicSquare(square2); 
      //prints array
      System.out.println(squares2);

      //tests to see if square is magic (it is!)
      if (squares2.isMagic())
         System.out.println("It's MAGIC!! With a sum of "+squares2.getMagicNum());
      else
         System.out.println("This is not a magic square");
      System.out.println();

}//end of main 
}// end of class