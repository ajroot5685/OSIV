package jg.practice.osiv.controller;

import jg.practice.osiv.dto.CorrectUserDto;
import jg.practice.osiv.dto.WrongUserDto;
import jg.practice.osiv.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * OSIV 설정에 따라 다른 오류가 발생
     */
    @GetMapping("/users/{id}/wrong-case")
    public ResponseEntity<WrongUserDto> wrongGetUser(
            @PathVariable("id") Long id
    ) {
        return ResponseEntity.ok(userService.getUserByIdWrongCase(id));
    }

    /**
     * OSIV 설정에 관계없이 정상 응답 반환
     */
    @GetMapping("/users/{id}/correct-case")
    public ResponseEntity<CorrectUserDto> correctGetUser(
            @PathVariable("id") Long id
    ) {
        return ResponseEntity.ok(userService.getUserByIdCorrectCase(id));
    }
}
