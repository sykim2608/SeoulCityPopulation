package com.example.SeoulSiPeoples.model.seoul;

/**
 * API Response Body 내 응답 코드 및 메시지
 * @author sykim@ntels.com
 */
public class Result {
    /**
     * 결과 코드
     */
    private String CODE;
    /**
     * 결과 메시지
     */
    private String MESSAGE;

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    @Override
    public String toString() {
        return "Result{" +
                "CODE='" + CODE + '\'' +
                ", MESSAGE='" + MESSAGE + '\'' +
                '}';
    }
}
