package es.plexus.spring.redis;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRedisDocumentRepositories(basePackages = "es.plexus.spring.redis.*")
@SpringBootApplication
public class SpringRedisApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringRedisApplication.class, args);
    }

}
