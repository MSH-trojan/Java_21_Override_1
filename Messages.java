package messages;

public class Messages {

	public static void main(String[] args) {
		
		Thought parked = new Thought();
		Advice dates = new Advice();
		
		parked.message();
		dates.message(); //overridden
		
	}
}
	
	class Thought{
		public void message() {
			
			System.out.println("I feel like I'm diagonally parked in a " + "parallel universe.");

			System.out.println();
		}
	}

	class Advice extends Thought {
		public void message() {
			
			System.out.println("Warning: Dates in calander are closer " + "than they appear.");
		
			System.out.println();
		}
	}
	