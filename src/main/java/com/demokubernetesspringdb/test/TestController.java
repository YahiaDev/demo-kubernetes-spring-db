package com.demokubernetesspringdb.test;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class TestController {

	private final TestService testService;

	@GetMapping("/findAll")
	public ResponseEntity<List<Test>> findAll() {
		return ResponseEntity.ok(this.testService.findAll());
	}
}
