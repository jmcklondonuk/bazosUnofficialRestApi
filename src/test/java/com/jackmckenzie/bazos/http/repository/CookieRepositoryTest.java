package com.jackmckenzie.bazos.http.repository;

import com.jackmckenzie.bazos.http.entity.Cookie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CookieRepositoryTest {
    @Autowired
    private CookieRepository cookieRepository;

    @BeforeEach
    public void setUp() {
        cookieRepository.deleteAll();
    }

    @Test
    public void testPrimaryKey() {
        Cookie cookie = new Cookie();
        cookie.setDomain("acme.com");
        cookie.setName("abc");
        cookie.setValue("def");
        cookieRepository.save(cookie);

        Cookie cookie2 = new Cookie();
        cookie2.setDomain("acme.com");
        cookie2.setName("abc");
        cookie2.setValue("def");
        cookieRepository.save(cookie2);

        List<Cookie> cookies = cookieRepository.findAll();
        assertThat(cookies).isNotNull();
        assertThat(cookies.size()).isEqualTo(1);
    }
}
