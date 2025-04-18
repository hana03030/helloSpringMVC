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

    // 학기별 이수 학점 요약
    public List<Object[]> getCreditSummaryBySemester() {
        String jpql = "SELECT c.year, c.semester, SUM(c.credit) " +
                "FROM Course c " +
                "WHERE c.year < 2025 OR (c.year = 2024 AND c.semester <= 2) " + // 2024년 2학기까지 포함
                "GROUP BY c.year, c.semester ORDER BY c.year, c.semester";
        return entityManager.createQuery(jpql, Object[].class).getResultList();
    }


}
