package io.github.caffetteria.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.Date;

public interface PocTable {

    Long getId();

    void setId(Long id);

    Date getDataCreazione();

    void setDataCreazione(Date dataCreazione);

    Date getDataModifica();

    void setDataModifica(Date dataModifica);

    Long getIdStato();

    void setIdStato(Long idStato);

    String getNote();

    void setNote(String note);
}
