package com.jackmckenzie.bazos.scraper.repository;

import com.jackmckenzie.bazos.scraper.entity.MainCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
public class MainCategoryRepositoryTest {
    @Autowired
    private MainCategoryRepository mainCategoryRepository;

    @BeforeEach
    public void setUp() {
        mainCategoryRepository.deleteAll();
    }

    @Test
    public void testRepo() {
        for (int i = 0; i < 2; i++) {
            MainCategory mainCategory = new MainCategory();
            mainCategory.setUrl("https://cars.bazos.cz");
            mainCategory.setTitle("Cars");
            mainCategoryRepository.save(mainCategory);
        }

        assertThat(mainCategoryRepository.count()).isEqualTo(1);
    }
}
