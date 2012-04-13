<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Login.page1}" id="page1">
            <ui:html binding="#{Login.html1}" id="html1">
                <ui:head binding="#{Login.head1}" id="head1">
                    <ui:link binding="#{Login.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Login.body1}" id="body1" style="text-align: center;-rave-layout: grid">
                    <ui:form binding="#{Login.form1}" id="form1" virtualFormsConfig="form_submit | layoutPanel2:txtName layoutPanel2:txtPassword | layoutPanel2:btnLogin , form_reset | | layoutPanel2:btnReset">
                        <ui:panelLayout binding="#{Login.layoutPanel1}" id="layoutPanel1" style="background-color: rgb(211, 224, 235); background-image: url(resources/TitleBar.gif); font-family: 'Courier New','Courier',monospace; height: 94px; margin-left: auto; margin-right: auto; left: 13px; top: 0px; position: relative; vertical-align: bottom; width: 982px; -rave-layout: grid"/>
                        <ui:panelLayout binding="#{Login.layoutPanel2}" id="layoutPanel2" style="border: 1px solid gray; height: 254px; margin-left: auto; margin-right: auto; left: 137px; top: 100px; position: relative; width: 490px; -rave-layout: grid">
                            <ui:textField binding="#{Login.txtName}" id="txtName" required="true" style="left: 168px; top: 40px; position: absolute" tabIndex="2"/>
                            <ui:button action="#{Login.btnLogin_action}" binding="#{Login.btnLogin}" id="btnLogin"
                                style="height: 32px; left: 119px; top: 200px; position: absolute; width: 80px" tabIndex="4" text="登录"/>
                            <ui:message binding="#{Login.message1}" for="txtPassword" id="message1" showDetail="false" showSummary="true" style="left: 168px; top: 136px; position: absolute"/>
                            <ui:message binding="#{Login.message2}" for="txtName" id="message2" showDetail="false" showSummary="true" style="left: 168px; top: 64px; position: absolute"/>
                            <ui:passwordField binding="#{Login.txtPassword}" id="txtPassword" style="left: 168px; top: 112px; position: absolute" tabIndex="3"/>
                            <ui:button action="#{Login.btnReset_action}" binding="#{Login.btnReset}" id="btnReset"
                                style="height: 32px; left: 215px; top: 200px; position: absolute; width: 80px" tabIndex="1" text="重置"/>
                            <ui:label binding="#{Login.label1}" for="txtName" id="label1" style="left: 81px; top: 41px; position: absolute" text="用户名："/>
                            <ui:label binding="#{Login.label2}" id="label2" style="left: 81px; top: 113px; position: absolute" text="密码："/>
                            <ui:staticText binding="#{Login.txtInfo}" id="txtInfo" style="color: red; left: 96px; top: 168px; position: absolute"
                                text="该用户不存在或者密码错误,请重试!" visible="false"/>
                        </ui:panelLayout>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
