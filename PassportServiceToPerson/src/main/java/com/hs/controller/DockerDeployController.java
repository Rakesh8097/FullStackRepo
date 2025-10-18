package com.hs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDeployController {

	@GetMapping("/doc")
	public String getMethodName()
	{
		return "Docker deployement successfully...!";
	}
}
