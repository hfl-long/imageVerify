package cn.lonecloud.model;

import java.util.List;

/**
 * Created by lonecloud on 17/2/6.
 */
public class GenerateImageGroup {
    /**
     * 正确对象的group
     */
    private ImageGroup keyGroup;
    /**
     * 修饰对象group
     */
    private List<ImageGroup> groups;

    public GenerateImageGroup(ImageGroup keyGroup, List<ImageGroup> groups) {
        this.keyGroup = keyGroup;
        this.groups = groups;
    }

    public ImageGroup getKeyGroup() {
        return keyGroup;
    }

    public void setKeyGroup(ImageGroup keyGroup) {
        this.keyGroup = keyGroup;
    }

    public List<ImageGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ImageGroup> groups) {
        this.groups = groups;
    }
}
