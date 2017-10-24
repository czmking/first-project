<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<#list list as ll>
<#if acc??>
    <#if acc!=ll.acc>
    账号是：${ll.acc},密码是${ll.pwd}<br/>
    </#if>
<#else>账号是：${ll.acc},密码是${ll.pwd}<br/>
</#if>
</#list>
</body>
</html>