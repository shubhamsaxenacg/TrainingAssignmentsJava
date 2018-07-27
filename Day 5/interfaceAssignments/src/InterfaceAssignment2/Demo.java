package InterfaceAssignment2;

public class Demo {
	
	static void perform(Game game) {
		game.play();
	}
	
	public static void main(String[] args) {
		
		Cricket cricket=new Cricket();
		perform(cricket);
		Tennis tennis=new Tennis();
		perform(tennis);
		FootBall football=new FootBall();
		perform(football);
		
	}
}