package com.API.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.API.Models.Works;
import com.API.Repositories.WorkRepository;

@Service
public class WorkService {
	
	@Autowired
	private WorkRepository repo;
	
	
	public Page<Works> listAll(
			@RequestParam Optional<String> sortBy,
			@RequestParam Optional<Integer> page
			) {
		return repo.findAll(
				PageRequest.of(
						page.orElse(0), 5,
						Sort.Direction.ASC, sortBy.orElse("name")
						)
				);
	}
	
	public void save(Works work) {
		repo.save(work);
	}
	
	public Works getById(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
