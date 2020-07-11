package flyweight.musicPlayer;

import static  java.util.Arrays.asList;
import java.util.List;

import flyweight.musicPlayer.instruments.Piano;
import flyweight.musicPlayer.notes.MusicNote;
import flyweight.musicPlayer.notes.Note;

public class MusicPlayer {

	public static void main(String[] args) {

		MusicNote musicNote = new MusicNote();
		
		List<Note> song = asList(musicNote.getNote("do"), musicNote.getNote("re"), musicNote.getNote("mi"), musicNote.getNote("fa"), musicNote.getNote("fa"), musicNote.getNote("fa"));
		
		Piano piano = new Piano();
		piano.play(song);
		
	}

}
