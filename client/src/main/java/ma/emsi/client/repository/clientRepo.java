package ma.emsi.client.repository;

import ma.emsi.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepo extends JpaRepository<Client,Long> {
}