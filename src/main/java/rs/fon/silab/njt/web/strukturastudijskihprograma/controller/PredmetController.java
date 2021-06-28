/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.PredmetDto;
import rs.fon.silab.njt.web.strukturastudijskihprograma.service.PredmetService;
import rs.fon.silab.njt.web.strukturastudijskihprograma.service.impl.PredmetServiceImpl;

/**
 *
 * @author Milica
 */
@RestController
@RequestMapping(path="/predmet")
public class PredmetController {
    private final PredmetService predmetService;

    @Autowired
    public PredmetController(PredmetService predmetService) {
        this.predmetService = predmetService;
    }
    
    @RequestMapping(method = RequestMethod.GET, produces="text/plain")
    public String getAll() {
        List<PredmetDto> predmeti = new ArrayList<>();
        try {
            predmeti = predmetService.getAll();
            for (PredmetDto predmet : predmeti) {
                System.out.println(predmet);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return predmeti.get(0).toString();
    }
    
    
}
