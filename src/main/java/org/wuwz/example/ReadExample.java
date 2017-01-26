package org.wuwz.example;

import java.io.File;
import java.util.List;

import org.wuwz.poi.ExcelKit;
import org.wuwz.poi.OnReadDataHandler;

import com.google.common.collect.Lists;

public class ReadExample {
	
	public static void main(String[] args) {
		final List<User> users = Lists.newArrayList();
		
		//导入数据。
		File excelFile = new File("C:\\Users\\Administrator\\Desktop\\excel.xlsx");
		ExcelKit.$Import().readExcel(excelFile, new OnReadDataHandler() {
			
			@Override
			public void handler(List<String> rowData) {
				User u = new User();
				u.setUid(Integer.valueOf(rowData.get(0)));
				u.setUsername(rowData.get(1));
				u.setPassword(rowData.get(2));
				u.setNickname(rowData.get(3));
				
				u.setAge(18);
				users.add(u);
				
			}
		});
		
		System.out.println(users);
	}

}
