package com.example.kevin.jsonutils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2018/1/25.
 * https://github.com/yinkaiwen
 */

public class JsonUtils {
    public static final String UID = "serialVersionUID";

    public JsonUtils() {
    }

    public <T> T jsonString(Class<T> cls, String json) {
        JSONObject obj = null;
        T o = null;
        try {
            obj = new JSONObject(json);
            o = cls.newInstance();
            setInfo(cls, obj, o);
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return o;
    }

    /**
     * Analyse jsonString to some class.
     *
     * @param cls
     * @param obj
     * @param o
     * @throws JSONException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private void setInfo(Class<?> cls, JSONObject obj, Object o) throws JSONException, IllegalAccessException, InstantiationException {
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            //Ignore auto_field that android studio generate.
            if (f.isSynthetic()) continue;
            if (UID.equals(f.getName())) continue;

            String fieldName = null;
            Object value = null;

            fieldName = f.getName();
            // no data,ignore it.
            if (obj.isNull(fieldName)) continue;

            String typeName = f.getType().getSimpleName();
            f.setAccessible(true);

            //Check the type,and save info
            if ("boolean".equals(typeName)) {
                value = obj.getBoolean(fieldName);
                f.setBoolean(o, (Boolean) value);

                continue;
            }

            if ("double".equals(typeName)) {
                value = obj.getDouble(fieldName);
                f.setDouble(o, (Double) value);
                continue;
            }

            if ("int".equals(typeName)) {
                value = obj.getInt(fieldName);
                f.setInt(o, (Integer) value);
                continue;
            }

            if ("long".equals(typeName)) {
                value = obj.getLong(fieldName);
                f.setLong(o, (Long) value);
                continue;
            }

            if ("String".equals(typeName)) {
                value = obj.getString(fieldName);
                f.set(o, (String) value);
                continue;
            }

            if ("List".equals(typeName)) {
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                if (declaredClasses == null || declaredClasses.length == 0) {
                    throw new IllegalArgumentException("The Class is Wrong format");
                }
                JSONArray jsonArray = obj.getJSONArray(fieldName);
                int length = jsonArray.length();
                List list = new ArrayList();
                for (int i = 0; i < length; i++) {

                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    Class<?> c = declaredClasses[0];
                    Object object = c.newInstance();
                    //Use recursion.
                    setInfo(c, jsonObject, object);
                    list.add(object);
                }
                f.set(o, list);
                continue;
            }

            //If field's type is Class, use recursion.
            JSONObject jsonObject = obj.getJSONObject(fieldName);
            Class<?> type = f.getType();
            Object object = type.newInstance();
            setInfo(type, jsonObject, object);
            f.set(o, object);
        }
    }
}
