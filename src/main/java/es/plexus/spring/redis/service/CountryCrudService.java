package es.plexus.spring.redis.service;

import es.plexus.spring.redis.Domain.Country;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface CountryCrudService {

    Iterable<Country> getAllCountries ();

    Optional<Country> getCountryById (Long id);

    void createBunchCountries (List<Country> countries) throws IOException;

    void createCountry (Country country);

    Optional<Country> updateCountry (Country country);

    void deleteCountry (String id);
}
