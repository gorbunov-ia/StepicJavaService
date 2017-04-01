package resourceServer;

import resources.TestResource;

/**
 * Created by VIRUZ on 01.04.2017.
 */
public interface ResourceServerI {

    public void setResource(String path);

    public TestResource getResource();

}
