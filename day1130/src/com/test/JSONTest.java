package com.test;

import com.bean.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTest {
    @Test
    public void test1() {
        //JavaBean和json的互转
        Person person = new Person(1, 15, "小刚", 'F');
        //创建Gson对象实例
        Gson gson = new Gson();
        //把person对象 转成JSON字符串
        String personJSONStr = gson.toJson(person);
        System.out.println(personJSONStr);
        //把JSON字符串 转成JAVABEAN对象
        Person p = gson.fromJson(personJSONStr, Person.class);
        System.out.println("p对象 = " + p);
    }

    @Test
    public void test02() {
        //List和JSON互转
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, 15, "小刚", 'F'));
        personList.add(new Person(2, 16, "小强", 'M'));
        Gson gson = new Gson();
        //List转换成JSON字符串
        String jsonStr = gson.toJson(personList);
        System.out.println(jsonStr);
        //JSON字符串转LIST
        List<Person> list = gson.fromJson(jsonStr, new TypeToken<List<Person>>() {
        }.getType());
        System.out.println(list);
    }

    @Test
    public void test03() {
        //MAP和JSON互转
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, 15, "小刚", 'F'));
        personMap.put(2, new Person(2, 16, "小强", 'M'));
        Gson gson = new Gson();
        //MAP转换成JSON字符串
        String jsonStr = gson.toJson(personMap);
        System.out.println(jsonStr);
        //JSON字符串转MAP
        Map<Integer, Person> map = gson.fromJson(jsonStr, new TypeToken<Map<Integer, Person>>() {
        }.getType());
        System.out.println(map);
    }
}
