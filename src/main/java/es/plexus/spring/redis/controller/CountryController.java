package es.plexus.spring.redis.controller;

import es.plexus.spring.redis.Domain.Country;
import es.plexus.spring.redis.service.CountryCrudService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryCrudService service;

    private static final Logger log = LogManager.getLogger(CountryController.class);

    @GetMapping
    public Iterable<Country> getAllCountries () {
        return service.getAllCountries();
    }

    @GetMapping("/{id}")
    public Optional<Country> getCountryById (@PathVariable Long id) {
        return service.getCountryById(id);
    }

    @PostMapping("/all")
    public void createBunchCountries (@RequestBody List<Country> countries) throws IOException {
        service.createBunchCountries(countries);
    }

    @PostMapping
    public void createCountry (@RequestBody Country country) {
        service.createCountry(country);
    }

    @PutMapping
    public Optional<Country> updateCountry (@RequestBody Country country) {
        return service.updateCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry (@PathVariable String id) {
        service.deleteCountry(id);
    }
}
