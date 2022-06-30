import java.util.Scanner; 

public class MovieDriverLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean done = true;
		
		while(done) {
			Movie newMovie = new Movie();
			String userin, decision;
			int Integeruserin;
			
			System.out.println("Enter the title of the movie: ");
			userin = input.nextLine();
			
			newMovie.setTitle(userin);
			
			System.out.println("Enter the movie's rating: ");
			userin = input.next();

			newMovie.setRating(userin);
			
			System.out.println("Enter number of tickets sold at a (unnamed) theater: ");
			Integeruserin = input.nextInt();
			
			newMovie.setSoldTickets(Integeruserin);
			
			System.out.println(newMovie.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			decision = input.next();
			
			if(decision.equals("n")) {
				done = false;
			}
			input.nextLine();
		}
	}

}
