package test.com.ikaisays.muni.parsers;

import com.ikaisays.muni.domain.Route;
import com.ikaisays.muni.parsers.ApiResponseParser;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * ApiResponseParser Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/29/2011</pre>
 */
public class ApiResponseParserTest extends TestCase {
    public ApiResponseParserTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: parseRouteXml(InputStream inputStream)
     */
    public void testParseRouteXml() throws Exception {
        // Taken from http://webservices.nextbus.com/service/publicXMLFeed?command=routeList&a=sf-muni
        // Shrunken for test readability
        String xml = "<body copyright=\"All data copyright San Francisco Muni 2011.\">\n" +
                "<route tag=\"F\" title=\"F-Market &amp; Wharves\"/>\n" +
                "<route tag=\"J\" title=\"J-Church\"/>\n" +
                "</body>";
        ApiResponseParser parser = new ApiResponseParser();

        InputStream stream = new ByteArrayInputStream(xml.getBytes());
        List<Route> routes = parser.parseRouteXml(stream);
        assertEquals(2, routes.size());

        Route f = routes.get(0);
        Route j = routes.get(1);
        assertEquals("First element should have a tag F", "F", f.getTag());
        assertEquals("F-Market & Wharves", f.getTitle());

        assertEquals("J", j.getTag());
        assertEquals("J-Church", j.getTitle());

    }


    public static Test suite() {
        return new TestSuite(ApiResponseParserTest.class);
    }
}
