package resourceServer;

import resources.TestResource;

/**
 * Created by VIRUZ on 01.04.2017.
 */

public class ResourceServerController implements ResourceServerControllerMBean {

    private final ResourceServerI resourceServer;

    public ResourceServerController(ResourceServerI resourceServer) {
        this.resourceServer = resourceServer;
    }

    @Override
    public String getName() {
        TestResource res = resourceServer.getResource();
        if (res != null) {
            return res.getName();
        } else {
            return null;
        }
    }

    @Override
    public int getAge() {
        TestResource res = resourceServer.getResource();
        if (res != null) {
            return res.getAge();
        } else {
            return 0;
        }
    }
}
