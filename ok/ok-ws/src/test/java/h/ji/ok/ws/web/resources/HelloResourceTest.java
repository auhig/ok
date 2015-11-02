package h.ji.ok.ws.web.resources;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import h.ji.ok.ws.App;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebIntegrationTest
public class HelloResourceTest {

    private RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testSay_normal() {
        String r = restTemplate.getForObject("http://127.0.0.1:8080/hello/say?name=tomcat", String.class);
        Assert.assertEquals("hello tomcat", r);
    }

}
