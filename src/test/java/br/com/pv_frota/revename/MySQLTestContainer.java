package br.com.pv_frota.revename;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

@Testcontainers
@DirtiesContext
public class MySQLTestContainer {

    private static final DockerImageName image = DockerImageName.parse("mysql:8.0.22");

    @Container
    private static final MySQLContainer<?> container = new MySQLContainer<>(image)
            .withUsername("root")
            .withPassword("root")
            .withDatabaseName("revename");

    @DynamicPropertySource
    private static void properties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", container::getJdbcUrl);
        registry.add("spring.datasource.username", container::getUsername);
        registry.add("spring.datasource.password", container::getPassword);
        registry.add("spring.flyway.locations", () -> "classpath:database/migration/test");
    }

    @BeforeAll
    static void beforeAll() {
        Flyway flyway = Flyway
                .configure()
                .dataSource(
                        container.getJdbcUrl(),
                        container.getUsername(),
                        container.getPassword())
                .load();
        flyway.migrate();
    }
}
