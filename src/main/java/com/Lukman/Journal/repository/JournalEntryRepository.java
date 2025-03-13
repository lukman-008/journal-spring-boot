package com.Lukman.Journal.repository;
import com.Lukman.Journal.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.ObjectInput;


public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
