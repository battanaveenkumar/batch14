package zyx.main.resources;

import javax.annotation.PostConstruct;

import com.indoqa.boot.json.resources.AbstractJsonResourcesBase;

public class TestJsonResource extends AbstractJsonResourcesBase {

    @PostConstruct
    public void mount() {
        this.get("/test", (req, res) -> new TestObject("Indoqa Quickstart Boot"));
    }

    public static class TestObject {

        private String name;

        public TestObject(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}
