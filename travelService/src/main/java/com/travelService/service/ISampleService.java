package com.travelService.service;

import java.util.List;
import com.travelService.model.SampleNotes;
import com.travelService.response.SampleResponse;

public interface ISampleService {

	SampleResponse getSomedata();

	List<SampleNotes> getAllNotesService();

	SampleNotes saveNotesService(SampleNotes notes);

}


