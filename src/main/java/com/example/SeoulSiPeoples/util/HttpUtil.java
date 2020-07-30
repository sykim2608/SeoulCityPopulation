package com.example.SeoulSiPeoples.util;

import com.example.SeoulSiPeoples.model.ParamModel;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Http 기반 API 요청을 처리하기 위한 클래스
 * @author sykim@ntels.com
 */
@Component
public class HttpUtil {
    public String requestApi() {
        String url = "http://openapi.seoul.go.kr:8088/6a537369566b7379343670556f6164/json/octastatapi419/1/26/";
        String link;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity(headers);

        link = new StringBuilder(url).append(ParamModel.dates).append("/").append(ParamModel.jachigu).toString();

        System.out.println("link: "+ link);
        ResponseEntity<String> responseEntity = restTemplate.exchange(link, HttpMethod.GET, entity, String.class);

        return responseEntity.getBody();

    }
}
