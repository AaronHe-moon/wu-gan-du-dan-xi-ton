<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{category$ShowLevelOne.page1}" id="page1">
            <ui:html binding="#{category$ShowLevelOne.html1}" id="html1">
                <ui:head binding="#{category$ShowLevelOne.head1}" id="head1">
                    <ui:link binding="#{category$ShowLevelOne.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{category$ShowLevelOne.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{category$ShowLevelOne.form1}" id="form1">
                        <ui:table augmentTitle="false" binding="#{category$ShowLevelOne.table1}" id="table1" style="position: absolute; left: 120px; top: 120px"
                            title="一级类目一览" width="480">
                            <ui:tableRowGroup binding="#{category$ShowLevelOne.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{SessionBean1.catL1provider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{category$ShowLevelOne.tableColumn1}" headerText="类目编辑" id="tableColumn1" sort="categoryNo">
                                    <ui:staticText binding="#{category$ShowLevelOne.staticText1}" id="staticText1" text="#{currentRow.value['categoryNo']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{category$ShowLevelOne.tableColumn2}" headerText="类目名称" id="tableColumn2" sort="categoryName">
                                    <ui:staticText binding="#{category$ShowLevelOne.staticText2}" id="staticText2" text="#{currentRow.value['categoryName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{category$ShowLevelOne.tableColumn3}" headerText="编辑" id="tableColumn3">
                                    <ui:hyperlink binding="#{category$ShowLevelOne.hyperlink1}" id="hyperlink1" text="编辑"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{category$ShowLevelOne.tableColumn4}" headerText="删除" id="tableColumn4">
                                    <ui:hyperlink action="#{category$ShowLevelOne.hyperlink2_action}" binding="#{category$ShowLevelOne.hyperlink2}"
                                        id="hyperlink2" text="删除"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:label binding="#{category$ShowLevelOne.label1}" id="label1" labelLevel="1" style="position: absolute; left: 192px; top: 24px" text="一级固定类目"/>
                        <ui:button action="#{category$ShowLevelOne.btnAdd_action}" binding="#{category$ShowLevelOne.btnAdd}" id="btnAdd"
                            style="height: 32px; left: 119px; top: 72px; position: absolute; width: 80px" text="增加"/>
                        <ui:messageGroup binding="#{category$ShowLevelOne.messageGroup1}" id="messageGroup1" style="left: 432px; top: 24px; position: absolute"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
