package org.theceshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.theceshop.mapper.UserProgressMapper;
import org.theceshop.objects.entity.UserProgressEntity;
import org.theceshop.objects.model.UserProgress;
import org.theceshop.objects.request.UserProgressRequest;
import org.theceshop.repository.UserProgressRepo;

@Service
public class UserProgressServiceImpl implements UserProgressService{

    @Autowired
    UserProgressRepo userProgressRepo;

    @Autowired
    UserProgressMapper userProgressMapper;

    @Override
    public UserProgress getUserProgress(UserProgressRequest userProgressRequest) {
        UserProgressEntity userProgressEntity = userProgressRepo.findByUserIdAndCourseId(userProgressRequest.getUserId(), userProgressRequest.getCourseId());
        if (null == userProgressEntity) {
            // Typically throw 404 error here
            return null;
        }
        // the mapper will map the entity over to the model and handles the courseProgress calculation on the fly
        return userProgressMapper.userProgressEntityToUserProgress(userProgressEntity);
    }
}
