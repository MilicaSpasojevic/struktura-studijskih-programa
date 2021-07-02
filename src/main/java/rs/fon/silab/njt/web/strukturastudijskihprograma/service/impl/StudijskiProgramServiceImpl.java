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
import org.springframework.stereotype.Service;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dao.Dao;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.StudijskiProgramDto;
import rs.fon.silab.njt.web.strukturastudijskihprograma.service.StudijskiProgramService;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Studijskiprogram;
import rs.fon.silab.njt.web.strukturastudijskihprograma.mapper.impl.StudijskiProgramMapper;
/**
 *
 * @author STEFAN PC
 */
@Service
@Transactional
public class StudijskiProgramServiceImpl implements StudijskiProgramService{
    private final Dao<Studijskiprogram> studjskiProgramDao;
    private final StudijskiProgramMapper studijskiProgramMapper;

    @Autowired
    public StudijskiProgramServiceImpl(Dao<Studijskiprogram> studjskiProgramDao, StudijskiProgramMapper studijskiProgramMapper) {
        this.studjskiProgramDao = studjskiProgramDao;
        this.studijskiProgramMapper = studijskiProgramMapper;
    }
    
    
    
    @Override
    public StudijskiProgramDto save(StudijskiProgramDto cityDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudijskiProgramDto> getAll() throws Exception {
        List<Studijskiprogram> studijskiProgrami = studjskiProgramDao.getAll();
        return studijskiProgrami.stream().map(program -> {
            return studijskiProgramMapper.toDto(program);
        }).collect(Collectors.toList());
    }
    
}
