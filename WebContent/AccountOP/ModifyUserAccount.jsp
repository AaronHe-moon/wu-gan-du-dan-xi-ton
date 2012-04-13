<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{AccountOP$ModifyUserAccount.page1}" id="page1">
            <ui:html binding="#{AccountOP$ModifyUserAccount.html1}" id="html1">
                <ui:head binding="#{AccountOP$ModifyUserAccount.head1}" id="head1">
                    <ui:link binding="#{AccountOP$ModifyUserAccount.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{AccountOP$ModifyUserAccount.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{AccountOP$ModifyUserAccount.form1}" id="form1">
                        <ui:textArea binding="#{AccountOP$ModifyUserAccount.textArea_UserMemo}" id="textArea_UserMemo" style="left: 96px; top: 312px; position: absolute; width: 336px"/>
                        <ui:staticText binding="#{AccountOP$ModifyUserAccount.staticText1}" id="staticText1" style="left: 96px; top: 96px; position: absolute" text="密码："/>
                        <ui:staticText binding="#{AccountOP$ModifyUserAccount.staticText2}" id="staticText2" style="left: 96px; top: 288px; position: absolute" text="备注："/>
                        <ui:textField binding="#{AccountOP$ModifyUserAccount.textField_UserName}" id="textField_UserName" style="left: 192px; top: 144px; position: absolute; width: 240px"/>
                        <ui:button action="#{AccountOP$ModifyUserAccount.button_Ok_action}" binding="#{AccountOP$ModifyUserAccount.button_Ok}" id="button_Ok"
                            style="height: 32px; left: 239px; top: 384px; position: absolute; width: 80px" text="确定"/>
                        <ui:staticText binding="#{AccountOP$ModifyUserAccount.staticText3}" id="staticText3" style="left: 96px; top: 192px; position: absolute" text="用户职务："/>
                        <ui:label binding="#{AccountOP$ModifyUserAccount.label1}" id="label1" labelLevel="1" style="left: 216px; top: 0px; position: absolute" text="修改用户帐号"/>
                        <ui:dropDown binding="#{AccountOP$ModifyUserAccount.dropDown_UserRole}" id="dropDown_UserRole" onChange="" style="left: 192px; top: 240px; position: absolute; width: 240px"/>
                        <ui:staticText binding="#{AccountOP$ModifyUserAccount.staticText4}" id="staticText4" style="left: 96px; top: 144px; position: absolute" text="用户姓名："/>
                        <ui:textField binding="#{AccountOP$ModifyUserAccount.textField_Password}" id="textField_Password" style="left: 192px; top: 96px; position: absolute; width: 240px"/>
                        <ui:textField binding="#{AccountOP$ModifyUserAccount.textField_UserTitle}" id="textField_UserTitle" style="left: 192px; top: 192px; position: absolute; width: 240px"/>
                        <ui:staticText binding="#{AccountOP$ModifyUserAccount.staticText5}" id="staticText5" style="left: 96px; top: 48px; position: absolute" text="帐号名称："/>
                        <ui:staticText binding="#{AccountOP$ModifyUserAccount.staticText6}" id="staticText6" style="left: 96px; top: 240px; position: absolute" text="用户角色："/>
                        <ui:textField binding="#{AccountOP$ModifyUserAccount.textField_AccountName}" disabled="true" id="textField_AccountName" style="left: 192px; top: 48px; position: absolute; width: 240px"/>
                        <ui:messageGroup binding="#{AccountOP$ModifyUserAccount.messageGroup1}" id="messageGroup1" style="left: 560px; top: 279px; position: absolute"/>
                        <ui:button action="#{AccountOP$ModifyUserAccount.button1_action}" binding="#{AccountOP$ModifyUserAccount.button1}" id="button1"
                            style="height: 32px; left: 335px; top: 384px; position: absolute; width: 80px" text="退出"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
