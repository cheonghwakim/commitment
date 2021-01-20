package com.web.commitment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.commitment.dto.Follow;
@Repository
public interface ProfileDao extends JpaRepository<Follow, String> {

}
