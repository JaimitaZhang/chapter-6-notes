
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
     magicnum = 0;
     array=array1;
     for (int i = 0; i<array.length; i++)
          magicnum+=array[0][i];
    }
    
    public boolean isMagic () 
    {flag=0; 
      for (int i = 0; i<rows.length; i++)
        {if (rows[i]!=magicnum)
            flag++;}
            
      for (int i = 0; i<columns.length; i++)
        {if (columns[i]!=magicnum)
            flag++;}      
            
      if (dsum!=magicnum || dsum1!=magicnum)
        flag++ ;
            
      if (flag!=0)
        return false; 
      else
        return true;
      
    }
  
    public int getMagicNum() 
        {return magicnum;}
    
    public int addRow(int row)
        {rowsum=0;
         for (int i = 0; i<array.length; i++)
            rowsum+=array[row][i];
         return rowsum;
        }
    
    public int [] addRows()
    {    rows[rowcount]=rowsum;
         rowcount++; 
         return rows; 
    }
    
    public int addColumns(int col)
        {columnsum=0;
        for (int i = 0; i<array[0].length; i++)
            columnsum+=array[i][col];
        return columnsum; 
        }
        
    public int [] addColumns()
    {columns[colcount]=columnsum; 
     colcount++;
     return columns; 
    }
    
    public int addDiagonals1()
        {dsum=0;
       for(int i = 0; i<array.length;i++)
            dsum+=array[i][i];
       return dsum; }
    
    public int addDiagonals2 (){
       dsum1=0;
       for(int i = 0; i<array.length;i++)
            dsum1+=array[i][array.length-i-1];
       return dsum1; 
       }
       
    
    public void printArray()
    {for (int i=0; i<array.length; i++)
    {   for (int j=0; j<array.length; j++)
            {System.out.print(array[i][j]+" ");}
        System.out.println();
    }
    }
    }