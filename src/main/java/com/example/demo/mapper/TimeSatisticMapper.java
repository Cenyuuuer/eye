package com.example.demo.mapper;

import com.example.demo.dao.TimeSatistic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TimeSatisticMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_satistic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_satistic
     *
     * @mbg.generated
     */
    int insert(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_satistic
     *
     * @mbg.generated
     */
    TimeSatistic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_satistic
     *
     * @mbg.generated
     */
    List<TimeSatistic> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_satistic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeSatistic record);
    TimeSatistic selectByUserId(String userId);
}