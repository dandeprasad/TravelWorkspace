package com.travelService.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.travelService.dao.IBeforeUserLoginDao;
import com.travelService.model.MovieTrailer;
import com.travelService.repository.IBeforeUserLoginRepository;

@Component
public class BeforeUserLoginDaoImpl implements IBeforeUserLoginDao {

	@Autowired
	IBeforeUserLoginRepository beforeUserLoginRepository;
	
	@Override
	public List<MovieTrailer> getListDao() {
		
		return beforeUserLoginRepository.findAll();
	}

}
