package com.travelService.dao;

import java.util.List;

import com.travelService.model.SampleNotes;

public interface ISampleDao {

	List<SampleNotes> getNotes();

	SampleNotes saveNotes(SampleNotes notes);
	
}
