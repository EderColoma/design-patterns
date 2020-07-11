package mediator.widget;

import lombok.Getter;
import lombok.Setter;
import mediator.director.DialogDirector;

@Setter
@Getter
public class EntryField extends Widget {

	protected String text;

	public EntryField(DialogDirector dialogDirector) {
		super(dialogDirector);
	}

	@Override
	public void handleEvent() {
		changed();
	}

}
