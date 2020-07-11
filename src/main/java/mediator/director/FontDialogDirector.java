package mediator.director;

import lombok.Getter;
import lombok.Setter;
import mediator.widget.EntryField;
import mediator.widget.ListBox;
import mediator.widget.Widget;

@Getter
@Setter
public class FontDialogDirector extends DialogDirector{

	private ListBox fontList;
	private EntryField fontName;

	public FontDialogDirector(){
		createWidgets();
	}

	@Override
	public void widgetChanged(Widget widget) {
		if(widget.equals(fontList)) {
			fontName.setText(fontList.getSelection());
		}
	}

	@Override
	protected void createWidgets() {
		fontList = new ListBox(this);
		fontName = new EntryField(this);

		fontList.addItem("Arial");
		fontList.addItem("City Blueprint");
		fontList.addItem("Times New Roman");
		fontList.addItem("Verdana");
	}

}
