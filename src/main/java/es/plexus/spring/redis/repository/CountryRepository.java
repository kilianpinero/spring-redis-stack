package es.plexus.spring.redis.repository;

import com.redis.om.spring.repository.RedisDocumentRepository;
import es.plexus.spring.redis.Domain.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends RedisDocumentRepository<Country, String> {
}
