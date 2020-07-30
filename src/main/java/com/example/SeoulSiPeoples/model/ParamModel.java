package com.example.SeoulSiPeoples.model;

/**
 * 인구 조회 상세 요청 모델
 * @Author sykim@ntels.com
 */
public class ParamModel {
    /**
     * 데이터 조회 기간
     */
    public static String dates = "2010.1-4";
    /**
     * 조회할 자치구 명
     */
    public static String jachigu = "";

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

    @Override
    public String toString() {
        return super.toString();
    }
}
