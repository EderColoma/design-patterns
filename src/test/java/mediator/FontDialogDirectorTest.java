package mediator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mediator.director.FontDialogDirector;

public class FontDialogDirectorTest {

	@Test
	public void listItemChangedTest() {

		final FontDialogDirector fontDialogDirector = new FontDialogDirector();
		fontDialogDirector.getFontList().setSelected(2);

		assertEquals(fontDialogDirector.getFontList().getValues().get(2), fontDialogDirector.getFontName().getText());
	}

}
