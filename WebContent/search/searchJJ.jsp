<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{search$searchJJ.page1}" id="page1">
            <ui:html binding="#{search$searchJJ.html1}" id="html1">
                <ui:head binding="#{search$searchJJ.head1}" id="head1">
                    <ui:link binding="#{search$searchJJ.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{search$searchJJ.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{search$searchJJ.form1}" id="form1" virtualFormsConfig="ddpage | ddPages | ddPages , table | | table1:tableRowGroup1:tableColumn6:hyperlink1">
                        <ui:label binding="#{search$searchJJ.label1}" id="label1" labelLevel="1" style="left: 32px; top: 0px; position: absolute" text="基建图纸查询结果"/>
                        <ui:table augmentTitle="false" binding="#{search$searchJJ.table1}" id="table1" style="left: 32px; top: 80px; position: absolute"
                            title="基建图纸" width="567">
                            <ui:tableRowGroup binding="#{search$searchJJ.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{search$searchJJ.jjProvider}" sourceVar="currentRow">
                                <ui:tableColumn binding="#{search$searchJJ.tableColumn1}" headerText="工程" id="tableColumn1">
                                    <ui:staticText binding="#{search$searchJJ.staticText1}" id="staticText1" text="#{currentRow.value['blueprintProject']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchJJ.tableColumn2}" headerText="项目" id="tableColumn2">
                                    <ui:staticText binding="#{search$searchJJ.staticText2}" id="staticText2" text="#{currentRow.value['projectName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchJJ.tableColumn3}" headerText="图纸名" id="tableColumn3">
                                    <ui:staticText binding="#{search$searchJJ.staticText3}" id="staticText3" text="#{currentRow.value['blueprintName']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchJJ.tableColumn4}" headerText="图号" id="tableColumn4">
                                    <ui:staticText binding="#{search$searchJJ.staticText4}" id="staticText4" text="#{currentRow.value['snBlueprint']}"/>
                                </ui:tableColumn>
                                <ui:tableColumn binding="#{search$searchJJ.tableColumn6}" headerText="预览" id="tableColumn6">
                                    <ui:hyperlink action="#{search$searchJJ.hyperlink1_action}" binding="#{search$searchJJ.hyperlink1}" id="hyperlink1" text="点击预览"/>
                                </ui:tableColumn>
                            </ui:tableRowGroup>
                        </ui:table>
                        <ui:dropDown binding="#{search$searchJJ.ddPages}" converter="#{search$searchJJ.integerConverter1}" id="ddPages"
                            items="#{search$searchJJ.ddprovider.options['idPage,pages']}" onChange="common_timeoutSubmitForm(this.form, 'ddPages');"
                            style="left: 88px; top: 40px; position: absolute; width: 152px" valueChangeListener="#{search$searchJJ.ddPages_processValueChange}"/>
                        <ui:label binding="#{search$searchJJ.label2}" id="label2" style="left: 32px; top: 40px; position: absolute" text="请选择："/>
                        <ui:button action="returnCon" binding="#{search$searchJJ.button1}" id="button1"
                            style="height: 32px; left: 287px; top: 40px; position: absolute; width: 100px" text="返回查询界面"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
