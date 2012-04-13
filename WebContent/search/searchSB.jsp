<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{search$searchSB.page1}" id="page1">
            <ui:html binding="#{search$searchSB.html1}" id="html1">
                <ui:head binding="#{search$searchSB.head1}" id="head1">
                    <ui:link binding="#{search$searchSB.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{search$searchSB.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{search$searchSB.form1}" id="form1" virtualFormsConfig="ddpages | ddPages | ddPages , table | | table1:tableRowGroup1:tableColumn5:hyperlink2">
                        <ui:label binding="#{search$searchSB.label1}" id="label1" labelLevel="1" style="left: 24px; top: 0px; position: absolute" text="设备图纸查询结果"/>
                        <ui:table augmentTitle="false" binding="#{search$searchSB.table1}" id="table1"
                            style="left: 16px; top: 72px; position: absolute; width: 671px" title="设备图纸" width="671">
                            <ui:tableRowGroup binding="#{search$searchSB.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{search$searchSB.deProvider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{search$searchSB.tableColumn6}" headerText="设备" id="tableColumn6">
                                    <ui:staticText binding="#{search$searchSB.staticText5}" id="staticText5" text="#{currentRow.value['deviceAliasName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchSB.tableColumn1}" headerText="类型" id="tableColumn1">
                                    <ui:staticText binding="#{search$searchSB.staticText1}" id="staticText1" text="#{currentRow.value['deviceCode']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchSB.tableColumn2}" headerText="部件" id="tableColumn2">
                                    <ui:staticText binding="#{search$searchSB.staticText2}" id="staticText2" text="#{currentRow.value['partName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchSB.tableColumn4}" headerText="图纸名称" id="tableColumn4">
                                    <ui:staticText binding="#{search$searchSB.staticText4}" id="staticText4" text="#{currentRow.value['blueprintName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchSB.tableColumn3}" headerText="图号" id="tableColumn3">
                                    <ui:staticText binding="#{search$searchSB.staticText3}" id="staticText3" text="#{currentRow.value['snBlueprint']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchSB.tableColumn5}" headerText="预览" id="tableColumn5">
                                    <ui:hyperlink action="#{search$searchSB.hyperlink2_action}" binding="#{search$searchSB.hyperlink2}" id="hyperlink2" text="点击预览"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:dropDown binding="#{search$searchSB.ddPages}" converter="#{search$searchSB.ddPagesConverter}" id="ddPages"
                            items="#{search$searchSB.ddprovider.options['idPage,pages']}" onChange="common_timeoutSubmitForm(this.form, 'ddPages');"
                            style="left: 72px; top: 32px; position: absolute; width: 152px" valueChangeListener="#{search$searchSB.ddPages_processValueChange}"/>
                        <ui:label binding="#{search$searchSB.label2}" id="label2" style="left: 16px; top: 32px; position: absolute" text="请选择："/>
                        <ui:button action="returnCon" binding="#{search$searchSB.button1}" id="button1"
                            style="height: 32px; left: 311px; top: 32px; position: absolute; width: 100px" text="返回查询界面"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
