<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{AccountOP$CreateUserAccount.page1}" id="page1">
            <ui:html binding="#{AccountOP$CreateUserAccount.html1}" id="html1">
                <ui:head binding="#{AccountOP$CreateUserAccount.head1}" id="head1">
                    <ui:link binding="#{AccountOP$CreateUserAccount.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{AccountOP$CreateUserAccount.body1}" id="body1" style="text-align: center; -rave-layout: grid">
                    <ui:form binding="#{AccountOP$CreateUserAccount.form1}" id="form1">
                        <ui:button action="#{AccountOP$CreateUserAccount.button_Ok_action}" binding="#{AccountOP$CreateUserAccount.button_Ok}" id="button_Ok"
                            style="height: 32px; left: 287px; top: 384px; position: absolute; width: 80px" text="确定"/>
                        <ui:message binding="#{AccountOP$CreateUserAccount.message1}" for="textField_password" id="message1" showDetail="false"
                            showSummary="true" style="height: 22px; left: 144px; top: 120px; position: absolute; width: 310px"/>
                        <ui:textArea binding="#{AccountOP$CreateUserAccount.textArea_userMemo}" columns="28" id="textArea_userMemo" rows="4" style="height: 50px; left: 144px; top: 312px; position: absolute; width: 334px"/>
                        <ui:textField binding="#{AccountOP$CreateUserAccount.textField_password}" id="textField_password" required="true"
                            style="left: 240px; top: 96px; position: absolute; width: 240px" validator="#{AccountOP$CreateUserAccount.textField_password_validate}"/>
                        <ui:messageGroup binding="#{AccountOP$CreateUserAccount.messageGroup1}" id="messageGroup1" showGlobalOnly="true" style="left: 600px; top: 240px; position: absolute"/>
                        <ui:message binding="#{AccountOP$CreateUserAccount.message2}" for="textField_acountName" id="message2" showDetail="false"
                            showSummary="true" style="height: 22px; left: 144px; top: 72px; position: absolute; width: 310px"/>
                        <ui:label binding="#{AccountOP$CreateUserAccount.label1}" id="label1" labelLevel="1" style="left: 312px; top: 0px; position: absolute" text="创建新帐号"/>
                        <ui:button action="#{AccountOP$CreateUserAccount.button_cancel_action}" binding="#{AccountOP$CreateUserAccount.button_cancel}"
                            id="button_cancel" style="height: 32px; left: 383px; top: 384px; position: absolute; width: 80px" text="退出"/>
                        <ui:textField binding="#{AccountOP$CreateUserAccount.textField_userTitle}" id="textField_userTitle" style="left: 240px; top: 192px; position: absolute; width: 240px"/>
                        <ui:textField binding="#{AccountOP$CreateUserAccount.textField_userName}" id="textField_userName" style="left: 240px; top: 144px; position: absolute; width: 240px"/>
                        <ui:textField binding="#{AccountOP$CreateUserAccount.textField_acountName}" id="textField_acountName" required="true"
                            style="left: 240px; top: 48px; position: absolute; width: 240px" validator="#{AccountOP$CreateUserAccount.textField_acountName_validate}"/>
                        <ui:dropDown binding="#{AccountOP$CreateUserAccount.dropDown_userRole}" id="dropDown_userRole" onChange="" style="left: 240px; top: 240px; position: absolute; width: 240px"/>
                        <ui:staticText binding="#{AccountOP$CreateUserAccount.staticText1}" id="staticText1" style="left: 144px; top: 48px; position: absolute" text="帐号名称(必须):"/>
                        <ui:staticText binding="#{AccountOP$CreateUserAccount.staticText2}" id="staticText2" style="left: 144px; top: 96px; position: absolute" text="帐号密码(必须):"/>
                        <ui:staticText binding="#{AccountOP$CreateUserAccount.staticText3}" id="staticText3" style="left: 144px; top: 144px; position: absolute" text="用户姓名(选填):   "/>
                        <ui:staticText binding="#{AccountOP$CreateUserAccount.staticText4}" id="staticText4" style="left: 144px; top: 192px; position: absolute" text="用户职务(选填):   "/>
                        <ui:staticText binding="#{AccountOP$CreateUserAccount.staticText5}" id="staticText5"
                            style="height: 22px; left: 144px; top: 240px; position: absolute; width: 94px" text="用户角色(必选):"/>
                        <ui:staticText binding="#{AccountOP$CreateUserAccount.staticText6}" id="staticText6" style="left: 144px; top: 288px; position: absolute" text="用户备注信息:"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
