package com.example.SeoulSiPeoples.service;

import com.example.SeoulSiPeoples.model.seoul.Row;
import java.util.List;

/**
 * 서울시 인구 조회 인터페이스.
 * @author sykim@ntels.com
 */
public interface PopulationService {
    /**
     * 인구 조회 요청
     * @return 인구 정보 리스트
     */
    List<Row> requestPopulation();
}
