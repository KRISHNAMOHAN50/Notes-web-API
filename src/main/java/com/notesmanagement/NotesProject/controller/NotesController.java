package com.notesmanagement.NotesProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notesmanagement.NotesProject.entity.Note;
import com.notesmanagement.NotesProject.repository.NotesRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController {
	@Autowired
	NotesRepository nrepo;
	
	@GetMapping("/notes")
	public ResponseEntity<List<Note>> readnotes(){
		return new ResponseEntity<List<Note>>(nrepo.findAll(), HttpStatus.OK);
	}
	@PostMapping("/notes")
	public ResponseEntity<Note> createNote(@RequestBody Note note){
		return new ResponseEntity<Note>(nrepo.save(note), HttpStatus.CREATED);
	}
	
	@GetMapping("/notes/{id}")
	public ResponseEntity<Note> readnote( @PathVariable Integer id){
		return new ResponseEntity<Note>(nrepo.findById(id).get(),HttpStatus.OK);
	}
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<HttpStatus> deletenote(@PathVariable Integer id){
		nrepo.deleteById(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/notes")
	public ResponseEntity<Note> updateNote(@RequestBody Note note){
		return new ResponseEntity<Note>(nrepo.save(note),HttpStatus.OK);
	}
	

}
