package org.theceshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.theceshop.objects.model.UserProgress;
import org.theceshop.objects.request.UserProgressRequest;
import org.theceshop.service.UserProgressService;

@RestController
@RequestMapping("/api")
public class UserProgressController {

    @Autowired
    UserProgressService userProgressService;

    @GetMapping("/users/{userId}/courses/{courseId}/progress")
    public UserProgress get(@RequestParam Integer userId, @RequestParam Integer courseId) {
        return userProgressService.getUserProgress(UserProgressRequest.builder().userId(userId).courseId(courseId).build());
    }
}
