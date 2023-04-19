package org.theceshop.objects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProgress {

    private int totalQuestions;

    private int completedQuestions;

    private BigDecimal courseProgress;
}
