package tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import oai_pmh.OaiPmh;
import oai_pmh.listrecords.Record;

import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class OaiTest {

	private String xml = "example.xml";
	private Serializer serializer = new Persister();
	private OaiPmh example;

	/**
	 * 
	 */
	public OaiTest() {
		try {
			example = serializer.read(OaiPmh.class, new File(xml));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthListRecords() {
		assertEquals("List length not valid", 10, example.getListRecords()
				.getList().size());
	}

	@Test
	public void testGetIdentifier(){
		String id_exp = "10.5281/ZENODO.1239";
		
		Record r = example.getListRecords().getList().get(0);
		String id = r.getMetadata().getOai_datacite().getPayload().getResource().getIdentifier().getValue();
		
		assertEquals("The identifier of first record is not valid", id_exp, id);
	}
}
