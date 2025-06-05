package io.github.caffetteria.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BlOCKCHAIN_TABLE")
public class BlockchainTable implements PocTable {

    private Long id;

    @Column(name = "DATA_CREAZIONE")
    private Date dataCreazione;

    @Column(name = "DATA_MODIFICA")
    private Date dataModifica;

    @Column(name = "ID_STATO")
    private Long idStato;

    @Column(name = "NOTE")
    private String note;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blockchainTableSeq")
    @SequenceGenerator(name = "blockchainTableSeq", sequenceName = "BlOCKCHAIN_TABLE_SEQ", allocationSize = 1)
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Date getDataCreazione() {
        return dataCreazione;
    }

    @Override
    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    @Override
    public Date getDataModifica() {
        return dataModifica;
    }

    @Override
    public void setDataModifica(Date dataModifica) {
        this.dataModifica = dataModifica;
    }

    @Override
    public Long getIdStato() {
        return idStato;
    }

    @Override
    public void setIdStato(Long idStato) {
        this.idStato = idStato;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

}
