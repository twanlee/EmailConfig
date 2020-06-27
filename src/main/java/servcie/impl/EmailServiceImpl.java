package servcie.impl;

import model.Email;
import repository.EmailRepository;
import servcie.EmailService;

import java.util.Optional;

public class EmailServiceImpl implements EmailService {
    private EmailRepository repository;
    @Override
    public void save(Email email) {
        repository.save(email);
    }

    @Override
    public Optional<Email> findOne(Long id) {
        return repository.findById(id);
    }
}
