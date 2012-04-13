<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{AccountOP$ShowAllAccount.page1}" id="page1">
            <ui:html binding="#{AccountOP$ShowAllAccount.html1}" id="html1">
                <ui:head binding="#{AccountOP$ShowAllAccount.head1}" id="head1">
                    <ui:link binding="#{AccountOP$ShowAllAccount.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{AccountOP$ShowAllAccount.body1}" id="body1" style="text-align: center; -rave-layout: grid">
                    <ui:form binding="#{AccountOP$ShowAllAccount.form1}" id="form1">
                        <ui:messageGroup binding="#{AccountOP$ShowAllAccount.messageGroup1}" id="messageGroup1" style="left: 24px; top: 456px; position: absolute; width: 334px"/>
                        <ui:panelLayout binding="#{AccountOP$ShowAllAccount.layoutPanel1}" id="layoutPanel1" style="height: 334px; margin-left: auto; margin-right: auto; left: 0px; top: 0px; position: relative; width: 454px; -rave-layout: grid">
                            <ui:label binding="#{AccountOP$ShowAllAccount.label1}" id="label1" labelLevel="1"
                                style="height: 24px; left: 121px; top: 1px; position: absolute; width: 142px" text="所有用户帐号"/>
                            <ui:table binding="#{AccountOP$ShowAllAccount.table1}" id="table1"
                                style="height: 43px; left: 0px; top: 48px; position: absolute; width: 440px" title="用户帐号一览" width="440">
                                <ui:tableRowGroup binding="#{AccountOP$ShowAllAccount.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                    sourceData="#{AccountOP$ShowAllAccount.tuserDataProvider}" sourceVar="currentRow">
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn1}" headerText="帐号名称" id="tableColumn1" sort="accountName" valign="top">
                                        <ui:staticText binding="#{AccountOP$ShowAllAccount.staticText1}" id="staticText1" text="#{currentRow.value['accountName']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn2}" headerText="密码" id="tableColumn2" valign="top">
                                        <ui:staticText binding="#{AccountOP$ShowAllAccount.staticText2}" id="staticText2" text="#{currentRow.value['password']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn3}" headerText="用户名称" id="tableColumn3" valign="top">
                                        <ui:staticText binding="#{AccountOP$ShowAllAccount.staticText3}" id="staticText3" text="#{currentRow.value['userName']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn4}" headerText="职务" id="tableColumn4" valign="top">
                                        <ui:staticText binding="#{AccountOP$ShowAllAccount.staticText4}" id="staticText4" text="#{currentRow.value['title']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn5}" headerText="备注信息" id="tableColumn5" valign="top">
                                        <ui:staticText binding="#{AccountOP$ShowAllAccount.staticText6}" id="staticText6" text="#{currentRow.value['memo']}"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn7}" headerText="修改帐号" id="tableColumn7" valign="top">
                                        <ui:hyperlink action="#{AccountOP$ShowAllAccount.hyperlink_modifyAccount_action}"
                                            binding="#{AccountOP$ShowAllAccount.hyperlink_modifyAccount}" id="hyperlink_modifyAccount" text="修改"/>
                                    </ui:tableColumn>
                                    <ui:tableColumn binding="#{AccountOP$ShowAllAccount.tableColumn6}" headerText="删除" id="tableColumn6" valign="top">
                                        <ui:hyperlink action="#{AccountOP$ShowAllAccount.hyperlink_deleteAccount_action}"
                                            binding="#{AccountOP$ShowAllAccount.hyperlink_deleteAccount}" id="hyperlink_deleteAccount" text="删除"/>
                                    </ui:tableColumn>
                                </ui:tableRowGroup>
                                <ui:staticText binding="#{AccountOP$ShowAllAccount.staticText5}" id="staticText5" text="AcountName"/>
                            </ui:table>
                        </ui:panelLayout>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
