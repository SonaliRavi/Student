package com.programs.login.repository;
import com.programs.login.entity.students;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<students,Long>
{
}
