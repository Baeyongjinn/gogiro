package com.green.gogiro.shop.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShopDetailVo {
    @Schema(title = "식당pk")
    private int ishop;
    @Schema(title = "상호명")
    private String name;
    @Schema(title = "위치")
    private String location;
    @Schema(title = "상세정보")
    private String information;
    @Schema(title = "경도")
    private String x;
    @Schema(title = "위도")
    private String y;
    @Schema(title = "별점")
    private double star;
    @Schema(title = "가게 사진")
    private List<String> pics = new ArrayList<>();
    @Schema(title = "상세 메뉴")
    private List<ShopDetailMenu> menus = new ArrayList<>();
    @Schema(title = "식당 리뷰")
    private List<ShopReviewDetail> reviews = new ArrayList<>();
}
