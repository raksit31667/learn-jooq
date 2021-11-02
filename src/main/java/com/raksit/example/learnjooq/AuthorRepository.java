package com.raksit.example.learnjooq;

import com.raksit.example.learnjooq.tables.records.AuthorRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {

  private final DSLContext dslContext;

  public AuthorRepository(DSLContext dslContext) {
    this.dslContext = dslContext;
  }

  public void save(AuthorRecord authorRecord) {
    dslContext.insertInto(Tables.AUTHOR)
        .values(authorRecord.getId(), authorRecord.getFirstName(), authorRecord.getLastName(), authorRecord.getAge())
        .execute();
  }

  public Result<AuthorRecord> findAll() {
    return dslContext.selectFrom(Tables.AUTHOR).fetch();
  }
}
