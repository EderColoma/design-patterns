package flyweight.music_player;

import static  java.util.Arrays.asList;
import java.util.List;

import flyweight.music_player.instruments.Piano;
import flyweight.music_player.notes.MusicNote;
import flyweight.music_player.notes.Note;

public class MusicPlayer {

	public static void main(String[] args) {

		MusicNote musicNote = new MusicNote();
		
		List<Note> song = asList(musicNote.getNote("do"), musicNote.getNote("re"), musicNote.getNote("mi"), musicNote.getNote("fa"), musicNote.getNote("fa"), musicNote.getNote("fa"));
		
		Piano piano = new Piano();
		piano.play(song);
		
	}

}
