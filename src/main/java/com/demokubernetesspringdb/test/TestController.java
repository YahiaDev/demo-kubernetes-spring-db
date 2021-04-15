package com.demokubernetesspringdb.test;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
@Slf4j
public class TestController {

	private final TestService testService;

	@GetMapping("/findAll")
	public ResponseEntity<List<Test>> findAll() {
		log.info("find all method v0.17");
		return ResponseEntity.ok(this.testService.findAll());
	}
}
