import java.io.Serializable;
import java.util.ArrayList;


public class GameInfo implements Serializable {
			
	private static final long serialVersionUID = 1L;
		
	//Stores who won the round
	String roundWinner = "N/A";
	
	//Stores who won the game
	String gameWinner = "N/A";
		
	//Store if either player won 
	boolean winnerFound = false;
		
	//Store if what is sent is 
	boolean isMessage = false;
	
	//Check if any player disconnected
	boolean isDisconnect = false;
	
	//Store which player disconnected
	int disconnectID;
			
	//Store the message
	String message = "N/A";
		
	//Store which player it is
	int playerID;
		
	int playerCount = 0;
		
	//Variable to store if the players has played
	//boolean p1Played = false;
	//boolean p2Played = false;
	
	//Check if the server UI should be updated
	boolean updateServerUI = false;
		
	//Check if the client UI should be updated
	boolean updateClientUI = false;
	
	//Store if the player just connected
	boolean newPlayer = false;
	
	//Arraylist to store player action
	ArrayList<PlayerInfo> playerinfo = new ArrayList<PlayerInfo>(); 
	
	//Determine if what is sent is a challenge
	boolean isChallenge = false;
		
	//Determine if what is sent is a play selection
	boolean isPlayed = false;
	
	//Reset the isPlayed of the player
	boolean resetIsPlayed = false;
		
	//Determine who sent the Object
	int sentBy;
	
	//Determine who the challenge is for
	int sentFor;
	
	//Check if the challenge was accepted
	boolean challengeAccepted = false;
		
	//Store the player information
	class PlayerInfo implements Serializable {
		
		private static final long serialVersionUID = 1L;
	
		boolean hasPlayed = false;
		boolean isPlaying = false;
		int clientID;
		String playerPlayed = "N/A";
		
		//Constructor
		PlayerInfo(int clientID) {
			this.clientID = clientID;
		}
	}
	
}












