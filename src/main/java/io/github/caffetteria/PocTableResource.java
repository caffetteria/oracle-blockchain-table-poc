package io.github.caffetteria;

import io.github.caffetteria.entity.BlockchainTable;
import io.github.caffetteria.entity.NormalTable;
import io.github.caffetteria.entity.PocTable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.UUID;

@ApplicationScoped
@Path( "/poc-table" )
public class PocTableResource {

    private static final Logger LOG = LoggerFactory.getLogger(PocTableResource.class);

    @Inject
    EntityManager em;

    private void popola(PocTable pocTable) {
        pocTable.setDataCreazione( new Date() );
        pocTable.setDataModifica( pocTable.getDataCreazione() );
        pocTable.setIdStato( 1L );
        pocTable.setNote( "Primo record inserito : %s".formatted(UUID.randomUUID().toString()) );
    }

    @Transactional
    @GET
    @Path( "/insert-normal" )
    public long insertNormal() {
        NormalTable normalTable = new NormalTable();
        this.popola( normalTable );
        em.persist( normalTable );
        LOG.info( "Record classico inserito {}", normalTable.getId() );
        return normalTable.getId();
    }

    @Transactional
    @GET
    @Path( "/insert-blockchain" )
    public long insertBlockchain() {
        BlockchainTable blockchainTable = new BlockchainTable();
        this.popola( blockchainTable );
        em.persist( blockchainTable );
        LOG.info( "Record blockchain inserito {}", blockchainTable.getId() );
        return blockchainTable.getId();
    }

}
