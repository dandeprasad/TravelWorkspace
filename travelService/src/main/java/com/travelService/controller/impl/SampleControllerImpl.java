package com.travelService.controller.impl;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.controller.ISampleController;
import com.travelService.model.SampleNotes;
import com.travelService.service.ISampleService;

@Component
@Path("/sampleresource")
public class SampleControllerImpl implements ISampleController {

	Logger logger = LoggerFactory.getLogger(SampleControllerImpl.class);

	@Autowired
	ISampleService sampleService;
	

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/hello")
	public Response sayHello() {
		// String responseText = "Hello World dande";
		sampleService.getSomedata();
		logger.debug("test data");
		return Response.status(Response.Status.OK).entity(sampleService).build();
	};

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/notes1")
	public List<SampleNotes> getAllNotes() {
		List<SampleNotes> notes = sampleService.getAllNotesService();
		return notes;
	}
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/notes")
	public SampleNotes createNote(SampleNotes note) {

		SampleNotes notesData = sampleService.saveNotesService(note);
		return notesData;

	}

	@Override
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/notes1")
	public SampleNotes createNote1(SampleNotes note) {
		//SampleNotes notesData1 = sampleService.saveNotesService1(note);
		return null;
	}
}
