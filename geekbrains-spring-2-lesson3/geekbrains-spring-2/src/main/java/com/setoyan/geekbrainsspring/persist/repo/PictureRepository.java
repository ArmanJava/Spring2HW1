package com.setoyan.geekbrainsspring.persist.repo;

import com.setoyan.geekbrainsspring.persist.model.Picture;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PictureRepository
 */
public interface PictureRepository extends JpaRepository<Picture, Long> {

    
}
