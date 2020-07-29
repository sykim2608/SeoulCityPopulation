package com.example.SeoulSiPeoples.service;

import com.example.SeoulSiPeoples.model.ParamModel;
import com.example.SeoulSiPeoples.model.seoul.Row;
import java.util.List;

/**
 * 서울시 인구 조회 인터페이스.
 * @author sykim@ntels.com
 */
public interface PopulationService {
    /**
     * 인구 조회 요청
     * @param paramModel 조회 URL 내 인자
     * @return 인구 정보 리스트
     */
    List<Row> requestPopulation(ParamModel paramModel);
}
