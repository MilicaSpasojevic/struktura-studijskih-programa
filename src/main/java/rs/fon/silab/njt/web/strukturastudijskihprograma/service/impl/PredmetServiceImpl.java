/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dao.Dao;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Predmet;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.PredmetDto;
import rs.fon.silab.njt.web.strukturastudijskihprograma.mapper.impl.PredmetMapper;
import rs.fon.silab.njt.web.strukturastudijskihprograma.service.PredmetService;

/**
 *
 * @author Milica
 */
@Service
@Transactional
public class PredmetServiceImpl implements PredmetService{
    private final Dao<Predmet> predmetDao;
    private final PredmetMapper predmetMapper;

    @Autowired
    public PredmetServiceImpl(@Qualifier(value = "predmetDaoSpringJPA") Dao<Predmet> predmetDao, PredmetMapper predmetMapper) {
        this.predmetDao = predmetDao;
        this.predmetMapper = predmetMapper;
    }

    @Override
    public PredmetDto save(PredmetDto cityDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PredmetDto> getAll() throws Exception {
        List<Predmet> predmeti = predmetDao.getAll();
        return predmeti.stream().map(predmet -> {
            return predmetMapper.toDto(predmet);
        }).collect(Collectors.toList());
    }
    
    
    
    
}
