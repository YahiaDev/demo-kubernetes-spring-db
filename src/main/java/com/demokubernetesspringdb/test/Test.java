package com.demokubernetesspringdb.test;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Test {
	@Id
	private Long id;

	private String data;

}
