/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datee;

/**
 *
 * @author lifebook
 */
public class Datee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DateMethod date1=new DateMethod();
    
    DateMethod date2=new DateMethod(5);
    DateMethod date3=new DateMethod(7,13);
    DateMethod date4=new DateMethod(8,13,18);
    
    System.out.printf("%s\n",date1.displayDate());
    System.out.printf("%s\n",date2.displayDate());
    System.out.printf("%s\n",date3.displayDate());
    System.out.printf("%s\n",date4.displayDate());
    
    }
    
}
