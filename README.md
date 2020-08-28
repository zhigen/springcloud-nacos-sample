简体中文 | [English](/README.en-US.md)

# springcloud-nacos-sample
使用springcloud框架的java父项目，使用nacos注册中心，测试nacos用法

![logo](https://raw.githubusercontent.com/zhigen/specification-document/master/static/logo.png "logo tip")

[![badge](https://img.shields.io/badge/license-WTFPL-blue)](http://www.wtfpl.net/)

# 目录
* [1. 项目背景](#1)
* [2. 使用](#2)
* [3. 相关项目](#3)
* [4. 维护者](#4)
* [5. 贡献](#5)
* [6. 开源协议](#6)

<a id="1"></a>
## 1. 项目背景
记录并分享个人在开发过程中，使用到的技术的用法与示例。

<a id="2"></a>
## 2. 使用
* 启动nacos、mysql、seata

        $ docker run --name nacos -d -p 8848:8848 --env MODE=standalone nacos/nacos-server:1.3.2
        $ docker run --name mysql -d -p 3306:3306 -v /e/data/docker/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 mysql:8
        $ docker run --name seata -p 8091:8091 -e SEATA_CONFIG_NAME=file:/root/seata-config/registry -v /e/data/docker/seata/conf:/root/seata-config seataio/seata-server:1.3.0

* 依次启动服务
* 访问http://localhost:9002

<a id="3"></a>
## 3. 相关项目
[specification-document](https://github.com/zhigen/specification-document)<br/>
[springcloud-dubbo-sample](https://github.com/zhigen/springcloud-dubbo-sample)<br/>
[springboot-dynamic-datasource-sample](https://github.com/zhigen/springboot-dynamic-datasource-sample)<br/>

<a id="4"></a>
## 4. 维护者
[@zhigen](https://github.com/zhigen)

<a id="5"></a>
## 5. 贡献
[Pull Request](https://github.com/zhigen/springcloud-nacos-sample/pulls)

<a id="6"></a>
## 6. 许可证
[WTFPL](/LICENSE) © Lu Zhigen