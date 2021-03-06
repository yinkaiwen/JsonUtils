package com.example.kevin.jsonutils.javabean;

/**
 * Created by kevin on 2018/1/25.
 * https://github.com/yinkaiwen
 */

public class User {

    /**
     * user : {"name":"alex","age":"18","isMan":true}
     */

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * name : alex
         * age : 18
         * isMan : true
         */

        private String name;
        private String age;
        private boolean isMan;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public boolean isIsMan() {
            return isMan;
        }

        public void setIsMan(boolean isMan) {
            this.isMan = isMan;
        }

        @Override
        public String toString() {
            return "UserBean{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", isMan=" + isMan +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "user=" + user +
                '}';
    }
}
