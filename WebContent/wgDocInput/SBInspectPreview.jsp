<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{wgDocInput$SBInspectPreview.page1}" id="page1">
            <ui:html binding="#{wgDocInput$SBInspectPreview.html1}" id="html1">
                <ui:head binding="#{wgDocInput$SBInspectPreview.head1}" id="head1">
                    <ui:link binding="#{wgDocInput$SBInspectPreview.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{wgDocInput$SBInspectPreview.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{wgDocInput$SBInspectPreview.form1}" id="form1">
                        <ui:panelLayout binding="#{wgDocInput$SBInspectPreview.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="border-width: 1px; border-style: solid; height: 450px; left: 0px; top: 40px; position: absolute; text-align: center; width: 600px">
                            <ui:image binding="#{wgDocInput$SBInspectPreview.image_toBeShown}" height="450" id="image_toBeShown" width="600"/>
                        </ui:panelLayout>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.staticText1}" id="staticText1" style="left: 616px; top: 88px; position: absolute" text="类目编号:"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.txtBZ}" id="txtBZ" style="left: 688px; top: 160px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.txtBJMC}" id="txtBJMC" style="left: 688px; top: 64px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.staticText2}" id="staticText2" style="left: 616px; top: 64px; position: absolute" text="部件名称:"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.txtTDBH}" id="txtTDBH" style="left: 688px; top: 112px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.staticText3}" id="staticText3"
                            style="height: 24px; left: 616px; top: 40px; position: absolute" text="设备名称:"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.staticText4}" id="staticText4" style="left: 616px; top: 160px; position: absolute" text="备注信息:"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.txtBG}" id="txtBG" style="left: 688px; top: 136px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.txtSBMC}" id="txtSBMC" style="left: 688px; top: 40px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.staticText5}" id="staticText5" style="left: 616px; top: 136px; position: absolute" text="变更编号:"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.txtNMBH}" id="txtNMBH" style="left: 688px; top: 88px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$SBInspectPreview.staticText6}" id="staticText6" style="left: 616px; top: 112px; position: absolute" text="图档编号:"/>
                        <ui:button binding="#{wgDocInput$SBInspectPreview.button1}" id="button1"
                            style="height: 32px; left: 519px; top: 512px; position: absolute; width: 80px" text="返回"/>
                        <ui:label binding="#{wgDocInput$SBInspectPreview.label1}" id="label1" labelLevel="1" style="left: 160px; top: 0px; position: absolute" text="设备未审核图档预览"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
