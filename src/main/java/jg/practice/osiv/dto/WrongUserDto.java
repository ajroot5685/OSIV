package jg.practice.osiv.dto;

import java.util.List;
import jg.practice.osiv.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WrongUserDto {

    private Long id;
    private String name;
    private List<Post> posts;
}
