package zenodo_tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;

import oai_pmh.OaiPmh;
import oai_pmh.listrecords.Record;
import oai_pmh.listrecords.record.metadata.oaidatacite.payload.Resource;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

// BETA TESTING STAGE
public class Main {

	public static void main(String[] args) {
		String xmlUrl = "https://zenodo.org/oai2d?verb=ListRecords&metadataPrefix=oai_datacite3&set=openaire_data";
		Serializer serializer = new Persister();

		try {
			URL sourcerUrl = new URL(xmlUrl);
	        BufferedReader source = new BufferedReader(
	        new InputStreamReader(sourcerUrl.openStream()));
			OaiPmh example = serializer.read(OaiPmh.class, source);
			
			System.out.println("Publications found: " + example.getListRecords().getList().size());
			
			System.out.println("TITLES FOUNDED");
			Iterator<Record> records = example.getListRecords().getList().iterator();
			while (records.hasNext()){
				Record r = records.next();
				Resource resource = r.getMetadata().getOai_datacite().getPayload().getResource();
				
				System.out.println(resource.getTitles());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("PETO!!");
			e.printStackTrace();
		}
	}

}
