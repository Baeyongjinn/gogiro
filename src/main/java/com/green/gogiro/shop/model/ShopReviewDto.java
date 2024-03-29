package com.green.gogiro.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShopReviewDto {
    @JsonIgnore
    private int ireview;
    @JsonIgnore
    private int iuser;
    @Schema(title = "가게pk")
    private int ishop;
    @Schema(title = "별점")
    private int star;
    @Schema(title = "리뷰")
    private String review;
    @Schema(title = "사진",description = "최대 5장",defaultValue = "최대 5장")
    private List<String> pics = new ArrayList<>();
}
