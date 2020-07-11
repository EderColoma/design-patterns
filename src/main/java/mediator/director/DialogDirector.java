package mediator.director;

import mediator.widget.Widget;

public abstract class DialogDirector {

	public abstract void widgetChanged(Widget widget);

	protected abstract void createWidgets();
}
