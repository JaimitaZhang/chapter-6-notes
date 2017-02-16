
public class MagicSquare {
    public int [][] array;
    public int [] rows = new int[20];
    public int [] columns = new int[20];
    public int [] diagonals = new int[2];
    public int rowcount, colcount, dcount, magicnum, rowsum, columnsum,dsum,dsum1, flag;
 
    public MagicSquare()  
        {
        }
    public MagicSquare(int [][]array1)
    {rowcount = 0;
     colcount = 0;
     magicnum=0;
     array=array1;
     for (int i = 0; i<array.length; i++)
          magicnum+=array[0][i];
    }
    
    public boolean isMagic () 
    { addRows();
      addColumns();
      addDiagonals();
      for (int i = 0; i<rows.length; i++)
        {if (rows[i]!=magicnum)
            flag++;}
            
      for (int i = 0; i<columns.length; i++)
        {if (columns[i]!=magicnum)
            flag++;}      
            
      for (int i = 0; i<diagonals.length; i++)
        {if (diagonals[i]!=magicnum)
            flag++;}
            
            
      if (flag!=0)
        return false; 
      else
        return true;
      
    }
  
    public int getMagicNum() 
        {return magicnum;}
    
    public void addRow(int row)
        {rowsum=0;
         for (int i = 0; i<array.length; i++)
            rowsum+=array[row][i];
         rows[rowcount]=rowsum;
         rowcount++; 
        }
    
    public int [] addRows()
    {return rows; 
    }
    
    public void addColumns(int col)
        {columnsum=0;
        for (int i = 0; i<array[0].length; i++)
            columnsum+=array[i][col];
        columns[colcount]=columnsum; 
        colcount++;
        }
        
    public int [] addColumns()
    {return columns; 
    }
    
    public void addDiagonals()
        {dsum=0;
       for(int i = 0; i<array.length;i++)
            dsum+=array[i][i];
       diagonals[0]=dsum; 
            
       dsum1=0;
       for(int i = 0; i<array.length;i++)
            dsum1+=array[i][array.length-i-1];
       diagonals[1]=dsum1; 
       
       }
       
    public int [] diagonals ()
    {return diagonals; 
    }
    
    public void printArray()
    {for (int i=0; i<array.length; i++)
    {   for (int j=0; j<array.length; j++)
            {System.out.print(array[i][j]+" ");}
        System.out.println();
    }
    }
    }