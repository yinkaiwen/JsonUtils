package com.example.kevin.jsonutils;

/**
 * Created by kevin on 2018/1/25.
 * https://github.com/yinkaiwen
 */

public class JsonBean {

    public static final String user = "{\n" +
            "    \"user\":{\n" +
            "        \"name\":\"alex\",\n" +
            "        \"age\":\"18\",\n" +
            "        \"isMan\":true\n" +
            "    }\n" +
            "}";

    public static final String user_no_name = "{\n" +
            "\t\"user\": {\n" +
            "\t\t\"age\": \"18\",\n" +
            "\t\t\"isMan\": true\n" +
            "\t}\n" +
            "}";

    public static final String user_list = "{\n" +
            "    \"user\":[\n" +
            "        {\n" +
            "            \"name\":\"alex\",\n" +
            "            \"age\":\"18\",\n" +
            "            \"isMan\":true\n" +
            "        },\n" +
            "        {\n" +
            "            \"name\":\"alex\",\n" +
            "            \"age\":\"18\",\n" +
            "            \"isMan\":true\n" +
            "        }\n" +
            "    ]\n" +
            "\n" +
            "}";

    public static final String health_info = "{\n" +
            "\t\"code\": 1,\n" +
            "\t\"msg\": \"ok\",\n" +
            "\t\"result\": {\n" +
            "\t\t\"height\": \"188\",\n" +
            "\t\t\"weight\": \"88\",\n" +
            "\t\t\"blood\": \"B\"\n" +
            "\t}\n" +
            "}";

    public static final String complext_list = "{\n" +
            "\t\"code\": \"1\",\n" +
            "\t\"msg\": \"success\",\n" +
            "\t\"result\": [{\n" +
            "\t\t\"uid\": \"25035831\",\n" +
            "\t\t\"piv\": \"150\",\n" +
            "\t\t\"pav\": \"22\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035832\",\n" +
            "\t\t\"piv\": \"98\",\n" +
            "\t\t\"pav\": \"17\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035840\",\n" +
            "\t\t\"piv\": \"24\",\n" +
            "\t\t\"pav\": \"0\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035846\",\n" +
            "\t\t\"piv\": \"4\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035852\",\n" +
            "\t\t\"piv\": \"174\",\n" +
            "\t\t\"pav\": \"17\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035858\",\n" +
            "\t\t\"piv\": \"204\",\n" +
            "\t\t\"pav\": \"35\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035880\",\n" +
            "\t\t\"piv\": \"3\",\n" +
            "\t\t\"pav\": \"0\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035945\",\n" +
            "\t\t\"piv\": \"11\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035958\",\n" +
            "\t\t\"piv\": \"110\",\n" +
            "\t\t\"pav\": \"8\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035965\",\n" +
            "\t\t\"piv\": \"34\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035986\",\n" +
            "\t\t\"piv\": \"18\",\n" +
            "\t\t\"pav\": \"3\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035987\",\n" +
            "\t\t\"piv\": \"65\",\n" +
            "\t\t\"pav\": \"19\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25035988\",\n" +
            "\t\t\"piv\": \"114\",\n" +
            "\t\t\"pav\": \"9\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036030\",\n" +
            "\t\t\"piv\": \"1\",\n" +
            "\t\t\"pav\": \"0\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036181\",\n" +
            "\t\t\"piv\": \"10\",\n" +
            "\t\t\"pav\": \"2\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036182\",\n" +
            "\t\t\"piv\": \"8\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036195\",\n" +
            "\t\t\"piv\": \"15\",\n" +
            "\t\t\"pav\": \"5\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036216\",\n" +
            "\t\t\"piv\": \"33\",\n" +
            "\t\t\"pav\": \"11\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036221\",\n" +
            "\t\t\"piv\": \"8\",\n" +
            "\t\t\"pav\": \"7\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036224\",\n" +
            "\t\t\"piv\": \"38\",\n" +
            "\t\t\"pav\": \"8\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036358\",\n" +
            "\t\t\"piv\": \"4\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036409\",\n" +
            "\t\t\"piv\": \"1\",\n" +
            "\t\t\"pav\": \"0\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"25036456\",\n" +
            "\t\t\"piv\": \"4\",\n" +
            "\t\t\"pav\": \"10\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"26000040\",\n" +
            "\t\t\"piv\": \"45\",\n" +
            "\t\t\"pav\": \"30\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"26001024\",\n" +
            "\t\t\"piv\": \"5\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}, {\n" +
            "\t\t\"uid\": \"26001037\",\n" +
            "\t\t\"piv\": \"3\",\n" +
            "\t\t\"pav\": \"1\"\n" +
            "\t}]\n" +
            "}";
}
