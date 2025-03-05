package com.Lukman.Journal.controller;
import com.Lukman.Journal.entiity.JournalEntry;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries = new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return myEntry;
    }
    @DeleteMapping("/{id}")
    public JournalEntry DeleteJournal(@PathVariable Long id){
        JournalEntry entry =  journalEntries.get(id);
        journalEntries.remove(id);
        return entry;
    }
    @PutMapping()
    public JournalEntry UpdateJournal(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return myEntry;
    }
}

