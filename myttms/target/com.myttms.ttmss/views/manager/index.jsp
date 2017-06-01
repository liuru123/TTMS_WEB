<%@ page import="com.ttms.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: hjh
  Date: 16-12-14
  Time: 下午12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>影院管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/index.css">
    <style type="text/css">
        .mypic{

            height: 35px;
            width: 35px;
        }
    </style>
</head>
<body>
<div style="width: 1430px; height: 100%;">
    <div class="mian_r" onmousemove="r(22)" onmouseout="r_1(22)">
        <div class="mian_r_bj png" style="display: none;" id="22" onmousemove="r(22)" onmouseout="r_1(22)">
            <div>
                <a href="#">
                    <img src="/images/r_icon_03.png"></a> <a href="#">
                <img src="/images/r_icon_06.png"></a> <a href="#">
                <img src="/images/r_icon_08.png"></a> <a href="#">
                <img src="/images/r_icon_10.png"></a>
            </div>
        </div>
    </div>
    <%
        Employee employee = (Employee)request.getAttribute("employee");
    %>
    <table height="100%" width="1425" border="0" cellpadding="0" cellspacing="0" style="overflow: hidden;">
        <tr>
            <td colspan="2" height="52">
                <div>
                    <div id="header">
                        <div class="header01">
                            <p class="logo">
                                <a href="index-x.jsp">
                                    <span style="font-family:宋体;　color:black; font-size:30px; font-weight:bold;">影院管理系统</span></a></p>
                            <p class="right_01" style="position: absolute; z-index: 9; width: e-xpression(this.nextSibling.offsetWidth);
                                    height: e-xpression(this.nextSibling.offsetHeight); top: e-xpression(this.nextSibling.offsetTop);
                                    left: e-xpression(this.nextSibling.offsetLeft);" frameborder="0">

                                <%
                                    if(employee.getEmp_pic() == null){
                                %>
                                <a href="/views/manager/UpdatePic.jsp" ><img src="/images/pic_06.gif" alt="/images/pic_06.gif"></a>
                                <%
                                    }
                                    else{
                                %>
                                    <a href="/views/manager/UpdatePic.jsp" ><img class="mypic" src="<%=employee.getEmp_pic()%>" alt="/images/pic_06.gif"></a>
                                <%
                                    }
                                %>

                            </p>
                            <p class="right_02">
                                您好，<span>加菲</span>，欢迎登录！</p>
                        </div>
                    </div>
                </div>
            </td>
        </tr>
        <tr>
            <td width="190" valign="top" style="background: url(/images/lift_bj_02.gif) repeat-y;"  background="/images/lift_bj_02.gif ">
                <div class="side" style="position: absolute;">
                    <ul id="nav">
                        <li class="y_css" id="xx1">
                            <a href="/employee/showemp"  target="mainFrame"><span></span>
                                <p class="icon_01">
                                    用户管理
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx3">
                            <a href="/studio/showstudio" target="mainFrame"><span></span>
                                <p class="icon_02">
                                    影厅管理
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx4">
                            <a href="/seat/seatshow"  target="mainFrame"><span></span>
                                <p class="icon_04">
                                    座位管理
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx5">
                            <a href="/play/showplay"  target="mainFrame"><span></span>
                                <p class="icon_04">
                                    影片管理
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx6">
                            <a href="/schedule/showsched"   target="mainFrame"><span></span>
                                <p class="icon_04">
                                    演出计划管理
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx7">
                            <a href="/ticket/Seat" target="mainFrame"><span></span>
                                <p class="icon_10">
                                    管理员售票
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx8">
                            <a href="/play/showplay" target="mainFrame"><span></span>
                                <p class="icon_10">
                                    管理员退票
                                </p>
                            </a>
                        </li>
                        <li class="y_css" id="xx2">
                            <a href="/notice/shownotice" target="mainFrame"><span></span>
                                <p class="icon_10">
                                    系统公告
                                </p>
                            </a>
                        </li>

                    </ul>
                </div>
                <div class="side_02">
                    <ul>
                        <li class="y_css" id="xx10"><a href="../zhanshi_web/index.htm" target="_blank">
                            <p class="icon_08">
                                产品展示</p>
                        </a></li>
                    </ul>
                </div>
            </td>
            <td width="1215" valign="top">
                <div id="dTitle" style="float:left; margin-left:30px;">
                </div>
                <div style="text-align: right; margin-right: 15px; float: right">

                    <img src="/images/middil_05.gif" alt=""><a href="/user/quit"><img alt="" src="/images/middil_06.gif"></a></div>
                <iframe frameborder="0" style="margin-top: 15px; height: 631px;" width="1215" id="mainFrame" name="mainFrame" src="/employee/showemp"></iframe>
            </td>
            <td width="5" valign="top" style="position: relative;" height="93%">
            </td>
        </tr>
    </table>
</div>
</body>
</html>