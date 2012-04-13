<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{wgDocInput$JJInspectPreview.page1}" id="page1">
            <ui:html binding="#{wgDocInput$JJInspectPreview.html1}" id="html1">
                <ui:head binding="#{wgDocInput$JJInspectPreview.head1}" id="head1">
                    <ui:link binding="#{wgDocInput$JJInspectPreview.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{wgDocInput$JJInspectPreview.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{wgDocInput$JJInspectPreview.form1}" id="form1">
                        <ui:panelLayout binding="#{wgDocInput$JJInspectPreview.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="border-width: 1px; border-style: solid; height: 450px; left: -8px; top: 32px; position: absolute; text-align: center; width: 600px">
                            <ui:image binding="#{wgDocInput$JJInspectPreview.image_toBeShown}" height="450" id="image_toBeShown" width="600"/>
                        </ui:panelLayout>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtXM}" id="txtXM" style="left: 672px; top: 80px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtBZ}" id="txtBZ" style="left: 672px; top: 176px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtBG}" id="txtBG" style="left: 672px; top: 152px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtTH}" id="txtTH" style="left: 672px; top: 128px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtTZMC}" id="txtTZMC" style="left: 672px; top: 104px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtGC}" id="txtGC" style="left: 672px; top: 56px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtNM}" id="txtNM" style="left: 672px; top: 32px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText1}" id="staticText1" style="left: 600px; top: 152px; position: absolute" text="变更编号:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText2}" id="staticText2" style="left: 600px; top: 80px; position: absolute" text="项目名称:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText3}" id="staticText3" style="left: 600px; top: 56px; position: absolute" text="工程名称:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtTH}" id="txtTH" style="left: 480px; top: 480px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtGC}" id="txtGC" style="left: 120px; top: 504px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtTZMC}" id="txtTZMC" style="left: 120px; top: 552px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtBZ}" id="txtBZ" style="left: 480px; top: 528px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText4}" id="staticText4" style="left: 600px; top: 104px; position: absolute" text="图纸名称:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText5}" id="staticText5" style="left: 600px; top: 176px; position: absolute" text="备注信息:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText6}" id="staticText6" style="left: 600px; top: 32px; position: absolute" text="类目编号:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtBG}" id="txtBG" style="left: 480px; top: 504px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtXM}" id="txtXM" style="left: 120px; top: 528px; position: absolute"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.staticText7}" id="staticText7" style="left: 600px; top: 128px; position: absolute" text="图档编号:"/>
                        <ui:staticText binding="#{wgDocInput$JJInspectPreview.txtNM}" id="txtNM" style="left: 120px; top: 480px; position: absolute"/>
                        <ui:button action="#{wgDocInput$JJInspectPreview.button1_action}" binding="#{wgDocInput$JJInspectPreview.button1}" id="button1"
                            style="height: 32px; left: 431px; top: 512px; position: absolute; width: 80px" text="返回"/>
                        <ui:label binding="#{wgDocInput$JJInspectPreview.label1}" id="label1" labelLevel="1" style="left: 168px; top: 0px; position: absolute" text="图档预览"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
