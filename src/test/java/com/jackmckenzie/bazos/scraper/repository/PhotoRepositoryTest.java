package com.jackmckenzie.bazos.scraper.repository;

import com.jackmckenzie.bazos.scraper.entity.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class PhotoRepositoryTest {
    @Autowired
    private PhotoRepository photoRepository;

    @BeforeEach
    public void setUp() {
        photoRepository.deleteAll();
    }

    @Test
    public void testRepo() {
        for (int i = 0; i < 2; i++) {
            Photo photo = new Photo();
            photo.setUrl("https://bazos.cz/photos/123.jpg");
            photo.setContent("12345".getBytes());
            photoRepository.save(photo);
        }

        assertThat(photoRepository.count()).isEqualTo(1);
    }
}
