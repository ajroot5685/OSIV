package jg.practice.osiv.service;

import jakarta.transaction.Transactional;
import java.util.List;
import jg.practice.osiv.dto.CorrectUserDto;
import jg.practice.osiv.dto.PostDto;
import jg.practice.osiv.dto.WrongUserDto;
import jg.practice.osiv.entity.User;
import jg.practice.osiv.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public WrongUserDto getUserByIdWrongCase(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("유저가 없음"));
        return new WrongUserDto(user.getId(), user.getName(), user.getPosts());
    }

    public CorrectUserDto getUserByIdCorrectCase(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("유저가 없음"));
        List<PostDto> posts = user.getPosts().stream()
                .map(post -> new PostDto(post.getId(), post.getTitle()))
                .toList();
        return new CorrectUserDto(user.getId(), user.getName(), posts);
    }
}
