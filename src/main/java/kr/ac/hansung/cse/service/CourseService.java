package kr.ac.hansung.cse.service;

import kr.ac.hansung.cse.dao.CourseDao;
import kr.ac.hansung.cse.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public List<Course> getAllCourses() {
        return courseDao.getCourses();
    }

    public void insertCourse(Course course) {
        courseDao.insert(course);
    }

    public List<Course> getCoursesBySemester(int year, int semester) {
        return courseDao.getCoursesBySemester(year, semester);
    }

    public List<Object[]> getCreditSummaryBySemester() {
        return courseDao.getCreditSummaryBySemester();
    }

}
