package com.travelService.dao.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.ISampleDao;
import com.travelService.model.SampleNotes;
import com.travelService.repository.ISampleNoteRepository;
@Component
public class SampleDaoImpl implements ISampleDao {

	@Autowired
	ISampleNoteRepository noteRepository;

	@Override
	public List<SampleNotes> getNotes() {
		return noteRepository.findAll();

	}

	@Override
	public SampleNotes saveNotes(SampleNotes note) {

		return noteRepository.save(note);
	}

}
