import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for their party affiliation
        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        char party = scanner.next().charAt(0);

        // Determine the response based on the user's input
        switch (party) {
            case 'D':
            case 'd':
                System.out.println("You get a Democratic Donkey.");
                break;
            case 'R':
            case 'r':
                System.out.println("You get a Republican Elephant.");
                break;
            case 'I':
            case 'i':
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
                break;
        }

        scanner.close();
    }
}
