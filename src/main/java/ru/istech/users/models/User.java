package ru.istech.users.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.istech.utils.enums.BloodGroup;
import ru.istech.utils.enums.BloodKell;
import ru.istech.utils.enums.BloodRh;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String firstName;
    private String lastName;
    private String middleName;

    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @Enumerated(EnumType.STRING)
    private BloodRh bloodRh;

    @Enumerated(EnumType.STRING)
    private BloodKell bloodKell;

    private String bloodPhenotype;

    private LocalDateTime createdAt;
}
