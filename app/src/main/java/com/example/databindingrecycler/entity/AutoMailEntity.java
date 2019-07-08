package com.example.databindingrecycler.entity;

import androidx.databinding.BaseObservable;

import java.util.List;

public class AutoMailEntity extends BaseObservable {

    /**
     * state : access
     * info : 加载成功！
     * date : [{"product_id":"1","product_name":"HGM72","product_feature":"单相机组自动化","cishu":"0"},{"product_id":"2","product_name":"MGC100","product_feature":"小体积+数码管显示+多类型交流电压输入","cishu":"0"},{"product_id":"3","product_name":"HGM410","product_feature":"小体积+大液晶","cishu":"0"},{"product_id":"4","product_name":"HGM420","product_feature":"体积小+大液晶+AMF","cishu":"0"},{"product_id":"5","product_name":"HGM410CAN","product_feature":"小体积+大液晶+CANBUS","cishu":"0"},{"product_id":"6","product_name":"HGM420CAN","product_feature":"体积小+大液晶+AMF+CANBUS","cishu":"0"},{"product_id":"7","product_name":"HGM410C","product_feature":"单台柴油发电机组自动控制","cishu":"0"},{"product_id":"8","product_name":"HGM410DC","product_feature":"直流发电机组自动控制","cishu":"0"},{"product_id":"9","product_name":"HGM501","product_feature":"汽油机控制+数码管显示","cishu":"0"},{"product_id":"10","product_name":"HSC940","product_feature":"小体积+燃气机组控制","cishu":"0"},{"product_id":"11","product_name":"HSC960","product_feature":"硅胶面板+燃气机组控制","cishu":"0"},{"product_id":"12","product_name":"HGM1750","product_feature":"机组保护+LCD显示","cishu":"0"},{"product_id":"13","product_name":"HGM1770","product_feature":"LCD显示+单相机组控制","cishu":"0"},{"product_id":"14","product_name":"HGM1780","product_feature":"LCD显示+单相机组控制+电流检测","cishu":"0"},{"product_id":"15","product_name":"HGM6110U","product_feature":"LCD显示+硅胶面板","cishu":"0"},{"product_id":"16","product_name":"HGM6120U","product_feature":"LCD显示+硅胶面板+AMF","cishu":"0"},{"product_id":"17","product_name":"HGM6320T","product_feature":"适用于通信基站","cishu":"0"},{"product_id":"18","product_name":"HGM7210","product_feature":"历史记录+RS485+短信控制+调度控制","cishu":"0"},{"product_id":"19","product_name":"HGM7220","product_feature":"历史记录+RS485+短信控制+调度控制+AMF","cishu":"0"},{"product_id":"20","product_name":"HGM7211","product_feature":"彩屏显示+RS485+短信控制+调度控制","cishu":"0"}]
     */

    private String state;
    private String info;
    private List<DateBean> date;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<DateBean> getDate() {
        return date;
    }

    public void setDate(List<DateBean> date) {
        this.date = date;
    }

    public static class DateBean {
        /**
         * product_id : 1
         * product_name : HGM72
         * product_feature : 单相机组自动化
         * cishu : 0
         */

        private String product_id;
        private String product_name;
        private String product_feature;
        private String cishu;

        public String getProduct_id() {
            return product_id;
        }

        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }

        public String getProduct_name() {
            return product_name;
        }

        public void setProduct_name(String product_name) {
            this.product_name = product_name;
        }

        public String getProduct_feature() {
            return product_feature;
        }

        public void setProduct_feature(String product_feature) {
            this.product_feature = product_feature;
        }

        public String getCishu() {
            return cishu;
        }

        public void setCishu(String cishu) {
            this.cishu = cishu;
        }
    }
}
