package com.epam.vaigandt.parser;

import com.epam.vaigandt.entity.Gem;
import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;

public class SAXHandler extends DefaultHandler {
    private List<Gem> gems = null;
    private Gem gem = null;

    public List<Gem> getGems() {
        if (gems == null) {
            gems = new LinkedList<Gem>();
        }
        return this.gems;
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("gems")) {
            gems = new LinkedList<Gem>();
            System.out.println("Start element");
        }
    }


    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("gems")) {
            gems.add(gem);
            System.out.println("End element");
        }
    }


    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Character" + new String(ch, start, length));
    }
}
