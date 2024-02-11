/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthyccbalance;

/**
 *
 * @author Administrator
 */
public class MonthyCCBalance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //declaring variables
    double creditCardBalance = 5000;
    double interestRate = 0.17;
    double months = 1;
    double finalBalance;
    //doing the math
    finalBalance = creditCardBalance * interestRate;
    //outputting the first balance
    System.out.println("Your credit card balance for the first month is " + finalBalance);
    //doing more math
   months = months + 1; 
   finalBalance = finalBalance * 2;
   System.out.println("Your credit card balance for the second month is " + finalBalance);
    }
    
}
