package ru.coma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.coma.entity.Rashody;
import ru.coma.repository.ContactRepository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    /**
     * Метод добавляет парочку записей в БД после запуска приложения,
     * чтобы не было совсем пусто.
     *
     * Из-за того, что подключена H2 (in-memory) БД.
     */
    @PostConstruct
    public void generateTestData() {
       // save(new Rashody("Иван Иванов", "+123456789", "ivan@ivan.ov"));
        //save(new Rashody("Петр Петров", "+987654321", "petr@pe.tr"));
    }

    @Override
    public Rashody save(Rashody contact) {
        return repository.save(contact);
    }

    @Override
    public List<Rashody> findAll() {
        return repository.findAll();
    }
}
