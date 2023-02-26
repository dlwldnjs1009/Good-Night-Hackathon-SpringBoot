package com.techeer.goodnighthackathonspringboot.domain.review.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ReviewPageInfo {
    private List<ReviewInfo> reviewInfos;
}


