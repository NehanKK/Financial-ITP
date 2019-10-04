/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itproject;

/**
 *
 * @author Nehan KK
 */
public class ITPNEW {
    
   int id;
   float amount;
   String method;
   String addDate;
   char email;
 
   public ITPNEW(int sid,float samount,String smethod,String saddDate,char semail)
   {
    this.id= sid;
    this.amount=samount;
    this.method=smethod;
    this.addDate=saddDate;
    this.email=semail;
       
   }
   
   public int getId()
           {
               return id;
               
           }
           
   public float getAmount()
           
           {
               return amount;
               
           }
           
   public  String getMethod()
   {
       return method;
           }
   
   public String getAddDate()
           
   {
       return addDate;
   }
   
   public char getEmail()
           
   {
   return email;
   }
}
