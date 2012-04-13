<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{wgDocInput$SBInspect.page1}" id="page1">
            <ui:html binding="#{wgDocInput$SBInspect.html1}" id="html1">
                <ui:head binding="#{wgDocInput$SBInspect.head1}" id="head1">
                    <ui:link binding="#{wgDocInput$SBInspect.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{wgDocInput$SBInspect.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{wgDocInput$SBInspect.form1}" id="form1">
                        <div style="left: 16px; top: 48px; position: absolute">
                            <jsp:directive.include file="../wgDocInputF/SBInspect.jspf"/>
                        </div>
                        <ui:label binding="#{wgDocInput$SBInspect.label1}" id="label1" labelLevel="1" style="left: 184px; top: 8px; position: absolute" text="审核设备图档"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
