package com.techeer.goodnighthackathonspringboot.domain.restaurant.domain;

import com.techeer.goodnighthackathonspringboot.domain.restaurant.dto.RestaurantInfo;
import com.techeer.goodnighthackathonspringboot.domain.review.domain.Review;
import com.techeer.goodnighthackathonspringboot.global.domain.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@Table(name = "restaurant")
public class Restaurant extends BaseEntity {

    @Id
    @Column(name = "restaurant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private Category category;

//    @OneToMany(mappedBy = "restaurant")
//    @Builder.Default
//    private List<Review> reviewList = new ArrayList<>();

    @Builder
    public Restaurant(String name, Category category){
        this.name = name;
        this.category = category;
        this.isActivated = true;
    }

    public void delete(){
        this.activeOff();
    }

    public void update(RestaurantInfo restaurantInfo){
        this.category = restaurantInfo.getCategory();
    }

}