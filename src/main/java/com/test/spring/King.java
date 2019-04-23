package com.test.spring;

// 国王
public interface King {
    // 命令
    void order();
}

// 皇冠
class ImperialCrown {}

// 国王实现类
class KingImpl implements King {
    // 名字
    private String name;
    // 皇冠
    private ImperialCrown imperialCrown;
    // 将军
    private General general;
    // 作战地点
    private String placeName;

    // 构造方法传入名字和皇冠
    public KingImpl(String name, ImperialCrown imperialCrown) {
        this.imperialCrown = imperialCrown;
        this.name = name;
    }

    // set方法传入将军
    public void setGeneral(General general) {
        this.general = general;
    }

    // set方法传入作战地点
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    // 命令
    @Override
    public void order() {
        System.out.println("我是" + name + "，命令" + general.getName() + "现在出征" + placeName + "！");
        general.goToWar(placeName);
    }
}