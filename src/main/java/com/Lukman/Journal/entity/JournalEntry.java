package com.Lukman.Journal.entity;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;


@Document(collection = "journaldb")
@Data
public class JournalEntry {
    @Id
    @JsonSerialize(using= ToStringSerializer.class)
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;
//
//    public LocalDateTime getDate() { return date; }
//
//    public void setDate(LocalDateTime date) { this.date = date ;}
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
}
