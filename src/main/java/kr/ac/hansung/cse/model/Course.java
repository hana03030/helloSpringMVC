package kr.ac.hansung.cse.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int year;
    private int semester;

    @NotBlank(message = "교과목 코드는 반드시 입력해야 합니다.")
    @Size(min = 1, message = "교과목 코드는 1글자 이상이어야 합니다.")
    private String course_code;


    @NotBlank(message = "교과목명은 반드시 입력해야 합니다.")
    @Size(min = 1, message = "교과목명은 1글자 이상이어야 합니다.")
    private String course_name;


    @NotBlank(message = "교과구분은 반드시 입력해야 합니다.")
    @Size(min = 1, message = "교과구분은 1글자 이상이어야 합니다.")
    private String category;

    @NotBlank(message = "담당 교수는 반드시 입력해야 합니다.")
    @Size(min = 1, message = "담당 교수는 1글자 이상이어야 합니다.")
    private String professor;

    @NotNull(message = "학점은 필수 입력입니다.")
    @Min(value = 1, message = "학점은 1 이상이어야 합니다.")
    @Max(value = 6, message = "학점은 6 이하이어야 합니다.")
    private int credit;
}
