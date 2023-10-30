package com.aleksandr.db_hw_41.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        List<Person> personList = entityManager.createQuery("from Person where cityOfLiving = :city")
                .setParameter("city", city)
                .getResultList();
        return personList;
    }
}
