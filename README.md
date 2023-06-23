# Minecraft Log Viewer

一个易于使用的 Minecraft 日志查看器 (以下简称 `MCLV` )，支持各种各样的日志文件，运行于 Kotlin/JVM 平台，使用 Compose for Desktop 构建 UI 界面。

## 如何使用

### 下载

在以下任意渠道下载 JAR 文件：

- [GitHub Releases](https://github.com/ruattd/mclv/releases/latest)

目前只有 Windows 平台的 JAR 文件。

想要其他平台？[自己构建](#手动构建)或者去找喷气脑子要吧，Compose Multiplatform 这个垃圾只支持打包当前平台可用的 JAR ......

### 安装运行环境

MCLV 基于 JDK 17.0.2 和 Kotlin 1.8.20 开发，因此你需要安装 **17 或以上版本** 的 Java 运行环境，已经安装过的用户可以跳过这一步。

你既可以安装单独的 JRE 也可以直接使用 JDK 自带的运行环境，以下列出一些可用的 OpenJDK 发行版：

- [Amazon Corretto](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- [Microsoft Build of OpenJDK](https://learn.microsoft.com/zh-cn/java/openjdk/download#openjdk-17)
- [Eclipse Temurin](https://adoptium.net/zh-CN/temurin/releases/)
- [Azul Zulu](https://www.azul.com/downloads/?version=java-17-lts)
- [Red Hat build of OpenJDK](https://developers.redhat.com/products/openjdk/download)

*使用前两种 OpenJDK 发行版能让运行环境相关的反馈更快得到处理，因为软件开发者只使用前两种，但是 MCLV 会尽可能做到与平台完全无关*

### 运行

在 JAR 文件所在目录使用以下命令运行：

```shell
java -jar MCLV-XXX.jar
```

*对于 Windows 系统，大多数 OpenJDK 发行版的安装程序会自动为 JAR 文件创建文件关联，只需要双击即可运行。*

## 手动构建

首先需要在本地安装 **JDK 17 或以上版本** 和 **Git** ，各大平台的安装方法各不相同，这里就不逐个列举了。

```shell
git clone https://github.com/ruattd/mclv.git
cd mclv
./gradlew packageReleaseUberJarForCurrentOS
```

建议在非中国大陆网络环境下执行构建。如果一切顺利，构建结束后你可以在 `./build/compose/jars` 中找到输出的 JAR 文件。

*如果你不会构建、不会装环境或者遇到了找不到输出文件之类的问题，有一个不知道算不算是更简单的办法，下载安装最新版 [IntelliJ IDEA](https://www.jetbrains.com/idea/) 然后打开项目找到 `src/jvmMain/kotlin/io/github/ruattd/mclv/Main.kt` ，直接点击里面的运行按钮。*

## 依赖库及资源引用

*此表中许可证名称不代表真实内容*

| 名称 | 类型 | 许可证 |
|---|---|---|
| [Kotlin Standard Library](https://kotlinlang.org/) | 依赖库 | [Apache License 2.0](https://github.com/JetBrains/kotlin/blob/master/license/LICENSE.txt) |
| [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines) | 依赖库 | [Apache License 2.0](https://github.com/Kotlin/kotlinx.coroutines/blob/master/LICENSE.txt) |
| [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization) | 依赖库 | [Apache License 2.0](https://github.com/Kotlin/kotlinx.serialization/blob/master/LICENSE.txt) |
| [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform) | 依赖库 | [Apache License 2.0](https://github.com/JetBrains/compose-multiplatform/blob/master/LICENSE.txt) |
| [Skiko](https://github.com/JetBrains/skiko) | 依赖库 | [Apache License 2.0](https://github.com/JetBrains/skiko/blob/master/LICENSE) |
| [PreCompose](https://github.com/Tlaster/PreCompose) | 依赖库 | [MIT License](https://github.com/Tlaster/PreCompose/blob/master/LICENSE) |
| [Faithful x64 Java Edition](https://github.com/Faithful-Resource-Pack/Faithful-Java-64x/) | 图片资源 | [Faithful License](https://github.com/Faithful-Resource-Pack/Faithful-Java-64x/blob/main/LICENSE.txt) |

## 源代码许可

项目源代码基于 [GNU Public License 3.0](https://github.com/ruattd/mclv/blob/main/LICENSE) 开源，个体开发者打不起版权仗，还请各位引用者自觉遵守许可。

## 贡献代码

MCLV 欢迎任何人做出贡献，但提交代码时请注意以下几点：

- 请勿包含任何与项目源代码无关的文件及引用 (比如各大 IDE 的配置文件、构建缓存等)
- MCLV 只接受开源的引用，引用新的资源和依赖库时请注意其是否开源，以及开源许可是否与项目许可证冲突
- **不要把 test 源提交上来**
