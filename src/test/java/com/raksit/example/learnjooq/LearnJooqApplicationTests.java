package com.raksit.example.learnjooq;

import static io.zonky.test.db.AutoConfigureEmbeddedDatabase.DatabaseProvider.DOCKER;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@FlywayTest
@AutoConfigureEmbeddedDatabase(provider = DOCKER)
class LearnJooqApplicationTests {

	@Test
	void contextLoads() {
	}

}
