package zyx.main.config;

import zyx.main.resources.GeonamesProxyResource;
import zyx.main.resources.TestJsonResource;
import zyx.main.resources.WordsProxyResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
public class Config {

    @Bean
    public GeonamesProxyResource geonamesProxyResource() {
        return new GeonamesProxyResource();
    }

    @Bean
    public WordsProxyResource wordsProxyResource() {
        return new WordsProxyResource();
    }

    @Bean
    public TestJsonResource testJsonResource() {
        return new TestJsonResource();
    }
}
