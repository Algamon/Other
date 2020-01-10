package ru.coma.service;

import ru.coma.entity.Rashody;

import java.util.List;

public interface ContactService {

    Rashody save(Rashody contact);

    List<Rashody> findAll();

}
