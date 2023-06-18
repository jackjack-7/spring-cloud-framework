package com.infra.provider;

import com.github.pagehelper.PageInfo;
import com.infra.user.model.domain.UacUser;
import com.infra.user.service.UacUserService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


/**
 * The class Uac user service test.
 * @author paascloud.net@gmail.com
 */
public class UacUserServiceTest extends UserApplicationTests {
	@Resource
	private UacUserService uacUserService;

	/**
	 * Find by login name test.
	 */
	@Test
	public void findByLoginNameTest() {
		List<UacUser> uacUsers = uacUserService.selectAll();
		logger.info("findByLoginNameTest = {}", uacUsers);
	}

	/**
	 * Query user list with page test.
	 */
	@Test
	public void queryUserListWithPageTest() {
		PageInfo pageInfo = uacUserService.queryUserListWithPage(new UacUser());
		logger.info("queryUserListWithPage = {}", pageInfo);
	}


}
