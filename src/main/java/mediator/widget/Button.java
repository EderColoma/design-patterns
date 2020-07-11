package mediator.widget;

import lombok.Setter;
import mediator.director.DialogDirector;

public class Button extends Widget {

	@Setter
	protected String text;

	public Button(DialogDirector dialogDirector) {
		super(dialogDirector);
	}

	@Override
	public void handleEvent() {
		changed();
	}

}
