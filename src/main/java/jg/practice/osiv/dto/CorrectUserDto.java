package jg.practice.osiv.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CorrectUserDto {

    private Long id;
    private String name;
    private List<PostDto> posts;
}
