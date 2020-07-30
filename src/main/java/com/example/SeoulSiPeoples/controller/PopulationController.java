package com.example.SeoulSiPeoples.controller;
import com.example.SeoulSiPeoples.model.ParamModel;
import com.example.SeoulSiPeoples.model.seoul.Row;
import com.example.SeoulSiPeoples.service.PopulationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import static com.example.SeoulSiPeoples.controller.IndexController.allList;

/**
 * 서울시 인구 통계 상세 조회 요청 처리
 * @Author sykim@ntels.com
 */
@Controller
public class PopulationController {
    /**
     * Request Service
     */
    @Autowired
    PopulationServiceImpl populationServiceImpl;

    /**
     * 자치구 조회 요청 처리
     * @param model model
     * @param select 자치구 명
     * @return "population_read.jsp"
     */
    @RequestMapping(value = "/findJachigu", method = RequestMethod.GET)
    public String selectGu(Model model, String select) {
        ParamModel.jachigu = select;
        List<Row> list = populationServiceImpl.requestPopulation();
        model.addAttribute("resultList",list);
        model.addAttribute("seoulList", allList);
        return "population_read";
    }

    /**
     * 기간 조회 요청 처리
     * @param model model
     * @param dates 조회 기간
     * @return "population_read.jsp"
     */
    @RequestMapping(value= "/findDate", method = RequestMethod.GET)
    public String findDate(Model model, String dates) {
        ParamModel.dates = dates;
        List<Row> list = populationServiceImpl.requestPopulation();
        model.addAttribute("resultList", list);
        model.addAttribute("seoulList", allList);
        return "population_read";
    }
}
