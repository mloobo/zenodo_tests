package zenodo_tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import oai_pmh.OaiPmh;

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
			// Hay que modelar todo el xml en objetos, sino peta
			OaiPmh example = serializer.read(OaiPmh.class, source);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("PETO!!");
			e.printStackTrace();
		}
	}

}
