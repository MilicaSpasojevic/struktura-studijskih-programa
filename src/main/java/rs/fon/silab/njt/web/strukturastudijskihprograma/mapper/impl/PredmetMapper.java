/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.mapper.impl;

import org.springframework.stereotype.Component;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Entity;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Predmet;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.PredmetDto;
import rs.fon.silab.njt.web.strukturastudijskihprograma.mapper.EntityDtoMapper;

/**
 *
 * @author Milica
 */
@Component
public class PredmetMapper implements EntityDtoMapper<PredmetDto, Predmet>{

    @Override
    public PredmetDto toDto(Predmet entity) {
        return new PredmetDto(entity.getPredmetid(), entity.getEspb(), entity.getNaziv());
    }

    @Override
    public Predmet toEntity(PredmetDto dto) {
        return new Predmet(dto.getPredmetid(), dto.getEspb(), dto.getNaziv());
    }
    
}
