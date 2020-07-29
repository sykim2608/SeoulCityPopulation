package com.example.SeoulSiPeoples.controller;

import com.example.SeoulSiPeoples.model.DateModel;
import com.example.SeoulSiPeoples.model.ParamModel;
import com.example.SeoulSiPeoples.model.seoul.Row;
import com.example.SeoulSiPeoples.service.PopulationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * 자치구 별 인구 통계 데이터 요청 처리
 * @Author sykim@ntels.com
 */
@Controller
public class PopulationController {
    /**
     * Request Service
     */
    @Autowired
    PopulationServiceImpl populationServiceImpl;

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String selectGu(Model model, String jachigu) {
        ParamModel paramModel = new ParamModel();
        paramModel.setJachigu(jachigu);
        List<Row> list = populationServiceImpl.requestPopulation(paramModel);
        model.addAttribute(list);
        return "population_read";
    }

    @RequestMapping(value= "/findDate", method = RequestMethod.GET)
    public  @ResponseBody List<Row> findDate(@RequestBody DateModel dateModel) {
        ParamModel paramModel = new ParamModel();
        paramModel.setDates(dateModel.getDates());
        List<Row> list = populationServiceImpl.requestPopulation(paramModel);

        return list;

    }
}
