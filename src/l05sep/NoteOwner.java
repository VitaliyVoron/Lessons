package l05sep;

public class NoteOwner {
	private Notebook note;
	void addNote(Notebook note){
		this.note=note;
	}
	String getSoft(){
		return note.getSoftName();
	}
	
}
