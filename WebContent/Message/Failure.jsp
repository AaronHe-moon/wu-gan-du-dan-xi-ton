<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Message$Failure.page1}" id="page1">
            <ui:html binding="#{Message$Failure.html1}" id="html1">
                <ui:head binding="#{Message$Failure.head1}" id="head1">
                    <ui:link binding="#{Message$Failure.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Message$Failure.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Message$Failure.form1}" id="form1">
                        <ui:panelLayout binding="#{Message$Failure.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 200px; left: 144px; top: 144px; position: absolute; width: 400px">
                            <ui:panelLayout binding="#{Message$Failure.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="background-color: rgb(211, 224, 235); height: 40px; width: 400px"/>
                            <ui:panelLayout binding="#{Message$Failure.layoutPanel3}" id="layoutPanel3" style="background-color: rgb(153, 153, 153); height: 160px; width: 400px">
                                <ui:image binding="#{Message$Failure.image1}" id="image1" style="left: 120px; top: 48px; position: absolute" url="/resources/Success.gif"/>
                                <ui:staticText binding="#{Message$Failure.staticText2}" id="staticText2"
                                    style="color: red; font-size: 18px; font-style: normal; font-weight: normal; left: 168px; top: 48px; position: absolute" text="操作失败"/>
                            </ui:panelLayout>
                        </ui:panelLayout>
                        <ui:button binding="#{Message$Failure.button1}" id="button1"
                            style="height: 32px; left: 311px; top: 360px; position: absolute; width: 80px" text="返回首页"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
