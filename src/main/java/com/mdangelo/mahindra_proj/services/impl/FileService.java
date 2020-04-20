package com.mdangelo.mahindra_proj.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mdangelo.mahindra_proj.entities.File;
import com.mdangelo.mahindra_proj.repositories.IFileRepository;
import com.mdangelo.mahindra_proj.services.IFileService;


@Service
public class FileService implements IFileService {
	
	@Autowired
	private IFileRepository fileRepository;

	@Override
	@Transactional
	public Long save(File file) {
		return fileRepository.save(file).getId();
	}

	@Override
	@Transactional(readOnly = true)
	public List<File> getAll() {
		return (List<File>) fileRepository.findAll();
	}

}
