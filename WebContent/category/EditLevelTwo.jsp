<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{category$EditLevelTwo.page1}" id="page1">
            <ui:html binding="#{category$EditLevelTwo.html1}" id="html1">
                <ui:head binding="#{category$EditLevelTwo.head1}" id="head1">
                    <ui:link binding="#{category$EditLevelTwo.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{category$EditLevelTwo.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{category$EditLevelTwo.form1}" id="form1" virtualFormsConfig="submit | txtName txtNo dropDown | btnSave , reset | | btnReset">
                        <ui:label binding="#{category$EditLevelTwo.label1}" id="label1" labelLevel="1" style="left: 216px; top: 24px; position: absolute" text="编辑二级固定类目条目"/>
                        <ui:button action="#{category$EditLevelTwo.btnSave_action}" binding="#{category$EditLevelTwo.btnSave}" id="btnSave"
                            style="height: 32px; left: 215px; top: 264px; position: absolute; width: 80px" text="保存"/>
                        <ui:textField binding="#{category$EditLevelTwo.txtName}" id="txtName" label="类目名称" required="true"
                            style="left: 192px; top: 192px; position: absolute" text="#{category$EditLevelTwo.fcat.categoryName}"/>
                        <ui:dropDown binding="#{category$EditLevelTwo.dropDown}" converter="#{category$AddLevelTwo.dropDown1Converter}" id="dropDown"
                            items="#{category$AddLevelTwo.catSprovider.options['idCat,categoryName']}" label="选择一级父目录" style="left: 192px; top: 96px; position: absolute; width: 286px"/>
                        <ui:textField binding="#{category$EditLevelTwo.txtNo}" id="txtNo" label="类目编号" required="true"
                            style="left: 192px; top: 144px; position: absolute" text="#{category$EditLevelTwo.fcat.categoryNo}"/>
                        <ui:messageGroup binding="#{category$EditLevelTwo.messageGroup1}" id="messageGroup1" style="left: 504px; top: 24px; position: absolute"/>
                        <ui:button action="#{category$EditLevelTwo.btnReset_action}" binding="#{category$EditLevelTwo.btnReset}" id="btnReset"
                            style="height: 32px; left: 311px; top: 264px; position: absolute; width: 80px" text="重置"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
