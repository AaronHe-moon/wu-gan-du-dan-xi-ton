<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{RoleOP$ModifyRole.page1}" id="page1">
            <ui:html binding="#{RoleOP$ModifyRole.html1}" id="html1">
                <ui:head binding="#{RoleOP$ModifyRole.head1}" id="head1">
                    <ui:link binding="#{RoleOP$ModifyRole.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{RoleOP$ModifyRole.body1}" id="body1" style="text-align: center; -rave-layout: grid">
                    <ui:form binding="#{RoleOP$ModifyRole.form1}" id="form1">
                        <ui:panelLayout binding="#{RoleOP$ModifyRole.layoutPanel1}" id="layoutPanel1" style="height: 574px; margin-left: auto; margin-right: auto; left: 8px; top: 0px; position: absolute; width: 478px; -rave-layout: grid">
                            <ui:textArea binding="#{RoleOP$ModifyRole.textArea_memo}" columns="25" id="textArea_memo" style="height: 50px; left: 0px; top: 312px; position: absolute; width: 360px"/>
                            <ui:button action="#{RoleOP$ModifyRole.button_refresh_action}" binding="#{RoleOP$ModifyRole.button_refresh}" id="button_refresh"
                                style="height: 32px; left: 287px; top: 384px; position: absolute; width: 80px" text="退出"/>
                            <ui:addRemove availableItemsLabel="还未拥有的权限:" binding="#{RoleOP$ModifyRole.addRemoveList_configPopedom}"
                                id="addRemoveList_configPopedom" label="权限配置:" labelOnTop="true" moveButtons="true" rows="8" selectAll="true"
                                selectedItemsLabel="已有权限:" sorted="true" style="left: 0px; top: 72px; position: absolute"/>
                            <ui:label binding="#{RoleOP$ModifyRole.label1}" id="label1" labelLevel="1" style="left: 144px; top: 0px; position: absolute" text="修改角色"/>
                            <ui:staticText binding="#{RoleOP$ModifyRole.staticText2}" id="staticText2" style="left: 0px; top: 24px; position: absolute" text="当前角色:"/>
                            <ui:button action="#{RoleOP$ModifyRole.button_submitChanges_action}" binding="#{RoleOP$ModifyRole.button_submitChanges}"
                                id="button_submitChanges" style="height: 32px; left: 191px; top: 384px; position: absolute; width: 80px" text="确定"/>
                            <ui:staticText binding="#{RoleOP$ModifyRole.staticText_roleName}" id="staticText_roleName" style="height: 24px; left: 72px; top: 24px; position: absolute; width: 310px"/>
                            <ui:staticText binding="#{RoleOP$ModifyRole.staticText1}" id="staticText1" style="left: 0px; top: 288px; position: absolute" text="角色备注信息:"/>
                        </ui:panelLayout>
                        <ui:messageGroup binding="#{RoleOP$ModifyRole.messageGroup1}" id="messageGroup1" style="left: 640px; top: 247px; position: absolute"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
