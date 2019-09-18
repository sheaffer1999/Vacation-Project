import java.util.Scanner;
//carries out all the functions for homeprogram4. Object VacationChoice.
public class vacationChoice {
    int peopleNum, scubaNum, climbNum, campDays, lodgeDays;
    char scubaChoice, climbChoice, campChoice, lodgeChoice;
    double totalP, baseCharge;

    Scanner tr = new Scanner (System.in);

    public vacationChoice(int peopleNum) {
        this.peopleNum=peopleNum;
    }
    public void Climbing() {
        totalP = 0.0;

        baseCharge = 850*peopleNum;

        Scanner tr = new Scanner (System.in);
        System.out.println("Would you like to go climbing?");
        climbChoice = tr.next().charAt(0);
        if (climbChoice == 'y') {
            System.out.println("How many people are going climbing");
            climbNum = tr.nextInt();
            totalP = baseCharge + (climbNum*100);
        }
        else
            totalP = baseCharge;

        System.out.println("Would you like to rent camping equipment?");
        campChoice = tr.next().charAt(0);
        if (campChoice == 'y') {
            System.out.println("How many days will you be camping?");
            campDays = tr.nextInt();
            totalP = totalP + (60*peopleNum*campDays);
        }
        else
            totalP = totalP + 0;
        if (peopleNum > 4)
            totalP = totalP - (baseCharge*.15);
        else
            totalP = totalP + 0;
        System.out.println("The total cost of the trip is " + totalP);
    }//Climbing

    public void Scuba() {
        totalP = 0.0;
        baseCharge = 2500*peopleNum;

        Scanner tr = new Scanner (System.in);

        System.out.println("Will you be scuba diving?");
        scubaChoice = tr.next().charAt(0);
        if (scubaChoice == 'y') {
            System.out.println("How many people will need lessons?");
            scubaNum = tr.nextInt();
            totalP = baseCharge + (100*scubaNum);
        }
        else
            totalP = baseCharge;
        if (peopleNum > 4)
            totalP = totalP - (baseCharge*.15);
        else
            totalP = totalP + 0;
        System.out.println("The total cost of the trip is " + totalP);
    }//Scuba

    public void Skydive() {
        totalP = 0.0;
        baseCharge = 600*peopleNum;

        Scanner tr = new Scanner (System.in);

        System.out.println("Would you like to lodge in the wilderness lodge or luxury inn?");
        lodgeChoice = tr.next().charAt(0);
        if (lodgeChoice == 'w') {
            System.out.println("How many days?");
            lodgeDays = tr.nextInt();
            totalP = baseCharge + (peopleNum*85*lodgeDays);
        }
        else {
            System.out.println("How many days?");
            lodgeDays = tr.nextInt();
            totalP = baseCharge + (peopleNum*140*lodgeDays);
        }
        if (peopleNum > 4)
            totalP = totalP - (baseCharge*.15);
        else
            totalP = totalP + 0;
        System.out.println("The total cost of the trip is " + totalP);
    }//Skydive

    public void Spelunk() {
        totalP = 0.0;
        baseCharge = 1050*peopleNum;

        Scanner tr = new Scanner (System.in);

        System.out.println("Would you like to rent camping equipment?");
        campChoice = tr.next().charAt(0);
        if (campChoice == 'y') {
            System.out.println("How many days do you need equipment?");
            campDays = tr.nextInt();
            totalP = baseCharge + (peopleNum*80*campDays);
        }
        else
            totalP = baseCharge;
        if (peopleNum > 4)
            totalP = totalP - (baseCharge*.15);
        else
            totalP = totalP + 0;
        System.out.println("The total cost of the trip is " + totalP);
    }//Spelunk
}//main
