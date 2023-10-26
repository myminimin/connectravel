package com.connectravel.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "accommodation_option")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"accommodation", "option"})
public class AccommodationOptionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ano", nullable = false)
    private AccommodationEntity accommodation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ono", nullable = false)
    private OptionEntity option;
}
