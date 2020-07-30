package com.example.SeoulSiPeoples.controller;

import com.example.SeoulSiPeoples.model.seoul.Row;
import com.example.SeoulSiPeoples.service.PopulationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * Index Controller.
 * 메인 UI 출력
 * @author sykim@ntels.com
 */
@Controller
public class IndexController {
    /**
     * Request Service
     */
    @Autowired
    PopulationServiceImpl populationServiceImpl;

    /**
     * 서울시 모든 자치구 리스트
     */
    public static List<Row> allList;

    /**
     * 기본 페이지 출력
     * @return "population_read.jsp"
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String populations(Model model) {
        allList = populationServiceImpl.requestPopulation();
        model.addAttribute("seoulList", allList);
        model.addAttribute("resultList",allList);
        return "population_read";
    }
}
