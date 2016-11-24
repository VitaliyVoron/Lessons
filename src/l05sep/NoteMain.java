package l05sep;

public class NoteMain {

	public static void main(String[] args) {
		Notebook note=new Notebook();
		Software soft=new Software();
		note.addSoft(soft);
		System.out.println(note.getSoftName());
		NoteOwner owner=new NoteOwner();
		owner.addNote(note);
		System.out.println(owner.getSoft());
	}

}
