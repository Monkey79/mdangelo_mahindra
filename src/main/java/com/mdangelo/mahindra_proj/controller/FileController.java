package com.mdangelo.mahindra_proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mdangelo.mahindra_proj.business.IFileBusiness;
import com.mdangelo.mahindra_proj.entities.File;
//import org.springframework.web.bind.annotation.RestController;
import com.mdangelo.mahindra_proj.services.IFileService;

@RestController
@RequestMapping(path ="/file")
public class FileController {
	
	@Autowired
	private IFileBusiness fileBusiness;
	
	@GetMapping(path="/getAll", produces = "application/json")
	public ResponseEntity<List<File>> getAll() {	
		List<File> files = fileBusiness.getAll();			
		return new ResponseEntity<List<File>>(files,HttpStatus.OK);
	}
	
	@PostMapping(path="/upload")
	public Long uploadFile(@RequestParam("file")MultipartFile file) {
		return fileBusiness.upload(file);
	}
}
