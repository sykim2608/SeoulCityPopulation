package com.example.SeoulSiPeoples.service;

import com.example.SeoulSiPeoples.model.ApiResponse;
import com.example.SeoulSiPeoples.model.ParamModel;
import com.example.SeoulSiPeoples.model.seoul.Row;
import com.example.SeoulSiPeoples.util.HttpUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PopulationServiceImpl implements PopulationService {
    /**
     * Http Util
     */
    @Autowired
    HttpUtil httpUtil;

    @Override
    public List<Row> requestPopulation(ParamModel paramModel) {
        Gson gson = new Gson();

        String str = httpUtil.requestApi(paramModel);

        List<Row> list = gson.fromJson(str, ApiResponse.class).getOctastatapi419().getRow();

        return list;
    }
}

