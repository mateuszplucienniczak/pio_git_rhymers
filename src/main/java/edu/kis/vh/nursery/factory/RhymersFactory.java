package edu.kis.vh.nursery.factory;
// kombinacja klawiszy alt + <- lub alt + -> w przypadku otwarcia wielu kart z klasami przełącza nas jedną kartę w lewo bądź prawo
import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

	public DefaultCountingOutRhymer GetStandardRhymer();

	public DefaultCountingOutRhymer GetFalseRhymer();

	public DefaultCountingOutRhymer GetFIFORhymer();

	public DefaultCountingOutRhymer GetHanoiRhymer();

}
