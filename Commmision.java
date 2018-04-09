
package commmision;

import java.util.Scanner;

public class Commmision {
    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
//declare datatypes

        String name;
        final double wage =400;
        final double rate=0.07;
        int item;
        double itemPrice;
        double commission;
        double total=0;
        double netEarnings;
        
        System.out.println("The table below shows value of items the company deals with: ");
        //display the value of items sold
        //create array to hold all the items
        double arr[]={0,259.34,349.75,100.95,300.89};
        System.out.println("Item \t Value");
        for(int i=1;i<=4;i++){
        System.out.println(i +"\t"+ arr[i]);
        }
        
        System.out.println("Please input  the item Prices in Ksh: ");
        
        
        for (item=1;item<=4;item++){
           System.out.println("Item: "+item);
           itemPrice=scan.nextDouble();
           total=total+itemPrice;
        }
         
        //calculate the marketters earnings
        System.out.println("The total Earning from the items Ksh: "+total);
        commission=total*rate;
        System.out.println("Total Commision Ksh: "+commission);
        netEarnings=wage+commission;
        System.out.println("Marketers total earnings Ksh: " +netEarnings);


        
    }
    
}
