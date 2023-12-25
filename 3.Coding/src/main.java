import java.util.Scanner;

public class main {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(game); // Assumes Game has a toString method to display state

            System.out.println("Enter the character to move (OBSERVER, GRAPES, REDHOOD, WOLF):");
            String input = scanner.nextLine();

            try {
                Personaje character = Personaje.valueOf(input.toUpperCase());
                Member member = game.getMember(character);

                game.makeMove(member);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }  
}
