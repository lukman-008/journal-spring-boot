package com.Lukman.Journal.controller;

import com.Lukman.Journal.entiity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @GetMapping
    public List<JournalEntry> getAll(){
       return null;
    }
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        return null;
    }
    @DeleteMapping("/{id}")
    public JournalEntry DeleteJournal(@PathVariable Long id){
        return null;
    }
    @PutMapping()
    public JournalEntry UpdateJournal(@RequestBody JournalEntry myEntry){
        return null;
    }
}

