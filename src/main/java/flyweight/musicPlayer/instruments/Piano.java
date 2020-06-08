package flyweight.musicPlayer.instruments;

import java.util.List;

import org.jfugue.player.Player;

import flyweight.musicPlayer.notes.Note;

public class Piano {
	
	public void play(List<Note> song) {
		Player player = new Player();
		
		StringBuilder songInNotes = new StringBuilder();
		for(Note note : song) {
			songInNotes.append(note.getSymbol() + " ");
		}
		
		player.play(songInNotes.toString());
	}

}
