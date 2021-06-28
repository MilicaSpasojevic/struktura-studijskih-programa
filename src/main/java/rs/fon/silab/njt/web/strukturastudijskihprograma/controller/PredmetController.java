/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.fon.silab.njt.web.strukturastudijskihprograma.dto.PredmetDto;
import rs.fon.silab.njt.web.strukturastudijskihprograma.service.PredmetService;

/**
 *
 * @author Milica
 */
@RequestMapping(path="/predmet")
@RestController
public class PredmetController {
    private final PredmetService predmetService;

    @Autowired
    public PredmetController(PredmetService predmetService) {
        this.predmetService = predmetService;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String getAll() {
//        try {
//            List<PredmetDto> predmeti = predmetService.getAll();
//            for (PredmetDto predmet : predmeti) {
//                System.out.println(predmet);
//            }
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        return "predmeti woho";
    }
    
    
}
