package com.ikaisays.muni.parsers;

import com.ikaisays.muni.domain.Route;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * General parser class that contains methods for parsing XML
 */
public class ApiResponseParser {


    /**
     * Method to parse this: http://webservices.nextbus.com/service/publicXMLFeed?command=routeList&a=sf-muni
     *
     * @param inputStream an {@link InputStream} containing the data we want to read
     * @return a {@link List} of {@link Route} objects
     */
    public List<Route> parseRouteXml(InputStream inputStream) throws IOException, SAXException {
        List<Route> routes = new ArrayList<Route>();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        try {
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(inputStream));
            NodeList nodeList = doc.getElementsByTagName("route");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                Element element = (Element) node;
                String tag = element.getAttribute("tag");
                String title = element.getAttribute("title");
                Route route = new Route(tag, title);
                routes.add(route);
            }

        } catch (ParserConfigurationException e) {
            // This should basically never happen
        }

        return routes;
    }


}
