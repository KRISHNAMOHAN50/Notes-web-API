package com.notesmanagement.NotesProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.notesmanagement.NotesProject.entity.Note;

@Repository
public interface NotesRepository  extends JpaRepository<Note, Integer>{
	

}
