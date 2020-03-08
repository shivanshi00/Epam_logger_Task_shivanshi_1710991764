import java.io.IOException;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task4 {

    private static Logger logger = LogManager.getLogger(InterestCalc.class);


    public static void main(String args[]) throws IOException {
        Scanner s =new Scanner(System.in);
         logger.info("Enter 1 for calculating SI or CI");
         logger.info("\nEnter 2 to calculate the cost of construction");
         logger.info("\nEnter 3 to exit");
        int choose=s.nextInt();
        switch (choose){
            case 1:
                InterestCalc i=new InterestCalc();
                i.calculate();
                break;
            case 2:
                Construction c=new Construction();
                c.calculate();
                break;
            case 3:
                System.exit(0);
            default:
                 logger.error("invalid choice");
        }
    }
}
