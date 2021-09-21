import java.util.Scanner;
import java.util.Random;

public class Game
{
public static void main(String[] args)
{
Scanner st = new Scanner(System.in);
System.out.println("Enter 0 for rock , 1 for paper , 2 for scisser  ");
int userinput  = st.nextInt();
Random random = new Random();
int pcinput = random.nextInt(3);
if(userinput == pcinput)
{
System.out.println("Draw");

}
else if(userinput == 0 && pcinput==2 || userinput == 1 && pcinput == 0 || userinput == 2 && pcinput == 1 )
{
System.out.println("You Win");

}
else
{
System.out.println("Computer win");
}
}
}
