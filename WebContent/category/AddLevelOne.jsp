<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{category$AddLevelOne.page1}" id="page1">
            <ui:html binding="#{category$AddLevelOne.html1}" id="html1">
                <ui:head binding="#{category$AddLevelOne.head1}" id="head1">
                    <ui:link binding="#{category$AddLevelOne.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{category$AddLevelOne.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{category$AddLevelOne.form1}" id="form1">
                        <ui:textField binding="#{category$AddLevelOne.txtNo}" id="txtNo" label="类目编号" required="true" style="left: 192px; top: 96px; position: absolute"/>
                        <ui:textField binding="#{category$AddLevelOne.txtName}" id="txtName" label="类目名称" required="true" style="left: 192px; top: 144px; position: absolute"/>
                        <ui:label binding="#{category$AddLevelOne.label1}" id="label1" labelLevel="1" style="left: 216px; top: 24px; position: absolute" text="增加一级固定类目条目"/>
                        <ui:button action="#{category$AddLevelOne.btnAdd_action}" binding="#{category$AddLevelOne.btnAdd}" id="btnAdd"
                            style="height: 32px; left: 239px; top: 216px; position: absolute; width: 80px" text="增加"/>
                        <ui:messageGroup binding="#{category$AddLevelOne.messageGroup1}" id="messageGroup1" style="left: 504px; top: 24px; position: absolute"/>
                        <ui:button action="#{category$AddLevelOne.btnReset_action}" binding="#{category$AddLevelOne.btnReset}" id="btnReset"
                            style="height: 32px; left: 335px; top: 216px; position: absolute; width: 80px" text="重置"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
