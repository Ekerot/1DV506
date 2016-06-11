package dekes03_lab3;

public class MultiDisplay {

	private int displayCount = 0;
	private String displayMessage = "";

	public void setDisplayMessage(String msg) { // attachar strängen som från
												// main på displayMessage
		displayMessage = msg;

	}

	public void setDisplayCount(int n) { // sätter antalet gånger som
											// meddelandet ska skrivas ut
		displayCount = n;

	}

	public void display() { // Skriver ut det medelande som
							// angets(displayMessage) och antalet
							// gånger(displayCount)

		if (displayCount == 3)
			for (int i = 0; i < 3; i++)
				System.out.println(displayMessage);

	}

	public void display(String msg, int n) { // Skriver ut det medelande som
												// angets(displayMessage) och
												// antalet gånger(displayCount)

		displayMessage = msg; // här kan ett nytt medelande initieras och antal
								// gånger
		if (n == 2)
			for (int j = 0; j < 2; j++)
				System.out.println(msg);

	}

	public String getDisplayMessage() {
		return displayMessage;

	}

	public int getDisplayCount() {
		return displayCount;

	}

}
