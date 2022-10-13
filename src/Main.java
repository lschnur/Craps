import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        boolean playing = true;
        do {


            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            System.out.println("You roll the dice, You roll a " + die1 + " and you got a " + die2);
            int crapsRoll = die1 + die2;

            if (crapsRoll == 3 || crapsRoll== 2 || crapsRoll== 12)
            {
                System.out.println("Sorry you crapped out");
                playing = true;
            }
            else if(crapsRoll==7 || crapsRoll ==11)
            {
                System.out.println("You got a natural you win");
                playing = true;
            }
            else
            {
                playing = false;
                System.out.println("roll again");

            }

            int point =crapsRoll;
            System.out.println("Your scored "+ point+" Points");
        }while(!playing);
    }
}