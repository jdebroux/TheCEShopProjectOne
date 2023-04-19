package org.theceshop.service;

import org.theceshop.objects.model.UserProgress;
import org.theceshop.objects.request.UserProgressRequest;

public interface UserProgressService {

    UserProgress getUserProgress(UserProgressRequest userProgressRequest);
}
