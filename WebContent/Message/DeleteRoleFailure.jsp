<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Message$DeleteRoleFailure.page1}" id="page1">
            <ui:html binding="#{Message$DeleteRoleFailure.html1}" id="html1">
                <ui:head binding="#{Message$DeleteRoleFailure.head1}" id="head1">
                    <ui:link binding="#{Message$DeleteRoleFailure.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Message$DeleteRoleFailure.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Message$DeleteRoleFailure.form1}" id="form1">
                        <ui:hyperlink action="#{Message$DeleteRoleFailure.hyperlink1_action}" binding="#{Message$DeleteRoleFailure.hyperlink1}" id="hyperlink1"
                            style="left: 216px; top: 240px; position: absolute" text="请删除拥有该角色的帐号以后再重试,请点击返回!" visible="false"/>
                        <ui:panelLayout binding="#{Message$DeleteRoleFailure.layoutPanel1}" id="layoutPanel1" panelLayout="flow" style="height: 200px; left: 144px; top: 144px; position: absolute; width: 400px">
                            <ui:panelLayout binding="#{Message$DeleteRoleFailure.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="background-color: rgb(211, 224, 235); height: 40px; width: 400px"/>
                            <ui:panelLayout binding="#{Message$DeleteRoleFailure.layoutPanel3}" id="layoutPanel3" style="background-color: rgb(153, 153, 153); height: 160px; width: 400px">
                                <ui:image binding="#{Message$DeleteRoleFailure.image1}" id="image1" style="left: 72px; top: 24px; position: absolute" url="/resources/Success.gif"/>
                                <ui:staticText binding="#{Message$DeleteRoleFailure.staticText1}" id="staticText1"
                                    style="color: black; font-size: 18px; font-style: normal; font-weight: normal; height: 94px; left: 120px; top: 24px; position: absolute; width: 238px" text="请删除拥有该角色的帐号以后再重试!"/>
                            </ui:panelLayout>
                        </ui:panelLayout>
                        <ui:button action="#{Message$DeleteRoleFailure.button1_action}" binding="#{Message$DeleteRoleFailure.button1}" id="button1"
                            style="height: 32px; left: 287px; top: 360px; position: absolute; width: 80px" text="返回"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
