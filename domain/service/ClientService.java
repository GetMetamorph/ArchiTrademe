package domain.service;

import java.util.List;
import java.util.Optional;

import domain.model.Client;

public interface ClientService extends UserService {
    List<Client> getAllClients();

    Optional<Client> getClientById(Long id);

    Optional<Client> getClientByEmail(String email);
}
