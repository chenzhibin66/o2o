package com.nuc.o2o.enums;

/**
 * @author Calvin
 * @Description:使用枚举表述常量数据字典
 */
public enum ShopStateEnum {
    CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"),
    SUCCESS(1, "操作成功"), PASS(2, "通过认证"),
    INNER_ERROR(-1001, "内部系统错误"), NULL_SHOP(-1003, "shop信息为空");

    private int state;
    private String stateInfo;

    private ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    /**
     * 根据传入的state返回相应的enum值
     *
     * @param state
     * @return
     */
    public static ShopStateEnum stateOf(int state) {
        for (ShopStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }
}
