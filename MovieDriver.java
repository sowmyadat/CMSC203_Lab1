import java.util.*; 

public class MovieDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
			
	}

}
