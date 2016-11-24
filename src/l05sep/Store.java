package l05sep;

public class Store {
	Instrument[] instruments=new Instrument[100]; 
	void addInstrument(Instrument instrument){
		for(int i=0;i<instruments.length;i++){
			if(instruments[i]==null){
				instruments[i]=instrument;
				break;
			}
		}
	}
	void getInstruments(){
		for(int i=0;i<instruments.length;i++){
			if(instruments[i]!=null){
				instruments[i].getName();
			}else{
				break;
			}
		}
	}
	Instrument sellInstrument(int index){
		Instrument instrumentToSell=instruments[index];
		instruments[index]=null;
		return instrumentToSell;
	}
}
