package com.mdangelo.mahindra_proj.services;

import java.util.List;

import com.mdangelo.mahindra_proj.entities.File;

public interface IFileService {
	public Long save(File file);
	public List<File> getAll();

}
