package com.example.demoProject.task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorDetailsRepository extends JpaRepository<ErrorCodeDetail, Integer> {

    List<ErrorCodeDetail> findByErrorCode_CodeId(int codeId);

}
