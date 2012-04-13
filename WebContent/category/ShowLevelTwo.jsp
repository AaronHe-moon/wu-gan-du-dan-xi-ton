<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{category$ShowLevelTwo.page1}" id="page1">
            <ui:html binding="#{category$ShowLevelTwo.html1}" id="html1">
                <ui:head binding="#{category$ShowLevelTwo.head1}" id="head1">
                    <ui:link binding="#{category$ShowLevelTwo.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{category$ShowLevelTwo.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{category$ShowLevelTwo.form1}" id="form1">
                        <ui:label binding="#{category$ShowLevelTwo.label1}" id="label1" labelLevel="1" style="left: 112px; top: 24px; position: absolute" text="二级固定类目"/>
                        <ui:label binding="#{category$ShowLevelTwo.label2}" id="label2" style="left: 64px; top: 120px; position: absolute" text="选择一级类目"/>
                        <ui:dropDown binding="#{category$ShowLevelTwo.ddSelect}" converter="#{category$ShowLevelTwo.integerConverter1}" id="ddSelect"
                            items="#{SessionBean1.catSprovider.options['idCat,categoryName']}" onChange="common_timeoutSubmitForm(this.form, 'ddSelect');"
                            style="left: 168px; top: 120px; position: absolute; width: 136px" valueChangeListener="#{category$ShowLevelTwo.ddSelect_processValueChange}"/>
                        <ui:button action="#{category$ShowLevelTwo.btnAdd_action}" binding="#{category$ShowLevelTwo.btnAdd}" id="btnAdd"
                            style="height: 32px; left: 63px; top: 72px; position: absolute; width: 80px" text="增加"/>
                        <ui:table augmentTitle="false" binding="#{category$ShowLevelTwo.table1}" id="table1" style="left: 64px; top: 168px; position: absolute"
                            title="二级类目一览" width="431">
                            <ui:tableRowGroup binding="#{category$ShowLevelTwo.tableRowGroup1}" id="tableRowGroup1" rows="5"
                                sourceData="#{SessionBean1.catprovider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{category$ShowLevelTwo.tableColumn2}" headerText="类目编号" id="tableColumn2">
                                    <ui:staticText binding="#{category$ShowLevelTwo.staticText2}" id="staticText2" text="#{currentRow.value['categoryNo']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{category$ShowLevelTwo.tableColumn1}" headerText="类目名称" id="tableColumn1">
                                    <ui:staticText binding="#{category$ShowLevelTwo.staticText1}" id="staticText1" text="#{currentRow.value['categoryName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{category$ShowLevelTwo.tableColumn3}" headerText="编辑" id="tableColumn3">
                                    <ui:hyperlink action="#{category$ShowLevelTwo.hyperlink1_action}" binding="#{category$ShowLevelTwo.hyperlink1}"
                                        id="hyperlink1" text="编辑"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{category$ShowLevelTwo.tableColumn4}" headerText="删除" id="tableColumn4">
                                    <ui:hyperlink action="#{category$ShowLevelTwo.hyperlink2_action}" binding="#{category$ShowLevelTwo.hyperlink2}"
                                        id="hyperlink2" text="删除"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:messageGroup binding="#{category$ShowLevelTwo.messageGroup1}" id="messageGroup1" style="left: 400px; top: 56px; position: absolute"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
