package ru.coma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ru.coma.entity.Rashody;

import java.util.List;


@Transactional(propagation = Propagation.MANDATORY)
public interface ContactRepository extends CrudRepository<Rashody, Long> {

    List<Rashody> findAll();

}
