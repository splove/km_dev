package com.kmzyc.supplier.action;


import org.slf4j.Logger;import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.km.framework.action.BaseAction;

/**
 * @author weishanyao
 */
@Controller("uploadAction")
@Scope("prototype")
public class UploadAction extends BaseAction {

    private static final long serialVersionUID = 4946792413894595036L;

    static Logger logger = LoggerFactory.getLogger(UploadAction.class);

    private String toPerform;

    private String savePath = "uploadFile"; // 上传到服务器的路径,请先自建好

    private long fileMaximumSize = 5 * 1024 * 1024; // 上传文件的大小限制，

    private String[] allowTypes = {".gif", ".txt"};

    public String uploadFile() {
        if ("edit".equals(toPerform)) { //上传
            String uploadResult = uploadFile(fileMaximumSize, allowTypes, savePath);
            if (uploadResult != null) {
                getRequest().setAttribute("uploadResult", "上传成功！文件名为：" + uploadResult);
                return SUCCESS;
            }
            getRequest().setAttribute("uploadResult", "上传失败！");
        }

        return INPUT;
    }

    public String[] getAllowTypes() {
        String[] tempAllowTypes = allowTypes;
        return tempAllowTypes;
    }

    public void setAllowTypes(String[] allowTypes) {
        String[] tempAllowTypes = allowTypes;
        this.allowTypes = tempAllowTypes;
    }

    public String getToPerform() {
        return toPerform;
    }

    public void setToPerform(String toPerform) {
        this.toPerform = toPerform;
    }

}
