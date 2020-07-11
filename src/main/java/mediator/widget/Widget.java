package mediator.widget;

import mediator.director.DialogDirector;

public abstract class Widget {

	protected final DialogDirector dialogDirector;

	Widget(DialogDirector dialogDirector){
		this.dialogDirector = dialogDirector;
	}

	public void changed() {
		dialogDirector.widgetChanged(this);
	}

	public abstract void handleEvent();

}
