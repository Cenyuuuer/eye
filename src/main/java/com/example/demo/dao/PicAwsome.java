package com.example.demo.dao;

public class PicAwsome {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pic_awsome.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pic_awsome.answer_id
     *
     * @mbg.generated
     */
    private Integer answerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pic_awsome.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pic_awsome.id
     *
     * @return the value of pic_awsome.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pic_awsome.id
     *
     * @param id the value for pic_awsome.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pic_awsome.answer_id
     *
     * @return the value of pic_awsome.answer_id
     *
     * @mbg.generated
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pic_awsome.answer_id
     *
     * @param answerId the value for pic_awsome.answer_id
     *
     * @mbg.generated
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pic_awsome.user_id
     *
     * @return the value of pic_awsome.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pic_awsome.user_id
     *
     * @param userId the value for pic_awsome.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}