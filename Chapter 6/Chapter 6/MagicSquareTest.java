 
import java.text.DecimalFormat; 
import java.text.NumberFormat;
import javax.swing.*; 
import java.util.*;

public class MagicSquareTest { 
    public static void main (String[] args)
     {
     
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
      
      MagicSquare squares = new MagicSquare(square); 
      MagicSquare squares1 = new MagicSquare(square1); 
      MagicSquare squares2 = new MagicSquare(square2); 
      squares.addRow(0);
      squares.addRow(1);
      squares.addRow(2);
      squares.addRow(3);
      squares.addColumns(0);
      squares.addColumns(1);
      squares.addColumns(2);
      squares.addColumns(3);
      squares.addDiagonals();
      
      
      squares1.addRow(0);
      squares1.addRow(1);
      squares1.addRow(2);
      squares1.addColumns(0);
      squares1.addColumns(1);
      squares1.addColumns(2);
      squares1.addDiagonals();
      
      squares2.addRow(0);
      squares2.addRow(1);
      squares2.addRow(2);
      squares2.addRow(3);
      squares2.addRow(4);
      squares2.addColumns(0);
      squares2.addColumns(1);
      squares2.addColumns(2);
      squares2.addColumns(3);
      squares2.addColumns(4);
      squares2.addDiagonals();
      
     
      squares.printArray();
      if (squares.isMagic())
         System.out.println("It's MAGIC!! With a sum of "+squares.getMagicNum());
      else
         System.out.println("This is not a magic square");
      System.out.println();

      squares1.printArray();
      if (squares1.isMagic())
         System.out.println("It's MAGIC!! With a sum of "+squares1.getMagicNum());
      else
         System.out.println("This is not a magic square");
      System.out.println();
      
      squares2.printArray();
      if (squares2.isMagic())
         System.out.println("It's MAGIC!! With a sum of "+squares2.getMagicNum());
      else
         System.out.println("This is not a magic square");
      System.out.println();

}//end of main 
}// end of class