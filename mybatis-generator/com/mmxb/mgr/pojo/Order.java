package com.mmxb.mgr.pojo;

import java.util.Date;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_id
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.car_id
     *
     * @mbggenerated
     */
    private Integer carId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.out_time
     *
     * @mbggenerated
     */
    private Date outTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.back_time
     *
     * @mbggenerated
     */
    private Date backTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.is_feedback
     *
     * @mbggenerated
     */
    private Integer isFeedback;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_satus
     *
     * @mbggenerated
     */
    private String orderSatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.other_server
     *
     * @mbggenerated
     */
    private String otherServer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_id
     *
     * @return the value of orders.order_id
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_id
     *
     * @param orderId the value for orders.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.car_id
     *
     * @return the value of orders.car_id
     *
     * @mbggenerated
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.car_id
     *
     * @param carId the value for orders.car_id
     *
     * @mbggenerated
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.out_time
     *
     * @return the value of orders.out_time
     *
     * @mbggenerated
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.out_time
     *
     * @param outTime the value for orders.out_time
     *
     * @mbggenerated
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.back_time
     *
     * @return the value of orders.back_time
     *
     * @mbggenerated
     */
    public Date getBackTime() {
        return backTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.back_time
     *
     * @param backTime the value for orders.back_time
     *
     * @mbggenerated
     */
    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.is_feedback
     *
     * @return the value of orders.is_feedback
     *
     * @mbggenerated
     */
    public Integer getIsFeedback() {
        return isFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.is_feedback
     *
     * @param isFeedback the value for orders.is_feedback
     *
     * @mbggenerated
     */
    public void setIsFeedback(Integer isFeedback) {
        this.isFeedback = isFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_satus
     *
     * @return the value of orders.order_satus
     *
     * @mbggenerated
     */
    public String getOrderSatus() {
        return orderSatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_satus
     *
     * @param orderSatus the value for orders.order_satus
     *
     * @mbggenerated
     */
    public void setOrderSatus(String orderSatus) {
        this.orderSatus = orderSatus == null ? null : orderSatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.memo
     *
     * @return the value of orders.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.memo
     *
     * @param memo the value for orders.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.other_server
     *
     * @return the value of orders.other_server
     *
     * @mbggenerated
     */
    public String getOtherServer() {
        return otherServer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.other_server
     *
     * @param otherServer the value for orders.other_server
     *
     * @mbggenerated
     */
    public void setOtherServer(String otherServer) {
        this.otherServer = otherServer == null ? null : otherServer.trim();
    }
}