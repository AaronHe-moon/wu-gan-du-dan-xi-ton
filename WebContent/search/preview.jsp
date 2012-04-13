<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{search$preview.page1}" id="page1">
            <ui:html binding="#{search$preview.html1}" id="html1">
                <ui:head binding="#{search$preview.head1}" id="head1">
                    <ui:link binding="#{search$preview.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{search$preview.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{search$preview.form1}" id="form1">
                        <ui:panelLayout binding="#{search$preview.layoutPanel1}" id="layoutPanel1" style="border-width: 2px; border-style: dotted; background-color: rgb(204, 255, 255); height: 44px; left: 24px; top: 0px; position: absolute; width: 740px; -rave-layout: grid">
                            <ui:button action="#{search$preview.btnReturn_action}" binding="#{search$preview.btnReturn}" id="btnReturn"
                                style="height: 32px; left: 559px; top: 8px; position: absolute; width: 80px" text="返回"/>
                            <ui:button action="#{search$preview.btnLeft_action}" binding="#{search$preview.btnLeft}" id="btnLeft"
                                style="height: 32px; left: 47px; top: 8px; position: absolute; width: 80px" text="向左旋转"/>
                            <ui:button action="#{search$preview.btnRight_action}" binding="#{search$preview.btnRight}" id="btnRight"
                                style="height: 32px; left: 143px; top: 8px; position: absolute; width: 80px" text="向右旋转"/>
                            <ui:button action="#{search$preview.btnUpsideDown_action}" binding="#{search$preview.btnUpsideDown}" id="btnUpsideDown"
                                style="height: 32px; left: 239px; top: 8px; position: absolute; width: 80px" text="倒转"/>
                            <ui:button action="#{search$preview.btnRestorPostition_action}" binding="#{search$preview.btnRestorPostition}"
                                id="btnRestorPostition" style="height: 32px; left: 343px; top: 8px; position: absolute; width: 80px" text="复位"/>
                            <ui:button action="#{search$preview.btnDownload_action}" binding="#{search$preview.btnDownload}" id="btnDownload"
                                style="height: 32px; left: 447px; top: 8px; position: absolute; width: 80px" text="下载"/>
                        </ui:panelLayout>
                        <ui:panelLayout binding="#{search$preview.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="border-width: 1px; border-style: dotted; background-color: rgb(204, 255, 255); height: 478px; left: 24px; top: 56px; position: absolute; width: 742px">
                            <ui:image binding="#{search$preview.imgPreview}" id="imgPreview"/>
                        </ui:panelLayout>
                        <ui:hiddenField binding="#{search$preview.idRot}" id="idRot" text="0"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
