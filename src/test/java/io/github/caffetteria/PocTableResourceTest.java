package io.github.caffetteria;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.QuarkusTestProfile;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;

@QuarkusTest
class PocTableResourceTest implements QuarkusTestProfile {

    private static final Logger LOG = LoggerFactory.getLogger(PocTableResourceTest.class);

    /**
    static OracleContainer oracle = new OracleContainer("gvenzl/oracle-free:23-slim")
            .withUsername("POCUSER")
            .withPassword("POCUSER")
            .withDatabaseName("FREEPDB1");

    @BeforeAll
    static void startContainers() {
        oracle.start();
        int port = oracle.getFirstMappedPort();
        LOG.info( "container port : {}", port );
    }
     */

    @Test
    void testInsertNormalTable() {
        given()
                .when().get("/poc-table/insert-normal")
                .then()
                .statusCode(Response.Status.OK.getStatusCode());
    }

    @Test
    void testInsertBlockchainTable() {
        given()
                .when().get("/poc-table/insert-blockchain")
                .then()
                .statusCode(Response.Status.OK.getStatusCode());
    }

}
