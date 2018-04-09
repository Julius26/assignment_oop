
package array2;


public class Array2 {

    
    public static void main(String[] args) {
        
        int count [][]=new int[2][5];
        
        for(int row=0;row<2;row++){
            for(int col=0;col<4;col++){
                count[row][col]=0;
                count[row][col]+=1;
            System.out.print(count[row][col]+"\t");
            }
            
            System.out.println();
        }
        
        }
         
    }
    

