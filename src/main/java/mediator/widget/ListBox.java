package mediator.widget;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import mediator.director.DialogDirector;

public class ListBox extends Widget {

	@Getter
	protected List<String> values = new ArrayList<>();
	protected int selectedItem;

	public ListBox(DialogDirector dialogDirector) {
		super(dialogDirector);
	}

	public String getSelection(){
		return values.get(selectedItem);
	}

	@Override
	public void handleEvent() {
		changed();
	}

	public void addItem(String item) {
		values.add(item);
	}

	public void setSelected(int item) {
		selectedItem = item;
		handleEvent();
	}

}
