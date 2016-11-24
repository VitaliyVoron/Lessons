package saxValidation;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyParser extends DefaultHandler{

	String thisElement;
	public void startDocument()
            throws SAXException{
		System.out.println("Start document");

	}

	@Override
	public void startElement(String namespaceURI, String localName,
							 String qName, Attributes atts) throws SAXException {
		thisElement = qName;
	}

	@Override
	public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException {
		thisElement = "";
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.println(thisElement);

	}

	public void endDocument()
            throws SAXException{
		System.out.println("End document");
	}
}
