package oai_pmh;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class Titles {
	@Element
	public String title = "";

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
}
