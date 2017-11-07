package ch07.x01ExpectedExceptionRule_junit4_wikiLoesung;

import static org.hamcrest.core.StringStartsWith.startsWith;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HasExpectedException {
	  @Rule
	  public final ExpectedException thrown = ExpectedException.none();

	  @Test
	  public void throwsNothing() {

	  }

	  @Test
	  public void throwsNullPointerException() {
	    thrown.expect(NullPointerException.class);
	    throw new NullPointerException();
	  }

	  @Test
	  public void throwsNullPointerExceptionWithMessage() {
	    thrown.expect(NullPointerException.class);
	    thrown.expectMessage("happened?");
	    thrown.expectMessage(startsWith("What"));
	    throw new NullPointerException("What happened?");
	  }
	}
