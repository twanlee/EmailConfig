package servcie;

import model.Email;

import java.util.Optional;

public interface EmailService {
    void save(Email email);
    Optional<Email> findOne(Long id);
}
