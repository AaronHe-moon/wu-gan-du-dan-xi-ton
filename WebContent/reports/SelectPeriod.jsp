<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{reports$SelectPeriod.page1}" id="page1">
            <ui:html binding="#{reports$SelectPeriod.html1}" id="html1">
                <ui:head binding="#{reports$SelectPeriod.head1}" id="head1">
                    <ui:link binding="#{reports$SelectPeriod.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{reports$SelectPeriod.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{reports$SelectPeriod.form1}" id="form1">
                        <ui:calendar binding="#{reports$SelectPeriod.calendar_begin}" dateFormatPattern="yyyy-MM-dd" id="calendar_begin" label="请选择起始日期："
                            required="true" style="left: 48px; top: 40px; position: absolute"/>
                        <ui:calendar binding="#{reports$SelectPeriod.calendar_end}" dateFormatPattern="yyyy-MM-dd" id="calendar_end" label="请选择结束日期："
                            required="true" style="left: 48px; top: 104px; position: absolute"/>
                        <ui:button action="#{reports$SelectPeriod.btnSubmit_action}" binding="#{reports$SelectPeriod.btnSubmit}" id="btnSubmit"
                            style="height: 32px; left: 263px; top: 504px; position: absolute; width: 80px" text="生成报表"/>
                        <ui:label binding="#{reports$SelectPeriod.label1}" id="label1" labelLevel="1" style="left: 48px; top: 0px; position: absolute" text="请选择条件生成报表"/>
                        <ui:messageGroup binding="#{reports$SelectPeriod.messageGroup1}" id="messageGroup1" style="left: 480px; top: 152px; position: absolute"/>
                        <ui:addRemove availableItemsLabel="可用：" binding="#{reports$SelectPeriod.arList}" id="arList" label="选择帐号" labelOnTop="true"
                            required="true" rows="8" selectAll="true" selectedItemsLabel="选定：" style="height: 94px; left: 48px; top: 160px; position: absolute; text-align: center; width: 374px"/>
                        <ui:dropDown binding="#{reports$SelectPeriod.ddType}" id="ddType" items="#{reports$SelectPeriod.ddTypeDefaultOptions.options}"
                            label="选择文档类型" required="true" style="left: 48px; top: 480px; position: absolute; width: 326px" visible="false"/>
                        <ui:addRemove availableItemsLabel="可用：" binding="#{reports$SelectPeriod.addRemove_OP}" id="addRemove_OP" label="选择操作" labelOnTop="true"
                            required="true" rows="3" selectedItemsLabel="选定：" style="left: 56px; top: 376px; position: absolute; text-align: center"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
