package in.raghunath.customerServiceBackend.repos;

import in.raghunath.customerServiceBackend.models.Queue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QueueRepository extends MongoRepository<Queue, String> {

}