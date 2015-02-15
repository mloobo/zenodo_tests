package oai_pmh.listrecords;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root
public class ResumptionToken {

	@Attribute
	private int cursor = 0;
	
	@Attribute
	private int completeListSize = 0;
	
	@Attribute
	private String expirationDate = "";
	
	@Text
	private String value = "";
}
