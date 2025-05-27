package ru.istech.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.istech.utils.enums.BloodGroup;
import ru.istech.utils.enums.BloodKell;
import ru.istech.utils.enums.BloodRh;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class UserDto {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final BloodGroup bloodGroup;
    private final BloodRh bloodRh;
    private final BloodKell bloodKell;
    private final String bloodPhenotype;
    private final LocalDateTime createdAt;
}
