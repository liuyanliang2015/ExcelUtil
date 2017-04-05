package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.bert.util.ExcelUtil;

public class TestExportByModel {
    public static void main(String[] args) throws IOException {
        String[] headers = {"姓名","年龄","性别"};
        Collection<Object> dataset = new ArrayList<Object>();
        dataset.add(new Student("lili", 18, 2));
        dataset.add(new Student("lucy", 20, 2));
        dataset.add(new Student("lilei", 16, 1));
        File f = new File("D:/test.xls");
        OutputStream out = new FileOutputStream(f);
        ExcelUtil.exportExcel(headers, dataset, out);
        out.close();
    }
}
