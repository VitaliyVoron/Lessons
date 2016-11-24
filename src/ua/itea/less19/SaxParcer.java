package ua.itea.less19;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by Администратор on 07.11.2016.
 */
public class SaxParcer extends DefaultHandler {

    private StringBuffer result;
    //boolean name = false;

    public SaxParcer() {
        result = new StringBuffer();
    }

    @Override
    public void startElement(String namespaceURI, String localName,
                             String qName, Attributes atts) throws SAXException {
        //if (qName.equals("name")) name = true;

    }


    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        String value ="";
        for (int i = 0; i < ch.length ; i++) {
            value+=ch[i];
        }
        if(value.length()!= 0){
            System.out.println(value);
        }

    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName)
            throws SAXException {
        //if(qName.equals("name")) name = false;
    }

    public String getResult() {
        return result.toString();
    }
}
