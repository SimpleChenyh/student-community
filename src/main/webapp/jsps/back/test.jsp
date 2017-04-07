﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>学生社区管理</title>
<link rel="stylesheet" type="text/css" href="/student-community/easyui/themes/material/easyui.css" />
<link rel="stylesheet" type="text/css" href="/student-community/css/mycssback.css" />
<link rel="stylesheet" type="text/css" href="/student-community/easyui/themes/icon.css" />
<script src="/student-community/js/jquery.min.js"></script>
<script src="/student-community/easyui/jquery.easyui.min.js"></script>
</head>
<body>
    <h2>Custom DataGrid Pager</h2>
    <p>You can append some buttons to the standard datagrid pager bar.</p>
    <div style="margin: 20px 0;"></div>
    <table id="dg" title="Custom DataGrid Pager" style="width: 700px; height: 250px"
        data-options="rownumbers:true,singleSelect:true,pagination:true,url:'datagrid_data1.json',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'itemid',width:80">Item ID</th>
                <th data-options="field:'productid',width:100">Product</th>
                <th data-options="field:'listprice',width:80,align:'right'">List Price</th>
                <th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
                <th data-options="field:'attr1',width:240">Attribute</th>
                <th data-options="field:'status',width:60,align:'center'">Status</th>
            </tr>
        </thead>
    </table>
</body>
<script type="text/javascript">
    $(function() {
        var pager = $('#dg').datagrid().datagrid('getPager'); // get the pager of datagrid
        pager.pagination({
            buttons : [ {
                iconCls : 'icon-search',
                handler : function() {
                    alert('search');
                }
            }, {
                iconCls : 'icon-add',
                handler : function() {
                    alert('add');
                }
            }, {
                iconCls : 'icon-edit',
                handler : function() {
                    alert('edit');
                }
            } ]
        });
    })
</script>
</html>