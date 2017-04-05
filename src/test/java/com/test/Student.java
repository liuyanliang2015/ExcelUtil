/**
 * @author LiuYanliang
 */
package com.test;

import com.bert.model.ExcelCell;

/**
 * 模拟实体Student，注意属性前需要加注解
 * @author LiuYanliang
 */
public class Student {
    @ExcelCell(index = 0)
    private String name;
    @ExcelCell(index = 1)
    private Integer age;
    @ExcelCell(index = 2)
    private Integer sex;

    public Student(String name, Integer age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
