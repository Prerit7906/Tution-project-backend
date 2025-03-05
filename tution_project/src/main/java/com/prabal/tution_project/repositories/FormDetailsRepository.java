package com.prabal.tution_project.repositories;

import com.prabal.tution_project.entities.FormDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDetailsRepository extends CrudRepository<FormDetails,Long> {
}
