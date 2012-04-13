<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{AccountOP$ChangeAccountPassword.page1}" id="page1">
            <ui:html binding="#{AccountOP$ChangeAccountPassword.html1}" id="html1">
                <ui:head binding="#{AccountOP$ChangeAccountPassword.head1}" id="head1">
                    <ui:link binding="#{AccountOP$ChangeAccountPassword.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{AccountOP$ChangeAccountPassword.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{AccountOP$ChangeAccountPassword.form1}" id="form1">
                        <ui:staticText binding="#{AccountOP$ChangeAccountPassword.staticText1}" id="staticText1"
                            style="position: absolute; left: 168px; top: 168px" text="原始密码:"/>
                        <ui:staticText binding="#{AccountOP$ChangeAccountPassword.staticText2}" id="staticText2"
                            style="position: absolute; left: 168px; top: 216px" text="新密码:"/>
                        <ui:staticText binding="#{AccountOP$ChangeAccountPassword.staticText3}" id="staticText3"
                            style="position: absolute; left: 168px; top: 264px" text="确认新密码:"/>
                        <ui:passwordField binding="#{AccountOP$ChangeAccountPassword.txtOldPsw}" id="txtOldPsw"
                            style="left: 240px; top: 168px; position: absolute; width: 250px" validator="#{AccountOP$ChangeAccountPassword.txtOldPsw_validate}"/>
                        <ui:passwordField binding="#{AccountOP$ChangeAccountPassword.txtNewPsw}" id="txtNewPsw" style="left: 240px; top: 216px; position: absolute; width: 250px"/>
                        <ui:passwordField binding="#{AccountOP$ChangeAccountPassword.txtConfirmNewPsw}" id="txtConfirmNewPsw"
                            style="left: 240px; top: 264px; position: absolute; width: 250px" validator="#{AccountOP$ChangeAccountPassword.txtConfirmNewPsw_validate}"/>
                        <ui:button action="#{AccountOP$ChangeAccountPassword.button_Submit_action}" binding="#{AccountOP$ChangeAccountPassword.button_Submit}"
                            id="button_Submit" style="height: 32px; left: 239px; top: 336px; position: absolute; width: 80px" text="确定"/>
                        <ui:message binding="#{AccountOP$ChangeAccountPassword.message1}" for="txtOldPsw" id="message1" showDetail="false" showSummary="true" style="position: absolute; left: 168px; top: 192px"/>
                        <ui:message binding="#{AccountOP$ChangeAccountPassword.message2}" for="txtConfirmNewPsw" id="message2" showDetail="false"
                            showSummary="true" style="left: 168px; top: 288px; position: absolute"/>
                        <ui:button action="#{AccountOP$ChangeAccountPassword.button1_action}" binding="#{AccountOP$ChangeAccountPassword.button1}" id="button1"
                            style="height: 32px; left: 336px; top: 336px; position: absolute; width: 80px" text="退出"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
