package com.example.budgettracker.controller;

import com.example.budgettracker.model.TransactionNote;
import com.example.budgettracker.repository.TransactionNoteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TransactionNoteController {

    private final TransactionNoteRepository transactionNoteRepository;

    public TransactionNoteController(TransactionNoteRepository transactionNoteRepository) {
        this.transactionNoteRepository = transactionNoteRepository;
    }

    @GetMapping("/transaction-notes")
    public List<TransactionNote> getTransactionNotes() {
        return transactionNoteRepository.findAll();
    }

    @PostMapping("/transaction-notes")
    public TransactionNote createTransactionNote(@RequestBody TransactionNote transactionNote) {
        return transactionNoteRepository.save(transactionNote);
    }
}
