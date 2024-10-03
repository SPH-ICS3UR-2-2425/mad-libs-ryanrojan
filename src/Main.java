import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Ryan Rojan
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a person's name:");
		String name = in.nextLine();
		System.out.println ("Enter the name of a kingdom:");
		String kingdom = in.nextLine();
		int knights;
		do {
			System.out.println("Enter the number of knights (between 1-10):");
			knights=in.nextInt();
		}while (knights<1 || knights >10);
		in.nextLine();
		System.out.println("Enter the name of a mythical creature:");
		String mythicalcreature = in.nextLine();
		System.out.println("Enter a fictional character:");
		String fiction = in.nextLine();
		System.out.println("Enter a hero from either Marvel or DC:");
		String hero = in.nextLine();
		System.out.println("Enter a percentage:");
		double percentage = in.nextDouble();
		System.out.println("Enter a finisher line (Combat):");
		String line = in.nextLine();
		System.out.println("Enter a farewell:");
		String farewell = in.nextLine();
		System.out.println("Enter an emotion");
		String emotion = in.nextLine();

		System.out.println(name+ "was playing some video games when" +name+ "was transported to another world.");
		System.out.println(name+ "found themselves in an unknown kingdom called" +kingdom+ ".");
		System.out.println("Then suddenly" +knights+ "knights appeared out of nowhere and told that they have to fight a mythical beast.");
		System.out.println("This mythical beast was called the" +mythicalcreature+ "and it was bringing chaos to this world.");
		System.out.println("The knights told" +name+ "that they needed some allies so they had to journey to find these heroes");
		System.out.println("Eventually they found the heroes who were" +fiction+ "and" +hero+ "who decided to join them on their quest");
		System.out.println("With these heroes by their side they had a" +percentage+ "% chance to beat them.");
		System.out.println("They eventually beat the" +mythicalcreature+ "and they even said a finsiher line which was" +line+ ".");
		System.out.println("Eventually" +name+ "had to bid his farewell so he said" +farewell+ "and returned to his world.");
		System.out.println("Looking back at everything that had happened" +name+ "was" +emotion+ ".");
		System.out.println("THE END");
	}


}
