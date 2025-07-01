package in.raghunath.customerServiceBackend.repos;

import in.raghunath.customerServiceBackend.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    // This is the most crucial custom method you'll need.
    // It allows you to check if a user exists based on their email.
    // Using Optional is a best practice to avoid null checks.
    Optional<User> findByEmail(String email);
}