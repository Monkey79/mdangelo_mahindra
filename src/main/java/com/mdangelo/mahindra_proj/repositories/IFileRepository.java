package com.mdangelo.mahindra_proj.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mdangelo.mahindra_proj.entities.File;

public interface IFileRepository extends CrudRepository<File, Long> {

}
