package kr.ac.hansung.cse.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import kr.ac.hansung.cse.model.Course;
import kr.ac.hansung.cse.model.Offer;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CourseDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Course getCourse(int id) {
        return entityManager.find(Course.class, id);
    }

    public List<Course> getCourses() {
        return entityManager.createQuery("SELECT o FROM Course o", Course.class)
                .getResultList();
    }

    public void insert(Course course) {
        entityManager.persist(course);
    }

    public List<Course> getCoursesBySemester(int year, int semester) {
        String jpql = "SELECT c FROM Course c WHERE c.year = :year AND c.semester = :semester";
        return entityManager.createQuery(jpql, Course.class)
                .setParameter("year", year)
                .setParameter("semester", semester)
                .getResultList();
    }
}
