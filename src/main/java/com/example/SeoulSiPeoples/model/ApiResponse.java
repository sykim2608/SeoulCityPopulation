package com.example.SeoulSiPeoples.model;

import com.example.SeoulSiPeoples.model.seoul.Octastatapi419;

/**
 * Api 요청에 대한 응답 Body 모델
 * @Author sykim@ntels.com
 */
public class ApiResponse {
    /**
     * Octastatapi
     */
    private Octastatapi419 octastatapi419;

    public Octastatapi419 getOctastatapi419() {
        return octastatapi419;
    }

    public void setOctastatapi419(Octastatapi419 octastatapi419) {
        this.octastatapi419 = octastatapi419;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "octastatapi419=" + octastatapi419 +
                '}';
    }
}
