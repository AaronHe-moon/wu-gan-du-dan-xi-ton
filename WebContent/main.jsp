<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{main.page1}" id="page1">
            <ui:html binding="#{main.html1}" id="html1">
                <ui:head binding="#{main.head1}" id="head1">
                    <ui:link binding="#{main.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{main.body1}" id="body1" style="text-align: center; -rave-layout: grid">
                    <ui:form binding="#{main.form1}" id="form1">
                        <ui:panelLayout binding="#{main.layoutPanel1}" id="layoutPanel1" style="background-color: rgb(211, 224, 235); background-image: url(resources/TitleBar.gif); font-family: 'Courier New',Courier,monospace; height: 94px; margin-left: auto; margin-right: auto; left: 0px; top: 0px; position: relative; vertical-align: bottom; width: 982px; -rave-layout: grid">
                            <ui:label binding="#{main.lblUser}" id="lblUser" style="left: 552px; top: 120px; position: absolute" text="你好,#{SessionBean1.currentUser.accountName}"/>
                        </ui:panelLayout>
                        <ui:panelLayout binding="#{main.layoutPanel4}" id="layoutPanel4" style="margin-left: auto; margin-right: auto; position: relative;background-color: rgb(211, 224, 235); height: 46px; left: 0px; top: 0px; width: 982px; -rave-layout: grid">
                            <ui:tabSet binding="#{main.tabSet1}" id="tabSet1" selected="tab1" style="background-color: rgb(211, 224, 235); left: 192px; top: 0px; position: absolute; width: 693px">
                                <ui:tab action="#{main.tab1_action}" binding="#{main.tab1}" id="tab1" style="width: 31px" text="首页"/>
                                <ui:tab action="#{main.tab2_action}" binding="#{main.tab2}" id="tab2" text="图档检索"/>
                                <ui:tab action="#{main.tab3_action}" binding="#{main.tab3}" id="tab3" text="类目管理"/>
                                <ui:tab action="#{main.tab4_action}" binding="#{main.tab4}" id="tab4" text="图档输入"/>
                                <ui:tab action="#{main.tab5_action}" binding="#{main.tab5}" id="tab5" text="图档审查"/>
                                <ui:tab action="#{main.tab6_action}" binding="#{main.tab6}" id="tab6" text="用户管理"/>
                                <ui:tab action="#{main.tab7_action}" binding="#{main.tab7}" id="tab7" text="报表管理"/>
                            </ui:tabSet>
                            <ui:staticText binding="#{main.staticText1}" id="staticText1" style="left: 0px; top: 0px; position: absolute" text="你好,#{SessionBean1.currentUser.accountName}"/>
                            <ui:hyperlink action="#{main.hyperlink_quit_action}" binding="#{main.hyperlink_quit}" id="hyperlink_quit"
                                style="font-family: serif; font-size: 10px; left: 0px; top: 24px; position: absolute" text="退出"/>
                            <ui:hyperlink action="#{main.hyperlink_changePassword_action}" binding="#{main.hyperlink_changePassword}"
                                id="hyperlink_changePassword" style="font-family: serif; font-size: 10px; left: 48px; top: 24px; position: absolute" text="修改密码"/>
                        </ui:panelLayout>
                        <ui:panelLayout binding="#{main.layoutPanel6}" id="layoutPanel6" style="height: 502px; margin-left: auto; margin-right: auto; left: 0px; top: 0px; position: relative; width: 982px">
                            <ui:panelLayout binding="#{main.layoutPanel2}" id="layoutPanel2" panelLayout="flow" style="background-color: rgb(211, 224, 235);  height: 502px; left: 0px; top: 0px; position: absolute; width: 166px">
                                <ui:panelLayout binding="#{main.palCat}" id="palCat"
                                    style="background-color: rgb(211, 224, 235); color: purple; height: 278px; width: 134px; -rave-layout: grid" visible="false">
                                    <ui:hyperlink action="#{main.hyperlink1_action}" binding="#{main.hyperlink1}" id="hyperlink1"
                                        style="left: 57px; top: 33px; position: absolute" text="查看一级类目"/>
                                    <ui:hyperlink action="#{main.hyperlink2_action}" binding="#{main.hyperlink2}" id="hyperlink2"
                                        style="left: 56px; top: 136px; position: absolute" text="增加一级类目"/>
                                    <ui:hyperlink action="#{main.hyperlink3_action}" binding="#{main.hyperlink3}" id="hyperlink3"
                                        style="left: 56px; top: 80px; position: absolute" text="查看二级类目"/>
                                    <ui:hyperlink action="#{main.hyperlink4_action}" binding="#{main.hyperlink4}" id="hyperlink4"
                                        style="left: 56px; top: 192px; position: absolute" text="增加二级类目"/>
                                </ui:panelLayout>
                                <ui:panelLayout binding="#{main.palInput}" id="palInput"
                                    style="background-color: rgb(211, 224, 235); color: purple; height: 278px; width: 134px; -rave-layout: grid" visible="false">
                                    <ui:hyperlink action="#{main.hyperlink5_action}" binding="#{main.hyperlink5}" id="hyperlink5"
                                        style="left: 57px; top: 33px; position: absolute" text="输入基建图档"/>
                                    <ui:hyperlink action="#{main.hyperlink6_action}" binding="#{main.hyperlink6}" id="hyperlink6"
                                        style="left: 56px; top: 136px; position: absolute" text="修改基建图档"/>
                                    <ui:hyperlink action="#{main.hyperlink7_action}" binding="#{main.hyperlink7}" id="hyperlink7"
                                        style="left: 56px; top: 80px; position: absolute" text="输入设备图档"/>
                                    <ui:hyperlink action="#{main.hyperlink8_action}" binding="#{main.hyperlink8}" id="hyperlink8"
                                        style="left: 56px; top: 192px; position: absolute" text="修改设备图档"/>
                                </ui:panelLayout>
                                <ui:panelLayout binding="#{main.palInspect}" id="palInspect"
                                    style="background-color: rgb(211, 224, 235); color: purple; height: 278px; width: 134px; -rave-layout: grid" visible="false">
                                    <ui:hyperlink action="#{main.hyperlink9_action}" binding="#{main.hyperlink9}" id="hyperlink9"
                                        style="left: 56px; top: 40px; position: absolute" text="审批基建图档"/>
                                    <ui:hyperlink action="#{main.hyperlink10_action}" binding="#{main.hyperlink10}" id="hyperlink10"
                                        style="left: 56px; top: 88px; position: absolute" text="审批设备图档"/>
                                </ui:panelLayout>
                                <ui:panelLayout binding="#{main.palUser}" id="palUser"
                                    style="background-color: rgb(211, 224, 235); color: purple; height: 278px; width: 134px; -rave-layout: grid" visible="false">
                                    <ui:hyperlink action="#{main.hyperlink11_action}" binding="#{main.hyperlink11}" id="hyperlink11"
                                        style="left: 64px; top: 24px; position: absolute" text="建立角色"/>
                                    <ui:hyperlink action="#{main.hyperlink12_action}" binding="#{main.hyperlink12}" id="hyperlink12"
                                        style="left: 64px; top: 120px; position: absolute" text="建立帐号"/>
                                    <ui:hyperlink action="#{main.hyperlink13_action}" binding="#{main.hyperlink13}" id="hyperlink13"
                                        style="left: 64px; top: 72px; position: absolute" text="修改角色"/>
                                    <ui:hyperlink action="#{main.hyperlink14_action}" binding="#{main.hyperlink14}" id="hyperlink14"
                                        style="left: 64px; top: 176px; position: absolute" text="修改帐号"/>
                                    <ui:hyperlink action="#{main.hyperlink15_action}" binding="#{main.hyperlink15}" id="hyperlink15"
                                        style="left: 64px; top: 232px; position: absolute" text="搜索帐号" visible="false"/>
                                </ui:panelLayout>
                            </ui:panelLayout>
                            <ui:panelLayout binding="#{main.layoutPanel3}" id="layoutPanel3" panelLayout="flow" style="height: 501px; left: 168px; top: 0px; position: absolute; width: 814px">
                                <ui:staticText binding="#{main.txtCode}" escape="false" id="txtCode"/>
                            </ui:panelLayout>
                        </ui:panelLayout>
                        <ui:panelLayout binding="#{main.layoutPanel5}" id="layoutPanel5" style="height: 118px; margin-left: auto; margin-right: auto; left: 0px; top: 0px; position: relative; width: 982px; -rave-layout: grid">
                            <ui:pageSeparator binding="#{main.pageSeparator1}" id="pageSeparator1" style="height: 23px; left: -24px; top: 0px; position: absolute"/>
                            <ui:label binding="#{main.label1}" id="label1" style="height: 47px; left: 336px; top: 48px; position: absolute; width: 381px" text="Copyright © 2007～2010   All rights reserved.    &#xa;    地址:湖北省武汉市青山区工业港     # 邮编：430082 版权所有  &#xa;    联系管理员：webmaster@wust.edu.cn &#xa;"/>
                        </ui:panelLayout>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
