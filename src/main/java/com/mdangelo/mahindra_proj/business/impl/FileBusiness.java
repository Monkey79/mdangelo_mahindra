package com.mdangelo.mahindra_proj.business.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.mdangelo.mahindra_proj.business.IFileBusiness;
import com.mdangelo.mahindra_proj.entities.File;
import com.mdangelo.mahindra_proj.services.IFileService;
import com.mdangelo.mahindra_proj.utils.FileManager;

@Component
public class FileBusiness implements IFileBusiness {
	
	@Autowired
	private FileManager fileMng;
	@Autowired
	private IFileService fileSrvc;

	@Override
	public Long upload(MultipartFile mFile) {
		File file = new File();
		file.setResult(fileMng.getFloatFromFile(mFile));
		file.setName(mFile.getOriginalFilename());
		file.setCreationDate(LocalDateTime.now());
		
		return fileSrvc.save(file);
	}

	@Override
	public List<File> getAll() {
		return fileSrvc.getAll();
	}

}
