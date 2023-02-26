package com.techeer.goodnighthackathonspringboot.domain.review.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Builder
@Getter
@AllArgsConstructor
public class ReviewUpdateRequest {

    @NotNull(message = "리뷰 제목은 필수입니다.")
    private String title;

    @NotNull(message = "리뷰 내용은 필수입니다.")
    private String content;
}
