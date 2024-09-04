package com.jackmckenzie.bazos.scraper.repository;

import com.jackmckenzie.bazos.scraper.entity.Advertisement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class AdvertisementRepositoryTest {
    @Autowired
    private AdvertisementRepository advertisementRepository;

    @BeforeEach
    public void setUp() {
        advertisementRepository.deleteAll();
    }

    @Test
    public void testRepo() {
        for (int i = 0; i < 2; i++) {
            Advertisement testAd = new Advertisement();
            testAd.setId(1);
            testAd.setUrl("https://pc.bazos.cz/inzerat/186275706/xfx-rx-470-8gb-zahrajete-si-nejnovejsi-hry-i-ve-2024.php");
            testAd.setTitle("Sample title");
            testAd.setPrice("1 000 Kč");
            testAd.setDescription("Sample description...");
            advertisementRepository.save(testAd);
        }

        assertThat(advertisementRepository.count()).isEqualTo(1);

        Optional<Advertisement> result = advertisementRepository.findById(1);
        assertThat(result.isPresent()).isTrue();
        Advertisement persistedTestAd = result.get();

        assertThat(persistedTestAd.getId()).isEqualTo(1);
        assertThat(persistedTestAd.getUrl()).isEqualTo("https://pc.bazos.cz/inzerat/186275706/xfx-rx-470-8gb-zahrajete-si-nejnovejsi-hry-i-ve-2024.php");
        assertThat(persistedTestAd.getTitle()).isEqualTo("Sample title");
        assertThat(persistedTestAd.getPrice()).isEqualTo(1000f);
        assertThat(persistedTestAd.getDescription()).isEqualTo("Sample description...");
    }
}
