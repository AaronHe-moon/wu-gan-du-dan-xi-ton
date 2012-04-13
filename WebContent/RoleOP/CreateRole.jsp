<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{RoleOP$CreateRole.page1}" id="page1">
            <ui:html binding="#{RoleOP$CreateRole.html1}" id="html1">
                <ui:head binding="#{RoleOP$CreateRole.head1}" id="head1">
                    <ui:link binding="#{RoleOP$CreateRole.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{RoleOP$CreateRole.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{RoleOP$CreateRole.form1}" id="form1">
                        <ui:message binding="#{RoleOP$CreateRole.message1}" for="textField_roleName" id="message1" style="left: 72px; top: 48px; position: absolute"/>
                        <ui:textArea binding="#{RoleOP$CreateRole.textArea_memo}" columns="28" id="textArea_memo" rows="4" style="height: 50px; left: 72px; top: 312px; position: absolute; width: 360px"/>
                        <ui:label binding="#{RoleOP$CreateRole.label1}" id="label1" labelLevel="1" style="left: 216px; top: 0px; position: absolute" text="创建角色"/>
                        <ui:button action="#{RoleOP$CreateRole.button1_action}" binding="#{RoleOP$CreateRole.button1}" id="button1"
                            style="height: 32px; left: 215px; top: 384px; position: absolute; width: 80px" text="确定"/>
                        <ui:addRemove availableItemsLabel="可用权限:" binding="#{RoleOP$CreateRole.addRemoveList_configPopedom}" id="addRemoveList_configPopedom"
                            label="权限配置" labelOnTop="true" moveButtons="true" rows="8" selectAll="true" selectedItemsLabel="选定权限:" sorted="true" style="left: 72px; top: 72px; position: absolute"/>
                        <ui:label binding="#{RoleOP$CreateRole.label2}" id="label2" requiredIndicator="true" style="left: 72px; top: 24px; position: absolute" text="角色名称(必填):"/>
                        <ui:label binding="#{RoleOP$CreateRole.label3}" id="label3" style="left: 72px; top: 288px; position: absolute" text="角色备注信息(选填):"/>
                        <ui:textField binding="#{RoleOP$CreateRole.textField_roleName}" id="textField_roleName" required="true"
                            style="left: 192px; top: 24px; position: absolute; width: 240px" trim="false" validator="#{RoleOP$CreateRole.textField_roleName_validate}"/>
                        <ui:messageGroup binding="#{RoleOP$CreateRole.messageGroup1}" id="messageGroup1" style="left: 528px; top: 96px; position: absolute"/>
                        <ui:button action="toWelcome" binding="#{RoleOP$CreateRole.button2}" id="button2"
                            style="height: 32px; left: 311px; top: 384px; position: absolute; width: 80px" text="退出"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
