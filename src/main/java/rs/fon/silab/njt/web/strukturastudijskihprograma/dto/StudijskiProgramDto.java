/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.silab.njt.web.strukturastudijskihprograma.dto;

import java.util.Objects;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Fakultet;
import rs.fon.silab.njt.web.strukturastudijskihprograma.domain.Nivostudija;

/**
 *
 * @author STEFAN PC
 */
public class StudijskiProgramDto implements Dto{
    Long studijskiProgramId;
    String naziv;
    Long fakultetId;
    Long nivoStudijaId;
    Long brojSemestara;
    int status;

    public Long getStudijskiProgramId() {
        return studijskiProgramId;
    }

    public void setStudijskiProgramId(Long studijskiProgramId) {
        this.studijskiProgramId = studijskiProgramId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Long getFakultetId() {
        return fakultetId;
    }

    public void setFakultetId(Long fakultetId) {
        this.fakultetId = fakultetId;
    }

    public Long getNivoStudijaId() {
        return nivoStudijaId;
    }

    public void setNivoStudijaId(Long nivoStudijaId) {
        this.nivoStudijaId = nivoStudijaId;
    }

    public Long getBrojSemestara() {
        return brojSemestara;
    }

    public void setBrojSemestara(Long brojSemestara) {
        this.brojSemestara = brojSemestara;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public StudijskiProgramDto() {
    }

    public StudijskiProgramDto(Long studijskiProgramId, String naziv, Long fakultetId, Long nivoStudijaId, Long brojSemestara, int status) {
        this.studijskiProgramId = studijskiProgramId;
        this.naziv = naziv;
        this.fakultetId = fakultetId;
        this.nivoStudijaId = nivoStudijaId;
        this.brojSemestara = brojSemestara;
        this.status = status;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.studijskiProgramId);
        hash = 17 * hash + Objects.hashCode(this.naziv);
        hash = 17 * hash + Objects.hashCode(this.fakultetId);
        hash = 17 * hash + Objects.hashCode(this.nivoStudijaId);
        hash = 17 * hash + Objects.hashCode(this.brojSemestara);
        hash = 17 * hash + this.status;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StudijskiProgramDto other = (StudijskiProgramDto) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.studijskiProgramId, other.studijskiProgramId)) {
            return false;
        }
        if (!Objects.equals(this.fakultetId, other.fakultetId)) {
            return false;
        }
        if (!Objects.equals(this.nivoStudijaId, other.nivoStudijaId)) {
            return false;
        }
        if (!Objects.equals(this.brojSemestara, other.brojSemestara)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudijskiProgramDto{" + "studijskiProgramId=" + studijskiProgramId + ", naziv=" + naziv + ", fakultetId=" + fakultetId + ", nivoStudijaId=" + nivoStudijaId + ", brojSemestara=" + brojSemestara + ", status=" + status + '}';
    }
    
    
    
}
