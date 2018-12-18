<%@ page contentType="text/html;charset=UTF-8" language="java"
    errorPage="../common/error.jsp"%>
<%@include file="../common/common.jsp"%>

<p:title>
        <td class="caption">
         <strong>费用分担</strong>
        </td>
    </p:title>

    <p:line flag="0" />
<tr>
    <td colspan='2' align='center'>
        <label for="budget">月度预算：</label>
        <select name="budget" id="budget">
            <option value="0"></option>
        </select>
        <label for="bearType">承担方式：</label>
        <select name="bearType" id="bearType" onchange="changeType(this)">
            <option value="0"></option>
            <option value="1">其他部门</option>
            <option value="2">省级经理下属承担</option>
            <option value="3">区域总监下属承担</option>
            <option value="4">大区总经理下属承担</option>
            <option value="5">专员承担</option>
        </select>
        <label for="manager">承担经理：</label>
        <select name="manager" id="manager" onchange="changeManager(this)">
            <option value="0"></option>
        </select>
    </td>
</tr>

    <tr>
        <td colspan='2' align='center'>
        <table width="98%" border="0" cellpadding="0" cellspacing="0"
            class="border">
            <tr>
                <td>
                <table width="100%" border="0" cellspacing='1' id="tables_share">
                    <tr align="center" class="content0">
                        <td width="15%" align="center">承担人</td>
                        <td width="10%" align="center">分担金额</td>
                        <td width="5%" align="left"><input type="button" accesskey="B"
                            value="增加" class="button_class" onclick="addShareTr()"></td>
                    </tr>
                    
                    <c:forEach items="${bean.shareVOList}" var="itemEach" varStatus="vs">
                    <tr class="content1">
                     
                     <td align="left">
                     <input type="text" style="width: 100%;cursor: pointer;"
                                name="s_bearName" value="${itemEach.bearName}" readonly="readonly" onclick="selectStaffer2(this)">
                     <input type="hidden" name="s_bearId" value="${itemEach.bearId}"> 
                     </td>
                     
                     <td align="left">
                     <input type="text" style="width: 100%"
                                name="s_ratio" value="${itemEach.showRealMonery}" oncheck="notNone;isFloat2">
                     </td>
                     
                    <td width="5%" align="center"><input type=button
                        value="&nbsp;删 除&nbsp;" class=button_class onclick="removeTr(this)"></td>
                    </tr>
                    </c:forEach>
                    
                </table>
                </td>
            </tr>
        </table>

        </td>
    </tr>
    