<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Message$Success.page1}" id="page1">
            <ui:html binding="#{Message$Success.html1}" id="html1">
                <ui:head binding="#{Message$Success.head1}" id="head1">
                    <ui:link binding="#{Message$Success.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Message$Success.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Message$Success.form1}" id="form1">
                        <ui:panelLayout binding="#{Message$Success.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 200px; left: 144px; top: 144px; position: absolute; width: 400px">
                            <ui:panelLayout binding="#{Message$Success.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="background-color: rgb(211, 224, 235); height: 40px; width: 400px"/>
                            <ui:panelLayout binding="#{Message$Success.layoutPanel3}" id="layoutPanel3" style="background-color: rgb(153, 153, 153); height: 160px; width: 400px">
                                <ui:image binding="#{Message$Success.image1}" id="image1" style="left: 120px; top: 48px; position: absolute" url="/resources/Success.gif"/>
                                <ui:staticText binding="#{Message$Success.staticText1}" id="staticText1"
                                    style="color: black; font-size: 18px; font-style: normal; font-weight: normal; left: 168px; top: 48px; position: absolute" text="操作成功"/>
                            </ui:panelLayout>
                        </ui:panelLayout>
                        <ui:button action="toWelcome" binding="#{Message$Success.button1}" id="button1"
                            style="height: 32px; left: 311px; top: 360px; position: absolute; width: 80px" text="返回首页"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
