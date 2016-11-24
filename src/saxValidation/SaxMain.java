package saxValidation;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxMain {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		MyParser mp=new MyParser();
		SAXParserFactory sf=SAXParserFactory.newInstance();
		SAXParser parser=sf.newSAXParser();
		parser.parse(new File("dog.xml"), mp);
	}

}
