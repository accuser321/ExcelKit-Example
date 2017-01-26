package org.wuwz.example;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.wuwz.poi.ExcelKit;

import com.google.common.collect.Lists;

@WebServlet("/example")
@SuppressWarnings("serial")
public class ExampleExport extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<User> users = Lists.newArrayList();
		for (int i = 0; i < 300; i++) {
			User e = new User();
			e.setUid(i + 1);
			e.setUsername("USERNAME_" + (i + 1));
			e.setPassword("asdasdasdasd");
			e.setNickname("NICKNAME_" + (i + 1));
			e.setAge(18);
			users.add(e);
		}
		
		// 生成Excel并使用浏览器下载
		ExcelKit.$Export(User.class, response).toExcel(users, "用户信息");
	}
}
