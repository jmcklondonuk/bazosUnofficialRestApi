package com.jackmckenzie.bazos.scraper.repository;

import com.jackmckenzie.bazos.scraper.entity.SubCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SubCategoryRepositoryTest {
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @BeforeEach
    public void setUp() {
        subCategoryRepository.deleteAll();
    }

    @Test
    public void testRepo() {
        for (int i = 0; i < 2; i++) {
            SubCategory subCategory = new SubCategory();
            subCategory.setTitle("Wheels");
            subCategory.setUrl("https://wheels.cars.bazos.cz");
            subCategoryRepository.save(subCategory);
        }

        assertThat(subCategoryRepository.count()).isEqualTo(1);
    }
}
