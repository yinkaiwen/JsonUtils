package com.example.kevin.jsonutils.javabean;

/**
 * Created by kevin on 2018/1/25.
 * https://github.com/yinkaiwen
 */

public class HealthInfo {




    private int code;
    private String msg;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * height : 188
         * weight : 88
         * blood : B型
         */

        private String height;
        private String weight;
        private String blood;

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getBlood() {
            return blood;
        }

        public void setBlood(String blood) {
            this.blood = blood;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "height='" + height + '\'' +
                    ", weight='" + weight + '\'' +
                    ", blood='" + blood + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HealthInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
