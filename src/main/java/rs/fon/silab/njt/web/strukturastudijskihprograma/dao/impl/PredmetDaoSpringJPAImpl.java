/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dao.Dao;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Predmet;

/**
 *
 * @author Milica
 */
@Repository
public class PredmetDaoSpringJPAImpl implements Dao<Predmet>{
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void save(Predmet e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Predmet> getAll() throws Exception {
        return entityManager.createQuery("SELECT p FROM predmet p", Predmet.class).getResultList();
    }
    
}
