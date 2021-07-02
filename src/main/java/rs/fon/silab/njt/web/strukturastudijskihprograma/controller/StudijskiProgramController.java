/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.StudijskiProgramDto;
import rs.fon.silab.njt.web.strukturastudijskihprograma.service.StudijskiProgramService;

/**
 *
 * @author STEFAN PC
 */
@RestController
@RequestMapping(path="/studijski-program")
public class StudijskiProgramController {
    private final StudijskiProgramService studijskiProgramService;
    
    @Autowired
    public StudijskiProgramController(StudijskiProgramService studijskiProgramService) {
        this.studijskiProgramService = studijskiProgramService;
    }
    
    @RequestMapping(method = RequestMethod.GET, produces="text/plain")
    public String getAll() {
        List<StudijskiProgramDto> studijskiProgrami = new ArrayList<>();
        try {
            studijskiProgrami = studijskiProgramService.getAll();
            for (StudijskiProgramDto studijskiProgram : studijskiProgrami) {
                System.out.println(studijskiProgram);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String s = gson.toJson(studijskiProgrami);
        return s;
    }
    
}
