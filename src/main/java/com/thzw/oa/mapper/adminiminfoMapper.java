package com.thzw.oa.mapper;

import com.thzw.oa.entity.adminiminfo;

public interface adminiminfoMapper {
    int deleteByPrimaryKey(Integer imid);

    int insert(adminiminfo record);

    int insertSelective(adminiminfo record);

    adminiminfo selectByPrimaryKey(Integer imid);

    int updateByPrimaryKeySelective(adminiminfo record);

    int updateByPrimaryKeyWithBLOBs(adminiminfo record);

    int updateByPrimaryKey(adminiminfo record);
}