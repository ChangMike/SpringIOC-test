package com.test.spring;

// 将军
public interface General {
    // 打仗
    public void goToWar(String placeName); // 地方

    public String getName();
}
//剑
class Sword {}

//盔甲
class Corselet {}

// 将军实现类
class GeneralImpl implements General {
    // 名字
    private String name;
    // 宝剑
    private Sword sword;
    // 战马
    private String horse;
    // 盔甲
    private Corselet corselet;

    // 构造方法传入名字和宝剑
    public GeneralImpl(String name, Sword sword) {
        this.name = name;
        this.sword = sword;
    }

    // set方法传入战马
    public void setHorse(String horse) {
        this.horse = horse;
    }

    // set方法传入盔甲
    public void setCorselet(Corselet corselet) {
        this.corselet = corselet;
    }

    @Override
    public void goToWar(String placeName) {
        System.out.println("我是" + name + "，现在奉命出征" + placeName + "！");
    }

    @Override
    public String getName() {
        return name;
    }
}