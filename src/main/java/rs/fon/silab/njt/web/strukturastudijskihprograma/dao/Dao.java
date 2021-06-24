/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.dao;

import java.util.List;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Entity;

/**
 *
 * @author Milica
 */

public interface Dao<T extends Entity> {
    void save(T e) throws Exception;
    List<T> getAll()throws Exception;
    
}
