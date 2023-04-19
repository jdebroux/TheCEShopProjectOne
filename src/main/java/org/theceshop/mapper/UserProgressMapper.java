package org.theceshop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.theceshop.objects.entity.UserProgressEntity;
import org.theceshop.objects.model.UserProgress;

import java.math.BigDecimal;

@Mapper
public interface UserProgressMapper {

    @Mapping(source = "courseEntity.totalQuestions", target = "totalQuestions")
    @Mapping(source = "userProgressEntity", target = "courseProgress", qualifiedByName = "calculateCourseProgress")
    UserProgress userProgressEntityToUserProgress(UserProgressEntity userProgressEntity);

    @Named("calculateCourseProgress")
    default BigDecimal calculateCourseProgress(UserProgressEntity userProgressEntity) {
        return BigDecimal.valueOf(userProgressEntity.getCompletedQuestions() / userProgressEntity.getCourseEntity().getTotalQuestions());
    }
}
