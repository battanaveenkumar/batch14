package zyx.main.resources;

import javax.annotation.PostConstruct;

import com.indoqa.boot.html.react.AbstractCreateReactAppResourceBase;

public class FrontendResource extends AbstractCreateReactAppResourceBase {

    private static final String FRONTEND_FILESYSTEM_LOCATION = "../xyz-frontend/build/";
    private static final String FRONTEND_CLASSPATH_LOCATION = "/xyz-frontend";

    @PostConstruct
    public void mount() {
        this.html(FRONTEND_CLASSPATH_LOCATION, FRONTEND_FILESYSTEM_LOCATION);
    }
}
