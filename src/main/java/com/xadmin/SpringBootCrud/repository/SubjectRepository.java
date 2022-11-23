package com.xadmin.SpringBootCrud.repository;

import com.xadmin.SpringBootCrud.bean.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,String> {

}
