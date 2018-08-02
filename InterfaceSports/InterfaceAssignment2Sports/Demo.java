package InterfaceAssignment2Sports;

public class Demo {
	//perform method is used to call play method according to the type of object passed
	static void perform(Game game) {
		game.play();
	}
	public static void main(String[] args) {
		Cricket cricket=new Cricket();
		perform(cricket);//print 'Cricket'
		Tennis tennis=new Tennis();
		perform(tennis);//print 'Tennis'
		FootBall football=new FootBall();
		perform(football);//print 'Football'
	}
}

