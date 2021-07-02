/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.service;

import java.util.List;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.StudijskiProgramDto;

/**
 *
 * @author STEFAN PC
 */
public interface StudijskiProgramService {
    StudijskiProgramDto save(StudijskiProgramDto cityDto) throws Exception;
    List<StudijskiProgramDto> getAll() throws Exception;
}
