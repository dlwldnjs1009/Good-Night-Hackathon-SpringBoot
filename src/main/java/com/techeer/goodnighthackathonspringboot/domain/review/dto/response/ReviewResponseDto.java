package com.techeer.goodnighthackathonspringboot.domain.review.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReviewResponseDto {
    private String title;
    private String content;
}
