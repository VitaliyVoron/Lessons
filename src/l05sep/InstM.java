package l05sep;

public class InstM {

	public static void main(String[] args) {
		Store store=new Store();
		store.addInstrument(new Instrument());
		store.getInstruments();
		Buyer buyer=new Buyer();
		buyer.buyInstrument(store.sellInstrument(0));
		System.out.println("Buyer");
		buyer.instrument.getName();
		System.out.println("Store");
		store.getInstruments();
	}

}
