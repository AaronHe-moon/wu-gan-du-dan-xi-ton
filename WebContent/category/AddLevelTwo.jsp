<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{category$AddLevelTwo.page1}" id="page1">
            <ui:html binding="#{category$AddLevelTwo.html1}" id="html1">
                <ui:head binding="#{category$AddLevelTwo.head1}" id="head1">
                    <ui:link binding="#{category$AddLevelTwo.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{category$AddLevelTwo.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{category$AddLevelTwo.form1}" id="form1" virtualFormsConfig="submit | txtNo txtName dropDown1 | btnAdd , reset | | btnReset">
                        <ui:label binding="#{category$AddLevelTwo.label1}" id="label1" labelLevel="1" style="left: 216px; top: 24px; position: absolute" text="增加二级固定类目条目"/>
                        <ui:button action="#{category$AddLevelTwo.btnAdd_action}" binding="#{category$AddLevelTwo.btnAdd}" id="btnAdd"
                            style="height: 32px; left: 215px; top: 264px; position: absolute; width: 80px" text="增加"/>
                        <ui:textField binding="#{category$AddLevelTwo.txtNo}" id="txtNo" label="类目编号" required="true" style="left: 192px; top: 144px; position: absolute"/>
                        <ui:textField binding="#{category$AddLevelTwo.txtName}" id="txtName" label="类目名称" required="true" style="left: 192px; top: 192px; position: absolute"/>
                        <ui:dropDown binding="#{category$AddLevelTwo.dropDown1}" converter="#{category$AddLevelTwo.dropDown1Converter}" id="dropDown1"
                            items="#{category$AddLevelTwo.catSprovider.options['idCat,categoryName']}" label="选择一级父目录" style="left: 192px; top: 96px; position: absolute; width: 286px"/>
                        <ui:messageGroup binding="#{category$AddLevelTwo.messageGroup1}" id="messageGroup1" style="left: 528px; top: 24px; position: absolute"/>
                        <ui:button action="#{category$AddLevelTwo.btnReset_action}" binding="#{category$AddLevelTwo.btnReset}" id="btnReset"
                            style="height: 32px; left: 311px; top: 264px; position: absolute; width: 80px" text="重置"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
