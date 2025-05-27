package ru.istech.users;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.istech.users.dto.UserDto;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Tag(name = "Users", description = "Методы для работы с пользователями")
public class UserController {
    @GetMapping("/{userId}")
    @Operation(summary = "Получение профиля донора по userId")
    public UserDto getUserById(@PathVariable UUID userId) {
        return null;
    }
}
