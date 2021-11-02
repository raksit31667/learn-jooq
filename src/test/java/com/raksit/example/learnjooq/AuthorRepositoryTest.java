package com.raksit.example.learnjooq;

import static io.zonky.test.db.AutoConfigureEmbeddedDatabase.DatabaseProvider.DOCKER;
import static org.assertj.core.api.Assertions.assertThat;

import com.raksit.example.learnjooq.tables.records.AuthorRecord;
import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.flywaydb.test.annotation.FlywayTest;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@FlywayTest
@AutoConfigureEmbeddedDatabase(provider = DOCKER)
class AuthorRepositoryTest {

  @Autowired
  private AuthorRepository authorRepository;

  @Test
  void shouldWork() {
    // Given
    authorRepository.save(new AuthorRecord(1, "Charlotte", "Roche", 40));

    // When
    Result<AuthorRecord> actual = authorRepository.findAll();

    // Then
    assertThat(actual.size()).isEqualTo(1);
    assertThat(actual.get(0).getId()).isEqualTo(1);
    assertThat(actual.get(0).getFirstName()).isEqualTo("Charlotte");
    assertThat(actual.get(0).getLastName()).isEqualTo("Roche");
    assertThat(actual.get(0).getAge()).isEqualTo(40);
  }
}