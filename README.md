本项目是基于Spring Cloud的注册中心、资源中心、服务提供中心进行的项目
整合了Mybatis框架，使用数据库连接池Druid。

# 项目结构
kk-julian
|-- kk-config-conter 2080 资源配置中心 
|-- kk-config-repo 资源存放地址
|-- kk-eureka-center 1080 服务注册中心
|-- kk-service 业务中心
|   |-- kk-component 9080 第三方业务


# 项目其运行步骤
1.执行db文件文件中的sql
2.修改kk-config-conter中的数据库链接的用户名和密码
3.按一下步骤启动
```
kk-eureka-center > kk-config-conter >  kk-component >
```
