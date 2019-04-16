

#### 项目介绍

#### 启动项目

1. 在项目根目录执行命令 mvn clean package 打包项目

2. 先启动eureka-7001 注册中心 , 在cn.xuhweb.eureka-7001/target 目录下执行 命令 java -jar eureka-7001.jar --spring.profiles.active=node1 实现高可用注册中心.
3. 按照顺序 启动 认证中心服务端, AuthService7060 和认证中心资源中心 AuthResource7050
4. 启动zuulGateway 网关服务

#### 认证流程

1. 用户名密码认证

   - 请求方式 : POST

   - method : /oauth/token 

   - 请求体 : form-data

     | 请求字段      | 类型 | 说明                         |
     | ------------- | ---- | ---------------------------- |
     | username      |      |                              |
     | password      |      |                              |
     | grant_type    |      | client_credentials等四种模式 |
     | scope         |      |                              |
     | client_id     |      | client_auth_resource         |
     | client_secret |      |                              |

   - 响应体

     ```
     {
         "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJzZXJ2ZXIiXSwiZXhwIjoxNTUwNDc2MzYxLCJhdXRob3JpdGllcyI6WyJvYXV0aDIiXSwianRpIjoiZjRhMWEzNWMtZjZlMS00NTg4LTg4NWQtYmQyZTA5MDU0MDFmIiwiY2xpZW50X2lkIjoiY2xpZW50X2F1dGhfcmVzb3VyY2UifQ.GDUIHQmR8zNJ-6e0znaS4rsukaaNSpX-vlKRuS40_eZftOilc2UC2M_-1MDxx_5OyDUfuPpBh7ST_04tOF9Mls96XmJb6E5YeK5jnyiULC83dc4M7UOdIch8CTiYZK10U1DDo6-0yfKquwEXoiacosEy4ySc7EvNhEo0tzaCFXMxSs7GapcZgbGSAADu_Iuzx3zgiFi1IhBh_Btsi7PW7Rm8ZHvT5PVlIm5_TwdIlXBgNNijTq-RVHtUS57utDZambX7o6X02k061z1PFkRj_LdTnR1RuVh0YGQl4LM3trASiZoXMQiCVU7kLhZBQjdubyBeEQ3VNNgLj5ZXXTeNZA",
         "token_type": "bearer",
         "expires_in": 3599,
         "scope": "server",
         "jti": "f4a1a35c-f6e1-4588-885d-bd2e0905401f"
     }
     ```



#### 不同网站跨域问题





#### 用户权限思考

##### 问题

- 多个网站权限统一管理. 



- 前端用户 	只有登录权限
- 后端用户    	可以登录.  可以设置不同权限
- 网关层	拦截所有用户登录权限
- 业务层	对用户权限做二次拦截

##### 思路 

1. gateway中做初步拦截 . 
2. 在业务层 注解方式做细粒度拦截



1. 如何控制用户权限