package com.example.SeoulSiPeoples.model.seoul;

import java.util.List;

/**
 * API 요청에 대한 octastatapi419 모델
 * @author sykim@ntels.com
 */
public class Octastatapi419 {
    /**
     * 리스트 Total Count
     */
    private int list_total_count;
    /**
     * 결과 메시지
     */
    private Result RESULT;
    /**
     * 결과 데이터
     */
    private List<Row> row;

    public List<Row> getRow() {
        return row;
    }

    public void setRow(List<Row> row) {
        this.row = row;
    }

    public int getList_total_count() {
        return list_total_count;
    }

    public void setList_total_count(int list_total_count) {
        this.list_total_count = list_total_count;
    }

    public Result getRESULT() {
        return RESULT;
    }

    public void setRESULT(Result RESULT) {
        this.RESULT = RESULT;
    }

    @Override
    public String toString() {
        return "Octastatapi419{" +
                "list_total_count=" + list_total_count +
                ", RESULT=" + RESULT +
                ", row=" + row +
                '}';
    }
}
