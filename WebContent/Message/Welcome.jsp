<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Message$Welcome.page1}" id="page1">
            <ui:html binding="#{Message$Welcome.html1}" id="html1">
                <ui:head binding="#{Message$Welcome.head1}" id="head1">
                    <ui:link binding="#{Message$Welcome.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Message$Welcome.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Message$Welcome.form1}" id="form1">
                        <ui:panelLayout binding="#{Message$Welcome.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 430px; left: 96px; top: 24px; position: absolute; width: 646px">
                            <ui:image binding="#{Message$Welcome.image1}" height="411" id="image1" url="/resources/Background.gif" width="600"/>
                        </ui:panelLayout>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
