<#import "defaultLayout/defaultLayout.ftl" as defaultLayout>
<#assign base="${request.contextPath}"/>
<@defaultLayout.layout>
<link rel="stylesheet" href="${base}/css/userInfo.css">
<link rel="stylesheet" href="${base}/css/style.css">
<div class="panel panel-default">
    <div class="panel-heading"><h3>我的资料</h3></div>
    <div class="panel-body">
        <div class="">
            <!-- PROFILE HEADER -->
            <div class="profile-header">
                <div class="overlay"></div>
                <div class="profile-main">
                    <#if user.fPhoto??>
                        <#--<img src="${base}/${userInfo.userImg}"  class="img-circle" alt="Avatar">-->
                    <#else>
                        <#--<img src="${base}/img/noimage.png"  class="img-circle" alt="Avatar">-->
                    </#if>

                    <h3 class="name">${user.fUser}</h3>
                    <span>欢迎你</span>
                </div>

            </div>
            <!-- END PROFILE HEADER -->
            <!-- PROFILE DETAIL -->
            <div class="profile-detail">
                <div class="profile-info">
                    <h4 class="heading">基础信息</h4>
                    <ul class="list-unstyled list-justify">
                        <li>用户名 <span>${user.fUser}</span></li>
                        <li><#if user.userPhone??>deng <span>${user.fTel}</span>
                        <#else>手机号 <span>暂未绑定手机号</span></#if></li>
                        <li>等级 <span>${user.fLevel!""}</span></li>
                    </ul>
                </div>
                <div class="profile-info">
                    <h4 class="heading">个人简介</h4>
                    <#if user.fIntroduction??>
                        <p>${user.fIntroduction}</p>
                    <#else>
                        <p>你还没有个人简介信息,快去 <a href="#">修改</a> 吧!</p>
                    </#if>
                </div>
            </div>
            <!-- END PROFILE DETAIL -->
        </div>
    </div>
</div>

</@defaultLayout.layout>