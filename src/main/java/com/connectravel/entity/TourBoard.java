package com.connectravel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TourBoard extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tbno;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 2000, nullable = false)
    private String content;

    private String region;
    private String category;
    private double grade;
    private int reviewCount;

    @Column(nullable = false)
    private int postal;

    @Column(nullable = false)
    private String address;

    /* 도메인 로직 */
    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeContent(String content) {this.content = content;}

    public void changeRegion(String region) {this.region = region;}

    public void changeCategory(String category) {this.category = category;}

    public void changeAddress(String address) {this.address = address;}

    public void changePostal(Integer postal) {this.postal = postal;}

    public void setGrade(double grade) { // 평점 변경
        this.grade = grade;
    }

    public void setReviewCount(int reviewCount) { // 리뷰 수 변경
        this.reviewCount = reviewCount;
    }

}
