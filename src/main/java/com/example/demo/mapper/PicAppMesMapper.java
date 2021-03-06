package com.example.demo.mapper;

import com.example.demo.dao.PicAppMes;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Date;
import java.util.List;

@Mapper
public interface PicAppMesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_app_mes
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_app_mes
     *
     * @mbg.generated
     */
    int insert(PicAppMes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_app_mes
     *
     * @mbg.generated
     */
    PicAppMes selectByPrimaryKey(Integer appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_app_mes
     *
     * @mbg.generated
     */
    List<PicAppMes> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pic_app_mes
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PicAppMes record);
    Date getfabuDate(String userId, String appSubject);
    int selectMaxappid();
    List<PicAppMes> getAppsByUserId(String userId);
    List<PicAppMes> selectBycity(String region, int solve);
    int selectCountByUserId(String userId);
    //修改悬赏的状态
    int changeAppState(int appId, int solve);
    //获取一个发布悬赏的userId
    String selectUserIdByAppId(int appId);

}