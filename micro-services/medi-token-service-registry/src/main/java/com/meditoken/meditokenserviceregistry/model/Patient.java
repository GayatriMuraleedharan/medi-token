package com.meditoken.meditokenserviceregistry.model;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity(name = "User")
@Table(
        name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "email")
        }
)
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
    private String name;
    private String email;
    private String password;
    private String city;
    private String district;
    private String state;
    private String country;
    private String history;
    private int age;

}
