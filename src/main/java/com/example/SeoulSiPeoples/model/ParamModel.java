package com.example.SeoulSiPeoples.model;

/**
 * API 요청 URL 인자
 * @Author sykim@ntels.com
 */
public class ParamModel {
    /**
     * 데이터 조회 기간
     */
    private String dates = "";
    /**
     * 조회할 자치구 명
     */
    private String jachigu = "";

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getJachigu() {
        return jachigu;
    }

    public void setJachigu(String jachigu) {
        this.jachigu = jachigu;
    }

}
