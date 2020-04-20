package com.mdangelo.mahindra_proj.business;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.mdangelo.mahindra_proj.entities.File;

public interface IFileBusiness {
	public Long upload(MultipartFile multipartFile);
	public List<File> getAll();
}
