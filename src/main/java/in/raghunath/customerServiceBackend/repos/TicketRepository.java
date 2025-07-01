package in.raghunath.customerServiceBackend.repos;

import in.raghunath.customerServiceBackend.models.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface TicketRepository extends MongoRepository<Ticket, String> {
    List<Ticket> findByStatus(String status);
    Optional<Ticket> findByAccessKey(String accessKey);
    List<Ticket> findByUserId(String userId);
}