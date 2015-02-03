//Patrick McGuire
//Demo 0
//Arithmetic Java Program
//
//
//  program designed to calculate various totals of a shopping trip assuming 
// a given shopping list and prices and a 6% sales tax 
//  first compile the program 
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define the class 
public class Arithmetic {

//  add main method 
  public static void main(String [] args) {
      int nSocks=3; // number of socks purchased
      double sockCost$=2.58; // cost of socks
      // '$' is part of the variable name
      int nGlasses=6; // number of glasses purchased
      double glassCost$=2.29; // cost of glasses
      int nEnvelopes=1; // number of envelopes purchases
      double envelopeCost$=3.25; // cost of envelopes
      double taxPercent=0.06; // sales tax
      double totalSockCost$, totalGlassCost$, totalEnvelopeCost$; // defines variables for total spent on each item 
      double salestaxSocks$, salestaxGlasses$, salestaxEnvelopes$; // defines variables for sales tax on each item 
      double totalpretaxCost$, totalaftertaxCost$; // creates variables for pretax and after tax total cost
      double totalSalestax$; // defines a variable for the total amount of sales tax paid
      
      
      System.out.println("I'm buying socks"); // prints out the string
      System.out.println("I'm buying "+nSocks+" socks"); // prints out the number of socks bought
      System.out.println("The socks cost $"+sockCost$+" each"); // prints out the cost of socks
      System.out.println("I'm buying glasses"); // prints out the string
      System.out.println("I'm buying "+nGlasses+" glasses"); // prints out the number of glasses bought
      System.out.println("The glasses cost $"+glassCost$+" each"); // prints out the cost of glasses
      System.out.println("I'm buying envelopes"); // prints out the string
      System.out.println("I'm buying "+nEnvelopes+" envelope"); // prints out the number of envelopes bought
      System.out.println("The envelopes cost $"+envelopeCost$+" each"); // prints out the cost of envelopes
      totalSockCost$=nSocks*sockCost$; // defines total as the # of socks purchased multiplied by their unit cost
      totalGlassCost$=nGlasses*glassCost$; // similar as above but with glasses
      totalEnvelopeCost$=nEnvelopes*envelopeCost$; // similar as above but with envelopes
      System.out.println("The total cost of socks is $"+totalSockCost$+" dollars"); // prints total cost of socks
      System.out.println("The total cost of glasses is $"+totalGlassCost$+" dollars"); // prints total cost of glasses
      System.out.println("The total cost of envelopes is $"+totalEnvelopeCost$+" dollars"); // prints total costs of envelopes
      salestaxSocks$=totalSockCost$*taxPercent; // defines the sales tax on socks as total cost fo socks multiplied by the sales tax
      salestaxGlasses$=totalGlassCost$*taxPercent; // similar as above but for glasses
      salestaxEnvelopes$=totalEnvelopeCost$*taxPercent; // simialr as above but for envelopes 
      System.out.println("The sales tax paid on socks was "+(salestaxSocks$*100)+" cents"); // prints out the sales tax on socks
      System.out.println("The sales tax paid on glasses was "+(salestaxGlasses$*100)+" cents"); // prints out the sales tax on glasses
      System.out.println("The sales tax paid on envelopes was "+(salestaxEnvelopes$*100)+" cents"); // prints out the sales tax on envelopes
      totalpretaxCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; // defines total pre tax cost as the sum of three items total costs
      System.out.println("The total pre tax cost was $"+totalpretaxCost$+" dollars"); // prints out total pre tax cost
      totalSalestax$=(salestaxSocks$+salestaxGlasses$+salestaxEnvelopes$)*100; // makes total sum of three; multiplied by 100 to reduce decimal points
      double dtotalSalestax =((int) (totalSalestax$))/(100.0); // casts totalSalestax$ to an int then divided by 100.0 then declares result as a double to reduce decimal points
      totalaftertaxCost$=(totalpretaxCost$+totalSalestax$/100)*100; // makes total sum of sales tax and pre tax total; multiplies by 100 to reduce decimal points
      double dtotalaftertaxCost=((int) (totalaftertaxCost$))/(100.0); // casts after tax total to an integer then divideds by 100.0 then declares result as a double to reduce decimal points
      System.out.println("The total after tax cost was $"+dtotalaftertaxCost+" dollars"); // prints out total after tax cost
      
      
     
      
      
      
  }  
}