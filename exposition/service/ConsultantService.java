package domain.service;

import java.util.List;
import java.util.Optional;

import domain.model.Consultant;

public interface ConsultantService extends UserService {
    List<Consultant> getAllConsultants();

    Optional<Consultant> getConsultantById(Long id);

    Optional<Consultant> getConsultantByEmail(String email);
}
