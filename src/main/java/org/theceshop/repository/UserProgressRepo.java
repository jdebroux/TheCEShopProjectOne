package org.theceshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.theceshop.objects.entity.UserProgressEntity;
import org.theceshop.objects.request.UserProgressRequest;

public interface UserProgressRepo extends JpaRepository<UserProgressEntity, Integer> {
    UserProgressEntity findByUserIdAndCourseId(Integer userId, Integer courseId);
}
