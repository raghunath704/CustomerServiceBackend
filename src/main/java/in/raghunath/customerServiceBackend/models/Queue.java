package in.raghunath.customerServiceBackend.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "queues")
public class Queue {
    @Id
    private String id;
    private String name;
    private List<String> keywords;
}