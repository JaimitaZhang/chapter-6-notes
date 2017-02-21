/**Jamie Zhang
Variables - 
-rowcount = counter for assigning array elements to rows array
-colcount = counter for assigning array elements to columns array
-magicnum = magic number
-rowsum = sum of each row 
-columnsum = sum of each column
-dsum = sum of diagonal (left to right)
-dsum1 = sum of diagonal (right to left)
-flag = increases if a sum doens't match magicnum 
-rows = array of row sums
-columns = array of column sums
-array = array that is being tested
-numbers = string that holds integers of array (for printing)
*/


public class MagicSquare {
    //instantiates arrays and variables
    public int [][] array;
    public int [] rows;
    public int [] columns;
    
    public int rowcount, colcount, dcount, magicnum, rowsum, columnsum,dsum,dsum1, flag;
 
    /*default constructor*/
    public MagicSquare()  
        {
        }
    
    /*overloaded constructor*/
    public MagicSquare(int [][]array1)
    {//initializes variables
     rowcount = 0;
     colcount = 0;
     magicnum = 0;
     array=array1;
     //assigns length to arrays
     rows = new int[array.length];
     columns = new int[array.length];
     
     //calculates magicnum using first row of array
     for (int i = 0; i<array.length; i++)
          magicnum+=array[0][i];
     
     //calculates row, column and diagonal sums
     //populations rows and columns arrays
     for (int i =0; i<array.length; i++)
     {addRows(i);
      addRows();
      addColumns(i);
      addColumns();
     }
     addDiagonals1();
     addDiagonals2();
    }
    
    /*isMagic method -
    checks to see if array is magic*/
    public boolean isMagic () 
    {flag=0; 
     //if any row sum isn't equal to magicnum
     //flag counter increments
      for (int i = 0; i<rows.length; i++)
        {if (rows[i]!=magicnum)
            flag++;
            }
      
      //if any column sum isn't equal to magicnum
      //flag counter incrememnts
      for (int i = 0; i<columns.length; i++)
        {if (columns[i]!=magicnum)
            flag++;}      
            
      //if any diagonal sum doens't equal magicnum
      //flag counter increments
      if (dsum!=magicnum || dsum1!=magicnum)
        flag++ ;
            
      //if flag isn't equal to 0, then the array isn't magic
      if (flag!=0)
        return false; 
      else
        return true;
      
    }
  
    /*getMagicNum - returns magic number*/
    public int getMagicNum() 
        {return magicnum;}
    
    /*addRows - returns sum of a row*/
    public int addRows(int row)
        {rowsum=0;
         for (int i = 0; i<array.length; i++)
            rowsum+=array[row][i];
         return rowsum;
        }
    
    /*addRows - assigns a row sum to a spot in rows array*/
    public int [] addRows()
    {    rows[rowcount]=rowsum;
         rowcount++; 
         return rows; 
    }
    
    /*addColumns - returns sum of a column*/
    public int addColumns(int col)
        {columnsum=0;
        for (int i = 0; i<array[0].length; i++)
            columnsum+=array[i][col];
        return columnsum; 
        }
    
    /*addColumns - assigns a column sum to a spot in columns array*/
    public int [] addColumns()
    {columns[colcount]=columnsum; 
     colcount++;
     return columns; 
    }
    
    /*addDiagonals - returns sum of left to right diagonal*/
    public int addDiagonals1()
        {dsum=0;
       for(int i = 0; i<array.length;i++)
           //starts at top left corner
            dsum+=array[i][i];
       return dsum; }
    
    /*addDigonals2 - returns sum of right to left diagonal*/
    public int addDiagonals2 (){
       dsum1=0;
       for(int i = 0; i<array.length;i++)
           //starts at top right corner
            dsum1+=array[i][array.length-i-1];
       return dsum1; 
       }
       
    /*toString - prints array being tested*/
    public String toString() 
    {
    String numbers = "";
    for (int i = 0; i<array.length; i++)
        {numbers+="\n";       
        for (int j=0; j<array.length; j++)
            //iterates through each array element
            //appends it to a string
            numbers+=array[i][j]+ " ";}
    return numbers; 
    
    }
    
    }