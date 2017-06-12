import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double sngLength = 0;
        double sngWidth = 0;
        double sngArea = 0;
        double sngPerimeter = 0;


        System.out.println("Welcome to Grand Circus Room Detail Generator!");

        System.out.println("Enter room dimensions of The Snug Room, \nusing a decimal point to define FEET.INCHES for each measure."
                + "\n" + "Begin by entering The Snug Room LENGTH:");
        sngLength = scnr.nextDouble();


        System.out.println("Now enter The Snug Room WIDTH:");
        sngWidth = scnr.nextDouble();

        sngArea = sngLength * sngWidth; //determine Area
        sngPerimeter = 2 * (sngLength + sngWidth); // determine perimeter
        System.out.println("The Snug Room Area is: " + sngArea + "\nAnd the Perimeter is: " + sngPerimeter);


        System.out.println("Would you like to continue?");
        if(scnr.next().equalsIgnoreCase("y")||scnr.next().equalsIgnoreCase("yes")) {
            System.out.println("Great! Let's find out about the Penthouse next.");
        }
        else if(scnr.next().equalsIgnoreCase("n")||scnr.next().equalsIgnoreCase("no")) {
            System.out.println("Ok. Bye bye.");
        }
        else {
            System.out.println("Invalid character. Bye.");
        }


        // Penthouse dimensions

        double pent_hsLength = 0;
        double pent_hsWidth = 0;
        double pentArea = 0;
        double pentPerimeter = 0;
        System.out.println("Begin by entering The Penthouse Suite LENGTH:");
        pent_hsLength = scnr.nextDouble();

        System.out.println("Now enter The Penthouse Suite WIDTH:");
        pent_hsWidth = scnr.nextDouble();

        pentArea = pent_hsLength * pent_hsWidth; //determine Area
        // fix long decimal
        pentArea = pentArea * 100;
        pentArea = Math.round(pentArea);
        pentArea = pentArea / 100;

        pentPerimeter = 2 * (pent_hsLength + pent_hsWidth); // determine perimeter
        System.out.println("The Penthouse Suite Area is: " + pentArea + ".");
        System.out.println("And the Perimeter is: " + pentPerimeter + "." +
                "\nThanks for playing!");

}
}
