package org.theceshop.objects.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserProgressRequest {
    private Integer userId;
    private Integer courseId;
}
