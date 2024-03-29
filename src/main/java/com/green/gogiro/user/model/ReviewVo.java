package com.green.gogiro.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class ReviewVo {
    @Schema(title = "가게 구분(0:식당,1:정육점)")
    private int checkShop;//가게구분(0:고기집, 1: 정육점)
    @Schema(title = "리뷰pk")
    private int ireview;//후기pk
    @Schema(title = "식당pk")
    private int ishop;//가게pk
    private int star;//별점
    @Schema(title = "후기")
    private String review;//후기
    @Schema(title = "작성 날짜")
    private String createdAt;
    @Schema(title = "리뷰 사진")
    private List<String> pics;//(후기 사진)
}
