<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<@defaultLayout.layout>
<div class="panel panel-headline">
    <div class="panel-heading">
        <h3 class="panel-title">欢迎 <span class="text-danger">${user.fUser!''}</span> 来到网盘系统</h3>
    </div>
</div>
</@defaultLayout.layout>