package com.jackmckenzie.bazos.http.repository;

import com.jackmckenzie.bazos.http.entity.Cookie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CookieRepository extends JpaRepository<Cookie, Long> {
    List<Cookie> findByDomain(String domain);

    Cookie findByDomainAndName(String domain, String name);

    void deleteByDomain(String domain);
}
    