package resourceServer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import resources.TestResource;
import sax.ReadXMLFileSAX;

/**
 * Created by VIRUZ on 01.04.2017.
 */
public class ResourceServer implements ResourceServerI {
    static final Logger logger = LogManager.getLogger(ResourceServer.class.getName());
    private TestResource resource;

    @Override
    public void setResource(String path) {
        //System.out.println("String: " + path);
        logger.info("String: " + path);
        TestResource res = (TestResource) ReadXMLFileSAX.readXML(path);
        System.out.println(res);
        resource = res;
    }

    @Override
    public TestResource getResource() {
        return resource;
    }

}
