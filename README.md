# spring-nacos-demo

没有什么业务 仅为一个学习demo

nacos 配置中心

nacos 注册中心

nacos + openfeign 服务调用


## 项目使用
1. 在本地下载一个 nacos 启动 （端口默认 8848）
2. 本地将 user 和 fm 服务启动
3. 登录 http://127.0.0.1:8848/nacos/
 
   默认账号密码 nacos: nacos
   
### 配置中心使用
1. nacos 管理平台 配置列表页面 新增两个配置
  - fm-service-dev.yaml DEFAULT_GROUP
  - user-service-dev.yaml DEFAULT_GROUP
 
 并将content 设置 username: night
 
分别访问 http://127.0.0.1:10039/getUser 、 http://127.0.0.1:10040/getUser
获取内容不为null 则成功


### 注册中心使用
配置正确的情况下 nacos 管理平台 服务列表下会展示 注册成功的服务

### spring 项目正常使用

#### 服务正常调用
 http://127.0.0.1:10040/api/v1/fm/detail/
#### openfeign调用
 http://127.0.0.1:10039/api/v1/user/login/