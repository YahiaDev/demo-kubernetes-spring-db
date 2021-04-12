package com.demokubernetesspringdb.test;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class TestService {

	private final TestRepository testRepository;

	public List<Test> findAll() {

		return this.testRepository.findAll();
	}
}
