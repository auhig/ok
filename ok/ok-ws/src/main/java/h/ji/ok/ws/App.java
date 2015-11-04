package h.ji.ok.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setShowBanner(false);
        app.run(args);
    }

    //    @Bean
    //    public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
    //        PersistenceExceptionTranslationPostProcessor p = new PersistenceExceptionTranslationPostProcessor();
    //        p.setProxyTargetClass(true);
    //        return p;
    //    }

}
