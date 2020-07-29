package com.example.SeoulSiPeoples.model.seoul;

/**
 * API 요청에 대한 서울시 인구 정보 리스트 모델
 * @author sykim@ntels.com
 */
public class Row {
    /**
     * 조회 기간
     */
    private String GIGAN;
    /**
     * 서울시 내 자치구 위치
     */
    private String JACHIGU;
    /**
     * 세대 수
     */
    private String SEDAE;
    /**
     * 결과값의 총 인구 수
     */
    private String GYE_1;
    /**
     * 결과값의 총 남자 인구 수
     */
    private String NAMJA_1;
    /**
     * 결과값의 총 여자 인구 수
     */
    private String YEOJA_1;
    /**
     * 내국인 총 인구 수
     */
    private String GYE_2;
    /**
     * 내국 총 남자 인구 수
     */
    private String NAMJA_2;
    /**
     * 내국인 총 여자 인구 수
     */
    private String YEOJA_2;
    /**
     *  외국인 총 인구 수
     */
    private String GYE_3;
    /**
     *  외국인 총 남자 인구 수
     */
    private String NAMJA_3;
    /**
     *  외국인 총 여자 인구 수
     */
    private String YEOJA_3;
    /**
     *  세대 당 인구 수
     */
    private String SEDAEDANGINGU;

    /**
     *  65세 이상 고령자 수
     */
    private String N_65SEISANGGORYEONGJA;

    public void setGIGAN(String GIGAN){
        this.GIGAN = GIGAN;
    }
    public String getGIGAN(){
        return this.GIGAN;
    }
    public void setJACHIGU(String JACHIGU){
        this.JACHIGU = JACHIGU;
    }
    public String getJACHIGU(){
        return this.JACHIGU;
    }
    public void setSEDAE(String SEDAE){
        this.SEDAE = SEDAE;
    }
    public String getSEDAE(){
        return this.SEDAE;
    }
    public void setGYE_1(String GYE_1){
        this.GYE_1 = GYE_1;
    }
    public String getGYE_1(){
        return this.GYE_1;
    }
    public void setNAMJA_1(String NAMJA_1){
        this.NAMJA_1 = NAMJA_1;
    }
    public String getNAMJA_1(){
        return this.NAMJA_1;
    }
    public void setYEOJA_1(String YEOJA_1){
        this.YEOJA_1 = YEOJA_1;
    }
    public String getYEOJA_1(){
        return this.YEOJA_1;
    }
    public void setGYE_2(String GYE_2){
        this.GYE_2 = GYE_2;
    }
    public String getGYE_2(){
        return this.GYE_2;
    }
    public void setNAMJA_2(String NAMJA_2){
        this.NAMJA_2 = NAMJA_2;
    }
    public String getNAMJA_2(){
        return this.NAMJA_2;
    }
    public void setYEOJA_2(String YEOJA_2){
        this.YEOJA_2 = YEOJA_2;
    }
    public String getYEOJA_2(){
        return this.YEOJA_2;
    }
    public void setGYE_3(String GYE_3){
        this.GYE_3 = GYE_3;
    }
    public String getGYE_3(){
        return this.GYE_3;
    }
    public void setNAMJA_3(String NAMJA_3){
        this.NAMJA_3 = NAMJA_3;
    }
    public String getNAMJA_3(){
        return this.NAMJA_3;
    }
    public void setYEOJA_3(String YEOJA_3){
        this.YEOJA_3 = YEOJA_3;
    }
    public String getYEOJA_3(){
        return this.YEOJA_3;
    }
    public void setSEDAEDANGINGU(String SEDAEDANGINGU){
        this.SEDAEDANGINGU = SEDAEDANGINGU;
    }
    public String getSEDAEDANGINGU(){
        return this.SEDAEDANGINGU;
    }
    public void setN_65SEISANGGORYEONGJA(String N_65SEISANGGORYEONGJA){
        this.N_65SEISANGGORYEONGJA = N_65SEISANGGORYEONGJA;
    }
    public String getN_65SEISANGGORYEONGJA(){
        return this.N_65SEISANGGORYEONGJA;
    }

    @Override
    public String toString() {
        return "Row{" +
                "GIGAN='" + GIGAN + '\'' +
                ", JACHIGU='" + JACHIGU + '\'' +
                ", SEDAE='" + SEDAE + '\'' +
                ", GYE_1='" + GYE_1 + '\'' +
                ", NAMJA_1='" + NAMJA_1 + '\'' +
                ", YEOJA_1='" + YEOJA_1 + '\'' +
                ", GYE_2='" + GYE_2 + '\'' +
                ", NAMJA_2='" + NAMJA_2 + '\'' +
                ", YEOJA_2='" + YEOJA_2 + '\'' +
                ", GYE_3='" + GYE_3 + '\'' +
                ", NAMJA_3='" + NAMJA_3 + '\'' +
                ", YEOJA_3='" + YEOJA_3 + '\'' +
                ", SEDAEDANGINGU='" + SEDAEDANGINGU + '\'' +
                ", N_65SEISANGGORYEONGJA='" + N_65SEISANGGORYEONGJA + '\'' +
                '}';
    }
}
