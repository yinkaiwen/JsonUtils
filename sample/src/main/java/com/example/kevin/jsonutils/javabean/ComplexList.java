package com.example.kevin.jsonutils.javabean;

import java.util.List;

/**
 * Created by kevin on 2018/1/25.
 * https://github.com/yinkaiwen
 */

public class ComplexList {

    /**
     * code : 1
     * msg : success
     * result : [{"uid":"25035831","piv":"150","pav":"22"},{"uid":"25035832","piv":"98","pav":"17"},{"uid":"25035840","piv":"24","pav":"0"},{"uid":"25035846","piv":"4","pav":"1"},{"uid":"25035852","piv":"174","pav":"17"},{"uid":"25035858","piv":"204","pav":"35"},{"uid":"25035880","piv":"3","pav":"0"},{"uid":"25035945","piv":"11","pav":"1"},{"uid":"25035958","piv":"110","pav":"8"},{"uid":"25035965","piv":"34","pav":"1"},{"uid":"25035986","piv":"18","pav":"3"},{"uid":"25035987","piv":"65","pav":"19"},{"uid":"25035988","piv":"114","pav":"9"},{"uid":"25036030","piv":"1","pav":"0"},{"uid":"25036181","piv":"10","pav":"2"},{"uid":"25036182","piv":"8","pav":"1"},{"uid":"25036195","piv":"15","pav":"5"},{"uid":"25036216","piv":"33","pav":"11"},{"uid":"25036221","piv":"8","pav":"7"},{"uid":"25036224","piv":"38","pav":"8"},{"uid":"25036358","piv":"4","pav":"1"},{"uid":"25036409","piv":"1","pav":"0"},{"uid":"25036456","piv":"4","pav":"10"},{"uid":"26000040","piv":"45","pav":"30"},{"uid":"26001024","piv":"5","pav":"1"},{"uid":"26001037","piv":"3","pav":"1"}]
     */

    private String code;
    private String msg;
    private List<ResultBean> result;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * uid : 25035831
         * piv : 150
         * pav : 22
         */

        private String uid;
        private String piv;
        private String pav;

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getPiv() {
            return piv;
        }

        public void setPiv(String piv) {
            this.piv = piv;
        }

        public String getPav() {
            return pav;
        }

        public void setPav(String pav) {
            this.pav = pav;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "uid='" + uid + '\'' +
                    ", piv='" + piv + '\'' +
                    ", pav='" + pav + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ComplexList{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
