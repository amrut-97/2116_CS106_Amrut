
public class Batsman {
	
	String name;
	int numOfGamesPlayed, numOfCenturies, fiftiesScored;
	float avgRunsScored;
	
	Batsman(){
		
	}
	
	Batsman(String name,int numOfGamesPlayed,int numOfCenturies, int fiftiesScored, float avgRunsScored){
		this.name = name;
		this.numOfGamesPlayed  = numOfGamesPlayed;
		this.numOfCenturies = numOfCenturies;
		this.fiftiesScored = fiftiesScored;
		this.avgRunsScored = avgRunsScored;
	}
	
	void displayResults(){
		System.out.println("=====Start of Batsman Results====\n");
		System.out.println("Name of Batsman: " + name);
		System.out.println("Number of games played: " + numOfGamesPlayed);
		System.out.println("Number of centuries scored: " + numOfCenturies);
		System.out.println("Fifties scored: " + fiftiesScored);
		
		System.out.println("\n=====End of Batsman Results====\n");
	}
}
