package ru.istech.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.istech.users.dto.UserDto;
import ru.istech.users.dto.UserMapper;
import ru.istech.users.models.User;

@Service
@RequiredArgsConstructor
public class MapperService {
    private final UserMapper userMapper;

    public UserDto toUserDto(User user) {
        if (user == null) {
            return null;
        }

        return userMapper.toUserDto(user);
    }
}
