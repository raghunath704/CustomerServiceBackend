package in.raghunath.customerServiceBackend.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document(collection = "tickets")
public class Ticket {
    @Id
    private String id;

    private String subject;
    private String description;
    private String status;
    private String source;
    private String accessKey;

    @Field("userId")
    private String userId;

    @Field("agentId")
    private String agentId;

    @Field("queueId")
    private String queueId;

    @CreatedDate
    private Date createdAt;
    @CreatedDate
    private Date resolvedAt;
}