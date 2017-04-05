/**
 * @author LiuYanliang
 */
package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bert.util.ExcelUtil;

/**
 * @author LiuYanliang
 */
public class TestExportByMap {
  public static void main(String[] args) throws IOException {
    List<Map<String,Object>> list = new ArrayList<>();
    Map<String,Object> map1 =new HashMap<String, Object>();
    map1.put("name", "lili");
    map1.put("age", 16);
    map1.put("sex", 1);
    
    
    Map<String,Object> map2 =new HashMap<String, Object>();
    map2.put("name", "lucy");
    map2.put("age", 18);
    map2.put("sex", 2);
    list.add(map1);
    list.add(map2);
    
    File f= new File("D:/test.xls");
    OutputStream out = new FileOutputStream(f);
    ExcelUtil.exportExcel(new String[]{"name","age","sex"},list, out );
    out.close();
  }
}
