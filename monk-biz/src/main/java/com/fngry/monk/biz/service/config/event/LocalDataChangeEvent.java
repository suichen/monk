package com.fngry.monk.biz.service.config.event;

/**
 * 数据变更事件
 * Created by gaorongyu on 2017/11/11.
 */
public class LocalDataChangeEvent extends Event {

    private String groupKey;

    private long changeTime;

    public LocalDataChangeEvent() {
        super(null);
    }

    public LocalDataChangeEvent(Object source) {
        super(source);
    }

    public LocalDataChangeEvent(Object source, String groupKey, long changeTime) {
        super(source);
        this.groupKey = groupKey;
        this.changeTime = changeTime;

    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public long getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(long changeTime) {
        this.changeTime = changeTime;
    }

}
