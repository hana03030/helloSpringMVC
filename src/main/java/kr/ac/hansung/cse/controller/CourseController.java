package kr.ac.hansung.cse.controller;

import jakarta.validation.Valid;
import kr.ac.hansung.cse.model.Course;
import kr.ac.hansung.cse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String showCourses(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("id_courses", courses);

        return "courses";
    }

    @GetMapping("/createcourse")
    public String createCourse(Model model) {
        model.addAttribute("course", new Course());
        return "createcourse";
    }

    @PostMapping("/docreatecourse")
    public String docreatecourse(Model model, @Valid Course course, BindingResult result) {
        if(result.hasErrors()) {
            System.out.println(" == 데이터가 존재하지 않음 ==");

            List<ObjectError> errors = result.getAllErrors();

            for(ObjectError error : errors) {
                System.out.println(error.getDefaultMessage());
            }

            return "createcourse";
        }

        course.setYear(2025);
        course.setSemester(2);

        courseService.insertCourse(course);
        return "coursecreated";
    }

    @GetMapping("/showcreated")
    public String showcreated(Model model) {
        int year = 2025;
        int semester = 2;

        List<Course> courses = courseService.getCoursesBySemester(year, semester);
        model.addAttribute("id_courses", courses);

        return "showcreated";
    }
}
