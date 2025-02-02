package com.dao;

import com.entity.CaiwubaoxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwubaoxiaoView;

/**
 * 财务报销 Dao 接口
 *
 * @author 
 */
public interface CaiwubaoxiaoDao extends BaseMapper<CaiwubaoxiaoEntity> {

   List<CaiwubaoxiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
package com.dao;

import com.entity.CaiwubaoxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwubaoxiaoView;

/**
 * 财务报销 Dao 接口
 *
 * @author 
 */
public interface CaiwubaoxiaoDao extends BaseMapper<CaiwubaoxiaoEntity> {

   List<CaiwubaoxiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
