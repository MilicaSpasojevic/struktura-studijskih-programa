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
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Studijskiprogram;

/**
 *
 * @author STEFAN PC
 */
@Repository(value = "studijskiProgramDaoSpringJPA")
public class StudijskiProgramDaoSpringJPAImpl implements Dao<Studijskiprogram>{
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void save(Studijskiprogram e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Studijskiprogram> getAll() throws Exception {
        return entityManager.createQuery("SELECT s FROM Studijskiprogram s ORDER BY s.naziv", Studijskiprogram.class).getResultList();
    }
}
