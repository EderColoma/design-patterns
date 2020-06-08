package flyweight.musicPlayer.notes;

import java.util.HashMap;
import java.util.Map;

public class MusicNote {
	
	private static Map<String, Note> notes = new HashMap<>();

	static {
		notes.put("do", new Do());
		notes.put("re", new Re());
		notes.put("mi", new Mi());
		notes.put("fa", new Fa());
	}
	
	public Note getNote(String noteName) {
		return notes.get(noteName);
	}

}