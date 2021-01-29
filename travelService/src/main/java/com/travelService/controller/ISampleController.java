package com.travelService.controller;

import java.util.List;
import javax.ws.rs.core.Response;
import com.travelService.model.SampleNotes;

public interface ISampleController {

	public Response sayHello();
	public List<SampleNotes> getAllNotes();
	public SampleNotes createNote( SampleNotes note);
	public SampleNotes createNote1( SampleNotes note);
	
}
