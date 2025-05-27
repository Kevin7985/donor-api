package ru.istech.users.dto;

import org.springframework.stereotype.Component;
import ru.istech.users.models.User;

@Component
public class UserMapper {
    public UserDto toUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getMiddleName(),
                user.getBloodGroup(),
                user.getBloodRh(),
                user.getBloodKell(),
                user.getBloodPhenotype(),
                user.getCreatedAt()
        );
    }
}
