package repository;

import model.Email;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmailRepository extends PagingAndSortingRepository<Email,Long> {
}
