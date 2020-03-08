import java.io.IOException;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class InterestCalc {
    private boolean exit;
    private float p, r, t, interest, amount;
    InterestCalc(){
        exit=false;
        p=r=t=interest=amount=0;
    }


    private static Logger logger = LogManager.getLogger(InterestCalc.class);
    public void calculate() throws IOException {
        Scanner s = new Scanner(System.in);
        CalcInterest ic = new CalcInterest();
        while (exit == false) {
             logger.info("\nEnter Principal, Rate and Time period(in years): ");
            p = s.nextFloat();
            r = s.nextFloat();
            t = s.nextFloat();
             logger.info("\n**** MENU ****\n" );
             logger.info("1. Calculate Simple Interest\n" );
             logger.info("2. Calculate Compound Interest\n");
             logger.info("3. Exit\n" );
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    interest = ic.calculateSI(p, r, t);
                     logger.info(("The simple interest on principal Rs. " + p
                            + " @ " + r + "% for " + t
                            + " years is Rs." + interest) );
                    amount = p + interest;
                     logger.info(("\nThe total amount to be paid is Rs." + amount) );
                    break;
                case 2:
                    interest = ic.calculateCI(p, r, t);
                     logger.info(("The Compoud interest on principal Rs. " + p
                            + " @ " + r + "% for " + t
                            + " years is Rs." + interest) );
                    amount = p + interest;
                     logger.info(("\nThe total amount to be paid is Rs." + amount) );
                    break;
                case 3:
                     logger.info("Program Terminating ..." );
                    exit = true;
                    break;
                default:
                     logger.info("enter valid input" );
            }
        }
    }

}

