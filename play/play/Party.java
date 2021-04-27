package play;

public class Party {
	public void puffBall() {
		class Ball{
			public void puff() {
				System.out.println("气球膨胀了");
			}
		}
		new Ball().puff();
	}
}
