package dekes03_lab3;

public class AlarmClockMain {

	public static void main(String[] args) {

		AlarmClock ac = new AlarmClock(23, 48);

		ac.displayTime(); // anropar displayTime för att visa den nuvarande
							// tiden

		ac.setAlarm(06, 15); // sätter tiden alarmet ska gå
		ac.displayAlarmTime(); // anropar för att visa tiden för alarmet

		for (int i = 0; i < 500; i++) { // får tiden att gå 500minuter
			ac.timeTick();
		}
		ac.displayTime(); // anropar för att visa nya tiden efter att det gått
							// 500minuter
	}

}
