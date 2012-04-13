<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{category$EditLevelOne.page1}" id="page1">
            <ui:html binding="#{category$EditLevelOne.html1}" id="html1">
                <ui:head binding="#{category$EditLevelOne.head1}" id="head1">
                    <ui:link binding="#{category$EditLevelOne.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{category$EditLevelOne.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{category$EditLevelOne.form1}" id="form1">
                        <ui:textField binding="#{category$EditLevelOne.txtName}" id="txtName" label="类目名称" required="true"
                            style="left: 168px; top: 144px; position: absolute" text="#{category$EditLevelOne.fcat.categoryName}"/>
                        <ui:textField binding="#{category$EditLevelOne.txtNo}" id="txtNo" label="类目编号" required="true"
                            style="left: 168px; top: 96px; position: absolute" text="#{category$EditLevelOne.fcat.categoryNo}"/>
                        <ui:button action="#{category$EditLevelOne.btnSave_action}" binding="#{category$EditLevelOne.btnSave}" id="btnSave"
                            style="height: 32px; left: 191px; top: 216px; position: absolute; width: 80px" text="保存"/>
                        <ui:label binding="#{category$EditLevelOne.label1}" id="label1" labelLevel="1" style="left: 192px; top: 24px; position: absolute" text="编辑一级固定类目条目"/>
                        <ui:messageGroup binding="#{category$EditLevelOne.messageGroup1}" id="messageGroup1" style="left: 504px; top: 24px; position: absolute"/>
                        <ui:button action="#{category$EditLevelOne.btnReset_action}" binding="#{category$EditLevelOne.btnReset}" id="btnReset"
                            style="height: 32px; left: 287px; top: 216px; position: absolute; width: 80px" text="重置"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
