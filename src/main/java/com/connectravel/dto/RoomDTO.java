package com.connectravel.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
    private Long rno;
    private String roomName;
    private int price;
    private int minimumOccupancy; // 최소 인원
    private int maximumOccupancy; // 최대 인원
    private String content;
    private boolean operating;

    private AccommodationDTO accommodationDTO;
    private List<String> imgFiles;
}
