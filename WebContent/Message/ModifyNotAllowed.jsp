<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Message$ModifyNotAllowed.page1}" id="page1">
            <ui:html binding="#{Message$ModifyNotAllowed.html1}" id="html1">
                <ui:head binding="#{Message$ModifyNotAllowed.head1}" id="head1">
                    <ui:link binding="#{Message$ModifyNotAllowed.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Message$ModifyNotAllowed.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Message$ModifyNotAllowed.form1}" id="form1">
                        <ui:hyperlink action="#{Message$ModifyNotAllowed.hyperlink1_action}" binding="#{Message$ModifyNotAllowed.hyperlink1}" id="hyperlink1"
                            style="left: 168px; top: 432px; position: absolute" text="您不能修改自己所属的角色!点击返回!" visible="false"/>
                        <ui:button action="#{Message$ModifyNotAllowed.button1_action}" binding="#{Message$ModifyNotAllowed.button1}" id="button1"
                            style="height: 32px; left: 311px; top: 336px; position: absolute; width: 80px" text="返回"/>
                        <ui:panelLayout binding="#{Message$ModifyNotAllowed.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 200px; left: 168px; top: 120px; position: absolute; width: 400px">
                            <ui:panelLayout binding="#{Message$ModifyNotAllowed.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="background-color: rgb(211, 224, 235); height: 40px; width: 400px"/>
                            <ui:panelLayout binding="#{Message$ModifyNotAllowed.layoutPanel3}" id="layoutPanel3" style="background-color: rgb(153, 153, 153); height: 160px; width: 400px">
                                <ui:image binding="#{Message$ModifyNotAllowed.image1}" id="image1" style="left: 96px; top: 48px; position: absolute" url="/resources/Success.gif"/>
                                <ui:staticText binding="#{Message$ModifyNotAllowed.staticText1}" id="staticText1"
                                    style="color: black; font-size: 18px; font-style: normal; font-weight: normal; left: 144px; top: 48px; position: absolute" text="您不能修改自己所属的角色!"/>
                            </ui:panelLayout>
                        </ui:panelLayout>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
