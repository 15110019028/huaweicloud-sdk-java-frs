package com.huaweicloud.frs.client.result.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.frs.common.JSONObj;

public class Attributes extends JSONObj {

    @JsonProperty(value = "headpose")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private HeadPose headPose;

    @JsonProperty(value = "gender")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String gender;

    @JsonProperty(value = "age")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private Integer age;

    @JsonProperty(value = "dress")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private Dress dress;

    @JsonProperty(value = "smile")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String smile;

    @JsonProperty(value = "mask")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String mask;

    @JsonProperty(value = "hair")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String hair;

    @JsonProperty(value = "beard")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String beard;

    @JsonProperty(value = "skin")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String skin;

    @JsonProperty(value = "ethnic")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String ethnic;

    @JsonProperty(value = "phototype")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String phototype;

    @JsonProperty(value = "quality")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private FaceQuality quality;

    @JsonProperty(value = "expression")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private FaceExpression expression;

    @JsonProperty(value = "face_angle")
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private Integer faceAngle;

    public HeadPose getHeadPose() {
        return headPose;
    }

    public void setHeadPose(HeadPose headPose) {
        this.headPose = headPose;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getBeard() {
        return beard;
    }

    public void setBeard(String beard) {
        this.beard = beard;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }

    public FaceQuality getQuality() {
        return quality;
    }

    public void setQuality(FaceQuality quality) {
        this.quality = quality;
    }

    public FaceExpression getExpression() {
        return expression;
    }

    public void setExpression(FaceExpression expression) {
        this.expression = expression;
    }

    public Integer getFaceAngle() {
        return faceAngle;
    }

    public void setFaceAngle(Integer faceAngle) {
        this.faceAngle = faceAngle;
    }
}
