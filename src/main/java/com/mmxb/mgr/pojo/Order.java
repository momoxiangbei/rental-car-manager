package com.mmxb.mgr.pojo;

import java.util.Date;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_id
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.car_id
     *
     * @mbggenerated
     */
    private Integer carId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.out_time
     *
     * @mbggenerated
     */
    private Date outTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.back_time
     *
     * @mbggenerated
     */
    private Date backTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.is_feedback
     *
     * @mbggenerated
     */
    private Integer isFeedback;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.order_satus
     *
     * @mbggenerated
     */
    private String orderSatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_id
     *
     * @return the value of order.order_id
     *
     * @mbggenerated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_id
     *
     * @param orderId the value for order.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.car_id
     *
     * @return the value of order.car_id
     *
     * @mbggenerated
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.car_id
     *
     * @param carId the value for order.car_id
     *
     * @mbggenerated
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.out_time
     *
     * @return the value of order.out_time
     *
     * @mbggenerated
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.out_time
     *
     * @param outTime the value for order.out_time
     *
     * @mbggenerated
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.back_time
     *
     * @return the value of order.back_time
     *
     * @mbggenerated
     */
    public Date getBackTime() {
        return backTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.back_time
     *
     * @param backTime the value for order.back_time
     *
     * @mbggenerated
     */
    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.is_feedback
     *
     * @return the value of order.is_feedback
     *
     * @mbggenerated
     */
    public Integer getIsFeedback() {
        return isFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.is_feedback
     *
     * @param isFeedback the value for order.is_feedback
     *
     * @mbggenerated
     */
    public void setIsFeedback(Integer isFeedback) {
        this.isFeedback = isFeedback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.order_satus
     *
     * @return the value of order.order_satus
     *
     * @mbggenerated
     */
    public String getOrderSatus() {
        return orderSatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.order_satus
     *
     * @param orderSatus the value for order.order_satus
     *
     * @mbggenerated
     */
    public void setOrderSatus(String orderSatus) {
        this.orderSatus = orderSatus == null ? null : orderSatus.trim();
    }
}