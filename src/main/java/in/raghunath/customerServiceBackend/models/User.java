package in.raghunath.customerServiceBackend.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private List<String> roles;
    private String status;

    // Agent-Specific Fields
    private List<String> specializations;
    private boolean isAvailable;
    private int currentWorkload;

    @CreatedDate
    private Date createdAt;
    @CreatedDate
    private Date updatedAt;
}