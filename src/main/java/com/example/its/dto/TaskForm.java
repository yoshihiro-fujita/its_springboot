package com.example.its.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TaskForm implements Serializable {
	private static final long serialVersionUID = -6647247658748349084L;
	
	private long id;

	@NotBlank
	@Size(max = 30)
	private String taskName;


	@NotBlank
	@Size(max = 50)
	private String taskContent;
	
	}
