package es.plexus.spring.redis.Domain;

import com.redis.om.spring.annotations.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Document
public class Country implements Serializable {

    @Id
    @Indexed
    private Long id;
    //    @Searchable
    private String name;

    public Country (Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
