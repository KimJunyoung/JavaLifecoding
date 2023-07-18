package basic_section5_7.domain.userinfo.dao.mysql;

import basic_section5_7.domain.userinfo.UserInfo;
import basic_section5_7.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());

	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into MySQL DB userID = " + userInfo.getUserId());

	}

}
