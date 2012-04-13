<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{wgDocInput$SBInspectShowAll.page1}" id="page1">
            <ui:html binding="#{wgDocInput$SBInspectShowAll.html1}" id="html1">
                <ui:head binding="#{wgDocInput$SBInspectShowAll.head1}" id="head1">
                    <ui:link binding="#{wgDocInput$SBInspectShowAll.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{wgDocInput$SBInspectShowAll.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{wgDocInput$SBInspectShowAll.form1}" id="form1">
                        <div style="left: 24px; top: 0px; position: absolute">
                            <jsp:directive.include file="../wgDocInputF/SBInspectShowAll.jspf"/>
                        </div>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
