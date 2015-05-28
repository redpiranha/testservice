package de.test.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CrudService {

    @PersistenceContext(unitName = "testServicePU")
    protected EntityManager em;

}
