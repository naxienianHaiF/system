package com.baobeisystem.dao.waiwang;

import com.baobeisystem.entity.DBArea;

public interface DBAreaDao {

	DBArea getDBAreaByUsername(String str);
	//����������ѯ����ǰ׺
	String getLicensePrefixByShortname(String str);
}
