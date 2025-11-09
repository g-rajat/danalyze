package com.danalyze.platform.controller;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danalyze.platform.advice.exception.DanlyzeArgumentException;

@RestController
@RequestMapping("/danalyze")
public class DanalyzeRestController {

	@GetMapping("/info")
	public String getInfo() {
		return "Server Info: OK";
	}

	@GetMapping("/status")
	public String getInfo(@RequestParam String statusType) throws Exception {

		if (statusType == null) {

			throw new DanlyzeArgumentException("Status type can not be null");
		}

		if(statusType.isBlank()) {
			
			throw new DanlyzeArgumentException("Status type can not be blank");
		}
		if ("RUNNING".equalsIgnoreCase(statusType)) {
			return "Not Running";
		} else if ("WAITING".equalsIgnoreCase(statusType)) {
			return "Yes, it is waiting";
		}

		throw new Exception("Invalid Status:" + statusType);
	}

}
