package com.epam.vaigandt.parser;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

public interface ParserFactory {
    public void getDatas() throws ParserConfigurationException, SAXException;
}
