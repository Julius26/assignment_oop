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
public class DateMethod {
    
    private int day;
    private int month;
    private int year;
//   constructor
   public DateMethod(){
//    instance variables
     this(0,0,0);
}
   public DateMethod(int d){
   this(d,0,0);
   }
   
   public DateMethod(int d,int m){
   this(d,m,0);
   }
   public DateMethod(int d,int m,int y){
   setDate(d,m,y);
   }

    public void setDate(int d, int m, int y) {
       setDay(d);
       setMonth(m);
       setYear(y);
    }
    
    public void setDay(int d){
       day=((d>0 && d<=31)?d:0);
    }
    public void setMonth(int m){
       month=((m>0 && m<=31)?m:0);
    }
    public void setYear(int y){
       year=((y>0 && y<=2099)?y:0);
    }
    
    //get methods
    public int getDay(){
    return day;
    }
    
    public int getMonth(){
    return month;
    }
    public int getYear(){
    return year;
    }
    public String  displayDate(){
       return String.format("%d/%d/%d",getDay(),getMonth(),getYear());
    }
}


