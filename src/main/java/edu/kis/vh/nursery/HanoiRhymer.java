package edu.kis.vh.nursery;
// wiersze 5, 12, 14, 15 i brak nowej lini po wierszu 16 aby zachować spójność z resztą klas
public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}

}
