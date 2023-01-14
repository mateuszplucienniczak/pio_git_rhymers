package edu.kis.vh.nursery.factory;
// kombinacja klawiszy alt + <- lub alt + -> w przypadku otwarcia wielu kart z klasami przełącza nas jedną kartę w lewo bądź prawo
import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	public defaultCountingOutRhymer GetStandardRhymer();

	public defaultCountingOutRhymer GetFalseRhymer();

	public defaultCountingOutRhymer GetFIFORhymer();

	public defaultCountingOutRhymer GetHanoiRhymer();

}
