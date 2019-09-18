import java.util.Scanner;
//This program has choices for 4 different vacation packages. Main Function

//Determines final cost of each based on certain choices and people attending.
/* tripType = type of trip you wish to go on
 * peopleNum = number of people on trip
 * baseCharge = base charge of trip
 * climbNum = number of people climbing
 * campDays = number of days camping
 * climbChoice = if you want to climb
 * campChoice = if you want to rent camping equipment
 * totalP = total price of the trip
 * scubaChoice = if you want scuba lessons
 * scubaNum = number of people taking scuba lessons
 * lodgeChoice = choice between the 2 lodges
 * lodgeDays = days staying in a lodge
 */
public class lodgingTime {
    public static void main(String[] args) {
        char tripType;
        int test, peopleNum;

        Scanner tr = new Scanner (System.in);

        Menu();
        System.out.println("Enter your vacation choice");
        tripType = tr.next().charAt(0);

        System.out.println("Enter the number of people attending the trip");
        peopleNum = tr.nextInt();

        do {
            System.out.println("Enter 0 to stop the program, else enter 1");
            test = tr.nextInt();

            vacationChoice vac = new vacationChoice(peopleNum);

            switch(tripType) {
                case 'n': vac.Climbing();
                    break;
                case 'x': vac.Scuba();
                    break;
                case 'y': vac.Skydive();
                    break;
                case 'z': vac.Spelunk();
                    break;
            }//switch
        }

        while(test != 0);
    }
    private static void Menu() {
        System.out.println("\n\t 'n' for climbing");
        System.out.println("\n\t 'x' for scuba diving");
        System.out.println("\n\t 'y' for skydiving");
        System.out.println("\n\t 'z' for spelunking");
    }//menu
}//class

    
    