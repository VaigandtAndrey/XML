package com.epam.vaigandt.parser;

import com.epam.vaigandt.entity.Gem;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class STAXParser implements ParserFactory {
    private List<Gem> gems = null;
    private Gem gem = null;
    private String content = null;


    @Override
    public void getDatas() {
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream input = new FileInputStream("src/main/resources/Gems.xml");
            XMLStreamReader streamReader = inputFactory.createXMLStreamReader(input);
            while (streamReader.hasNext()) {
                int type = streamReader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT:
                        startElement(streamReader);

                        startElement(streamReader);
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        characters(streamReader);
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        break;
                }

            }


        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } catch (XMLStreamException exception) {
            System.out.println(exception.getMessage());
        }


    }

    private void characters(XMLStreamReader streamReader) {

        System.out.println(streamReader.getText().trim());

    }


    private void startElement(XMLStreamReader streamReader) throws XMLStreamException {


        String string = streamReader.getLocalName();


        if (streamReader.getLocalName().equalsIgnoreCase("gems")) {
            gems = new LinkedList<Gem>();
        } else if (streamReader.getLocalName().equalsIgnoreCase("gem")) {
            gem = new Gem();


        }

        // System.out.println(string);
    }


}
