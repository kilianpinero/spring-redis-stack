package es.plexus.spring.redis.service;

import es.plexus.spring.redis.Domain.Country;
import es.plexus.spring.redis.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CountryCrudServiceImpl implements CountryCrudService {
    @Autowired
    private final CountryRepository countryRepository;

    public CountryCrudServiceImpl (CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Iterable<Country> getAllCountries () {
        return countryRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(Country::getId))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Country> getCountryById (Long id) {
        return countryRepository.findById(id.toString());
    }

    @Override
    public void createBunchCountries (List<Country> countries) throws IOException {
        for (Country country : countries) {
            countryRepository.save(country);
        }
    }

    @Override
    public void createCountry (Country country) {
        countryRepository.save(country);
    }

    @Override
    public Optional<Country> updateCountry (Country country) {
        Long id = country.getId();
        if (countryRepository.existsById(id.toString())) {
            country.setId(id);
            return Optional.of(countryRepository.save(country));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteCountry (String id) {
        countryRepository.deleteById(id);
    }


}
