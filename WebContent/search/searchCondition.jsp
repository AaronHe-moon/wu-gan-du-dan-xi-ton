<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{search$searchCondition.page1}" id="page1">
            <ui:html binding="#{search$searchCondition.html1}" id="html1">
                <ui:head binding="#{search$searchCondition.head1}" id="head1">
                    <ui:link binding="#{search$searchCondition.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{search$searchCondition.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{search$searchCondition.form1}" id="form1">
                        <ui:tabSet binding="#{search$searchCondition.tabSet1}" id="tabSet1" selected="tab1" style="height: 406px; left: 88px; top: 80px; position: absolute; width: 574px">
                            <ui:tab binding="#{search$searchCondition.tab1}" id="tab1" text="基建图纸查询">
                                <ui:panelLayout binding="#{search$searchCondition.layoutPanel1}" id="layoutPanel1" style="height: 363px; width: 100%">
                                    <ui:textField binding="#{search$searchCondition.txtBProject}" id="txtBProject"
                                        style="left: 192px; top: 48px; position: absolute; width: 250px" text="#{SessionBean1.conJJ.gcName}"/>
                                    <ui:textField binding="#{search$searchCondition.txtProjectName}" id="txtProjectName"
                                        style="left: 192px; top: 96px; position: absolute; width: 250px" text="#{SessionBean1.conJJ.xmName}"/>
                                    <ui:textField binding="#{search$searchCondition.txtBName}" id="txtBName"
                                        style="left: 192px; top: 144px; position: absolute; width: 250px" text="#{SessionBean1.conJJ.tzName}"/>
                                    <ui:textField binding="#{search$searchCondition.txtSNJJ}" id="txtSNJJ"
                                        style="left: 192px; top: 192px; position: absolute; width: 250px" text="#{SessionBean1.conJJ.SN}"/>
                                    <ui:textField binding="#{search$searchCondition.txtCatJJ}" id="txtCatJJ" label="类目编号" rendered="false"
                                        style="left: 144px; top: 240px; position: absolute" text="#{SessionBean1.conJJ.cat}"/>
                                    <ui:button action="#{search$searchCondition.btnQueryJJ_action}" binding="#{search$searchCondition.btnQueryJJ}"
                                        id="btnQueryJJ" style="height: 32px; left: 239px; top: 312px; position: absolute; width: 80px" text="查询"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText1}" id="staticText1"
                                        style="left: 104px; top: 48px; position: absolute" text="工程名称:"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText2}" id="staticText2"
                                        style="left: 104px; top: 104px; position: absolute" text="项目名称:"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText3}" id="staticText3"
                                        style="left: 104px; top: 152px; position: absolute" text="图纸名称:"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText4}" id="staticText4"
                                        style="left: 104px; top: 200px; position: absolute" text="图号:"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab binding="#{search$searchCondition.tab2}" id="tab2" text="设备图纸查询">
                                <ui:panelLayout binding="#{search$searchCondition.layoutPanel2}" id="layoutPanel2" style="height: 363px; width: 100%">
                                    <ui:textField binding="#{search$searchCondition.txtDevice}" id="txtDevice"
                                        style="left: 208px; top: 80px; position: absolute; width: 250px" text="#{SessionBean1.conSB.sbName}"/>
                                    <ui:textField binding="#{search$searchCondition.txtSNSB}" id="txtSNSB"
                                        style="left: 208px; top: 224px; position: absolute; width: 250px" text="#{SessionBean1.conSB.SN}"/>
                                    <ui:textField binding="#{search$searchCondition.txtPart}" id="txtPart"
                                        style="left: 208px; top: 128px; position: absolute; width: 250px" text="#{SessionBean1.conSB.partName}"/>
                                    <ui:textField binding="#{search$searchCondition.txtCatSB}" id="txtCatSB" label="类目编号" rendered="false"
                                        style="left: 152px; top: 240px; position: absolute" text="#{SessionBean1.conSB.cat}"/>
                                    <ui:button action="#{search$searchCondition.btnQuerySB_action}" binding="#{search$searchCondition.btnQuerySB}"
                                        id="btnQuerySB" style="height: 32px; left: 239px; top: 312px; position: absolute; width: 80px" text="查询"/>
                                    <ui:textField binding="#{search$searchCondition.txtBNameSB}" id="txtBNameSB"
                                        style="left: 208px; top: 176px; position: absolute; width: 250px" text="#{SessionBean1.conSB.blueprintName}"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText5}" id="staticText5"
                                        style="left: 104px; top: 80px; position: absolute" text="类型"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText6}" id="staticText6"
                                        style="left: 104px; top: 128px; position: absolute" text="部件名"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText7}" id="staticText7"
                                        style="left: 104px; top: 184px; position: absolute" text="图纸名称"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText8}" id="staticText8"
                                        style="left: 104px; top: 224px; position: absolute" text="图号"/>
                                    <ui:staticText binding="#{search$searchCondition.staticText9}" id="staticText9"
                                        style="left: 104px; top: 32px; position: absolute" text="设备名称"/>
                                    <ui:textField binding="#{search$searchCondition.txtDevice1}" id="txtDevice1"
                                        style="left: 208px; top: 32px; position: absolute; width: 250px" text="#{SessionBean1.conSB.sbAliasName}"/>
                                </ui:panelLayout>
                            </ui:tab>
                        </ui:tabSet>
                        <ui:label binding="#{search$searchCondition.label1}" id="label1" labelLevel="1" style="left: 192px; top: 40px; position: absolute" text="请选择基建或设备图纸以进行查询"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
